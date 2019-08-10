package com.freight.shipper.repository

import androidx.lifecycle.MediatorLiveData
import com.freight.shipper.core.persistence.network.client.server.MeuralAPIContract
import com.freight.shipper.core.persistence.network.dispatchers.DispatcherProvider
import com.freight.shipper.core.persistence.network.dispatchers.DispatcherProviderImpl
import com.freight.shipper.core.persistence.network.result.APIResult
import com.freight.shipper.core.persistence.preference.LoginManager
import com.freight.shipper.extensions.BaseRepository
import com.freight.shipper.model.User
import com.freight.shipper.ui.authentication.signup.CompanySignup
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber


/**
 * @CreatedBy Sanjay Kushwah on 8/4/2019.
 * sanjaykushwah0601@gmail.com
 */
class AuthenticationRepository(
    private val api: MeuralAPIContract,
    private val loginManager: LoginManager,
    val dispatcher: DispatcherProvider = DispatcherProviderImpl()
) : BaseRepository() {

    suspend fun login(email: String, password: String): APIResult<User> {
        return api.login(email, password)
    }

    suspend fun companySignup(model: CompanySignup): APIResult<User> {
        return api.signupAsCompany(model)
    }

    fun forgotPassword(email: String, observer: Pair<MediatorLiveData<User>, MediatorLiveData<String>>) {
        val (success, failure) = setupObserver(observer)
        GlobalScope.launch(dispatcher.io) {
            val result = api.forgotPassword(email)
            withContext(dispatcher.main) {
                when (result) {
                    is APIResult.Success -> {
                        Timber.e("Success Sanjay: ${result.response}")
                        success.value = result.response.data
                    }
                    is APIResult.Failure -> {
                        Timber.e("Failure Sanjay: ${result.error}")
                        failure.value = result.error?.message ?: ""
                    }
                }
            }
        }
    }

    fun saveLoginUser(user: User) {
        loginManager.loggedInUser = user
    }

    fun saveToken(token: String) {
        loginManager.setToken(token)
    }
}
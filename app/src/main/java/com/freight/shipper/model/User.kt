package com.freight.shipper.model

import com.google.gson.annotations.SerializedName


/**
 * @CreatedBy Sanjay Kushwah on 8/4/2019.
 * sanjaykushwah0601@gmail.com
 */
class User {
    @SerializedName("user_id")
    var userId: Long? = null
    @SerializedName("apnstoken")
    var apnstoken: String? = null
    @SerializedName("session_token")
    var sessionToken: String = ""
    @SerializedName("address")
    var address: String? = null
    @SerializedName("city")
    var city: String? = null
    @SerializedName("company_name")
    var companyName: String? = null
    @SerializedName("created_date")
    var createdDate: String? = null
    @SerializedName("email")
    var email: String? = null
    @SerializedName("finder_id")
    var finderId: String? = null
    @SerializedName("first_name")
    var firstName: String? = null
    @SerializedName("last_name")
    var lastName: String? = null
    @SerializedName("logo")
    var logo: String? = null
    @SerializedName("phone")
    var phone: String? = null
    @SerializedName("postal_code")
    var postalCode: String? = null
    @SerializedName("reset_code")
    var resetCode: Any? = null
    @SerializedName("role_code")
    var roleCode: String? = null
    @SerializedName("role_codes")
    var roleCodes: String? = null
    @SerializedName("role_id")
    var roleId: String? = null
    @SerializedName("role_ids")
    var roleIds: String? = null
    @SerializedName("shipper_id")
    var shipperId: Any? = null
    @SerializedName("state")
    var state: String? = null
    @SerializedName("updated_by")
    var updatedBy: Any? = null
    @SerializedName("updated_date")
    var updatedDate: String? = null
}

/*"""{"responseCode":true,"responseMsg":"success",
"responseData":{"user_id":"8","first_name":"a","last_name":"b","email":"ss@gmail.com","phone":"","state":"","city":"","postal_code":"","address":"","created_date":"2019-08-06 17:56:08","updated_date":"0000-00-00 00:00:00","updated_by":null,"session_token":6449404864,"apnstoken":"","reset_code":null,"company_name":"","logo":"","role_id":"3","role_code":"individual_shipper","role_ids":"3","role_codes":"individual_shipper","finder_id":"14","shipper_id":null}}"""
        */
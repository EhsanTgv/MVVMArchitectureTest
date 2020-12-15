package com.taghavi.mvvmarchitecture.data.repository

import com.taghavi.mvvmarchitecture.data.api.ApiHelper
import com.taghavi.mvvmarchitecture.data.models.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}
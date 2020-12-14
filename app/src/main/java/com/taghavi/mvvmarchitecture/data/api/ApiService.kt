package com.taghavi.mvvmarchitecture.data.api

import com.taghavi.mvvmarchitecture.data.models.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}
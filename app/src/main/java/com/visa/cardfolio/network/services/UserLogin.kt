package com.visa.cardfolio.network.services

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.visa.cardfolio.network.model.UserLoginInfo

object UserLoginService {

    fun getUserLoginInfo(context: Context): UserLoginInfo {
        val data = context.assets.open("user_login.json")
            .bufferedReader().use {
                it.readText()
            }
        val gson = Gson()
        return gson.fromJson(
            data,
            object : TypeToken<UserLoginInfo>() {}.type
        )
    }

}
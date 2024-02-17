package com.visa.cardfolio.network.model

data class UserLoginInfo(
    val userName: String,
    val password: String,
    val firstName: String,
    val lastName: String
)
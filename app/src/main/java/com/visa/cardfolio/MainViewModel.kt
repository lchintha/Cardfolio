package com.visa.cardfolio

import android.app.Application
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.visa.cardfolio.network.model.UserLoginInfo
import com.visa.cardfolio.network.services.UserLoginService

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val screenLoading = mutableStateOf(false)

    val observeUserInfo: LiveData<UserLoginInfo> get() = _observeUserInfo
    private val _observeUserInfo = MutableLiveData<UserLoginInfo>()

    fun getUserInfo() {
        screenLoading.value = true
        val userLoginInfo = UserLoginService.getUserLoginInfo(getApplication())
        _observeUserInfo.postValue(
            userLoginInfo
        )
        screenLoading.value = false
    }

}
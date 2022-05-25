package com.utn.cookingapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utn.cookingapp.entities.UserRepository

class LoginViewModel : ViewModel() {

    private val userRepository: UserRepository = UserRepository()

    val user = MutableLiveData<String>()
    val pass = MutableLiveData<String>()
    val navigate = MutableLiveData<Boolean>()

    fun login(){
        val userLogged = user.value
        val passLogged = pass.value

        //Load user from list
        var userAux = userRepository.usrList.find { it.user == userLogged }

        //Login check logic
        when{
            userAux == null -> navigate.value = false//User failed

            userAux?.pass == passLogged -> navigate.value = true//User OK

            else -> navigate.value = false//Pass failed
        }
    }
}
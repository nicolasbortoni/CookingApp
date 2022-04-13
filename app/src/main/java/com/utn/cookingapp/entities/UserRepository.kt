package com.utn.cookingapp.entities

class UserRepository {
    var usrList : MutableList<User> = mutableListOf()

    init {
        usrList.add(User("nicobortoni","1234"))
        usrList.add(User("ailuugolini","1234"))
        usrList.add(User("juanreiszer","1234"))
    }
}
package com.example.sportlandapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    private val _email = MutableLiveData<String>("")
    val email: LiveData<String> = _email

}
package com.example.userapp.ui.screens.user_list

import com.example.userapp.data.data_sources.network.model.User
import java.lang.Exception

sealed class UserListUiState {
    data class Success(val userList : List<User>) : UserListUiState()
    data class Error (val exception: Exception) : UserListUiState()
}
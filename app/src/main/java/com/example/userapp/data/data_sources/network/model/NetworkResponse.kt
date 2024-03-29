package com.example.userapp.data.data_sources.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkResponse(
    val results: List<UserDto>,
    val info: InfoDto
)
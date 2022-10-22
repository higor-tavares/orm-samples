package com.higortavares.ormsamples.adapter.web.request

import com.higortavares.ormsamples.domain.model.User

data class SaveUserRequest(
    val username: String,
    val password: String,
    val email: String
) {

    fun toModel() : User {
            return User(null, this.username, this.password, this.email)
    }
}
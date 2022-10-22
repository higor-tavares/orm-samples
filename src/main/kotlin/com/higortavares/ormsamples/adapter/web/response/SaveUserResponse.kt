package com.higortavares.ormsamples.adapter.web.response

import com.higortavares.ormsamples.domain.model.User

data class SaveUserResponse(
    val id: Long?,
    val username: String,
    val email: String,
    val password: String?
)
{
    companion object
    {
        operator fun invoke(user: User): SaveUserResponse
        {
            return SaveUserResponse(user.id, user.username, user.email, user.password)
        }
    }
}
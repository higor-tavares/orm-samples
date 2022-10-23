package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.User

interface PersistencePort {

    fun save(user : User) : User

    fun getFirst() : List<User>
}
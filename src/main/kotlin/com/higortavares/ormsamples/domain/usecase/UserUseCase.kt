package com.higortavares.ormsamples.domain.usecase

import com.higortavares.ormsamples.adapter.persistence.PersistencePort
import com.higortavares.ormsamples.domain.model.User
import org.springframework.stereotype.Service

@Service
class UserUseCase(private val persistencePort: PersistencePort) {
    fun save(user: User) : User {
        return persistencePort.save(user)
    }
    fun getFirst() : List<User> {
        return persistencePort.getFirst()
    }
}
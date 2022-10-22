package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.User
import org.springframework.stereotype.Component

@Component
class PersistenceAdapter(private val persistenceRepository: PersistenceRepository): PersistencePort {

    override fun save(user: User): User {
       return persistenceRepository.save(user);
    }
}
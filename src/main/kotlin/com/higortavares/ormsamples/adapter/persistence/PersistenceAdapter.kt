package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.User
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component


@Component
class PersistenceAdapter(private val persistenceRepository: PersistenceRepository): PersistencePort {

    override fun save(user: User): User {
       return persistenceRepository.save(user);
    }

    override fun getFirst(): List<User> {
        val pageable: Pageable = PageRequest.of(0, 1)
        return persistenceRepository.findAll(pageable).toList()
    }
}
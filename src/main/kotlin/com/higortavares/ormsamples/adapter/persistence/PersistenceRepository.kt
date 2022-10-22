package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersistenceRepository : JpaRepository<User, Int> {
}
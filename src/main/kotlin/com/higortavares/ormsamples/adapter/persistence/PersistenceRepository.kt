package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PersistenceRepository : PagingAndSortingRepository<User, Int> {

    override fun findAll(pageable: Pageable) : Page<User>
}
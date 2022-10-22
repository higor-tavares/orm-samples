package com.higortavares.ormsamples.domain.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
@Table(name="users")
data class User(
    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "user_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "userSeq", strategy = GenerationType.SEQUENCE)
    val id: Long?,
    val username: String,
    val password: String?,
    val email: String
)
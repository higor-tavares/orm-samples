package com.higortavares.ormsamples.domain.model

import java.time.LocalDate

data class Student(
    val id: Long,
    val name: String,
    val email: String?,
    val phone: String?,
    val birthday: LocalDate
)
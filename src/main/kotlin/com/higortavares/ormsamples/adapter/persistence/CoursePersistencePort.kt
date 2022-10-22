package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.Course

interface CoursePersistencePort {
    fun save(course: Course) : Course
    fun findAll() : List<Course>
    fun findById(id: Long) : Course?
}
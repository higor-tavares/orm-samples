package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface CourseRepository: JpaRepository<Course, Long> {
}
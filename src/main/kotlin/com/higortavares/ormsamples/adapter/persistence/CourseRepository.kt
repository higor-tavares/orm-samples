package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository

interface CourseRepository: JpaRepository<Course, Long> {
    @Query("from Course where id in (:requirements)")
    fun findCoursesIn(@Param("requirements") requirements: List<Long>) : List<Course>
}
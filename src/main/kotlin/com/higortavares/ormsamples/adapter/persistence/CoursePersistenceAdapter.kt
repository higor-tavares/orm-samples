package com.higortavares.ormsamples.adapter.persistence

import com.higortavares.ormsamples.domain.model.Course
import org.springframework.stereotype.Component

@Component
class CoursePersistenceAdapter(private val courseRepository: CourseRepository): CoursePersistencePort {

    override fun save(course: Course): Course {
        return courseRepository.save(course)
    }

    override fun findAll(): List<Course> {
        return courseRepository.findAll()
    }
    override fun findById(id: Long) : Course {
        return courseRepository.findById(id).get()
    }

    override fun findCoursesIn(requirements: List<Long>): List<Course> {
       return courseRepository.findCoursesIn(requirements)
    }
}
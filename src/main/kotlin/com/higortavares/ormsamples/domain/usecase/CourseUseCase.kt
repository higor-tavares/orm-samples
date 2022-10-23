package com.higortavares.ormsamples.domain.usecase

import com.higortavares.ormsamples.adapter.persistence.CoursePersistenceAdapter
import com.higortavares.ormsamples.adapter.web.request.SaveCourseRequest
import com.higortavares.ormsamples.domain.model.Course
import org.springframework.stereotype.Service

@Service
class CourseUseCase(private val coursePersistenceAdapter: CoursePersistenceAdapter){

    fun save(course: SaveCourseRequest) : Course{
        var requirements: List<Course> = emptyList()
        course.requirements?.let {
            requirements = coursePersistenceAdapter.findCoursesIn(course.requirements)
        }
        val courseEntity = course.toModel(requirements);
        return coursePersistenceAdapter.save(courseEntity)
    }

    fun findAll() : List<Course> {
        return coursePersistenceAdapter.findAll();
    }
}
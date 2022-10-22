package com.higortavares.ormsamples.adapter.web.request

import com.higortavares.ormsamples.domain.model.Course

data class SaveCourseRequest(
    val name: String,
    val duration: Int = 20,
    val requirements: List<Long>? = emptyList()
)
{
    fun toModel(courses: List<Course>? = emptyList()) : Course{
        return Course(null, name, duration, courses!!);
    }
}
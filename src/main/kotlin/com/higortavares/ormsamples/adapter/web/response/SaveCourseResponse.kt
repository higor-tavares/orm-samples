package com.higortavares.ormsamples.adapter.web.response

import com.higortavares.ormsamples.domain.model.Course

data class SaveCourseResponse(
    val id: Long,
    val name: String,
    val duration: Int,
    val requirements : List<String>
)
{
    companion object{
        operator fun invoke(course: Course) : SaveCourseResponse{
            return SaveCourseResponse(course.id!!,
                course.name,
                course.duration,
                course.requirements.map { it.name })
        }
    }
}
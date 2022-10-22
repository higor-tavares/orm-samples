package com.higortavares.ormsamples.adapter.web.controllers

import com.higortavares.ormsamples.adapter.web.request.SaveCourseRequest
import com.higortavares.ormsamples.adapter.web.response.SaveCourseResponse
import com.higortavares.ormsamples.domain.usecase.CourseUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("courses")
class CourseController(private val courseUseCase: CourseUseCase) {

    @PostMapping("/")
    fun save(@RequestBody course: SaveCourseRequest) : ResponseEntity<SaveCourseResponse> {
        return ResponseEntity.status(HttpStatus.CREATED).body(SaveCourseResponse(courseUseCase.save(course)))
    }
}
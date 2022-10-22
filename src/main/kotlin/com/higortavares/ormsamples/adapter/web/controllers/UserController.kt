package com.higortavares.ormsamples.adapter.web.controllers

import com.higortavares.ormsamples.adapter.web.response.SaveUserResponse
import com.higortavares.ormsamples.domain.model.User
import com.higortavares.ormsamples.domain.usecase.UserUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(private val userUseCase: UserUseCase) {

    @PostMapping("/")
    fun save(@RequestBody user: User) : ResponseEntity<SaveUserResponse>{
        val createdUser = userUseCase.save(user)
        return ResponseEntity.status(HttpStatus.CREATED).body(SaveUserResponse(createdUser))
    }
}
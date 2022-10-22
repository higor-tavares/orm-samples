package com.higortavares.ormsamples

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class OrmSamplesApplication

fun main(args: Array<String>) {
	runApplication<OrmSamplesApplication>(*args)
}

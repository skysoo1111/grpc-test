package com.spring.grpctest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcTestApplication

fun main(args: Array<String>) {
    runApplication<GrpcTestApplication>(*args)
}

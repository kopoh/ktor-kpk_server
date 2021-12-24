package com.plcoding.routes

import com.plcoding.data.model.*

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

private var timeTable = listOf(
    GroupTable(1,
        arrayListOf(
            DayTable(1,7,
                arrayListOf(
                    TimeTable(1,  "ХУКО-021-20", "Фика Турицин", "ШИЗИКА", "260"),
                    TimeTable(2,  "ХУКО-021-20", "Фика Турицин", "ШИЗИКА", "260"),
                    TimeTable(3,  "ХУКО-021-20", "Фика Турицин", "ШИЗИКА", "260"),
                    TimeTable(4,  "ХУКО-021-20", "Фика Турицин", "ШИЗИКА", "260"),
                    TimeTable(5,  "ХУКО-021-20", "Фика Турицин", "ШИЗИКА", "260"),
                    TimeTable(6,  "ХУКО-021-20", "Фика Турицин", "ШИЗИКА", "260")
                )),
        )
    ),
)

fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
            HttpStatusCode.OK,
            timeTable
        )
    }
}

fun Route.randomTimeTable(){
    post("/randomTimeTable") {
        val requestBody = call.receiveText()
        println("received $requestBody")
        call.respond(timeTable)
    }
}

fun Route.login() {
    post("/login") {
        val loginRequest = call.receive<LoginRequest>()

        if (loginRequest.username == "Tumanov"
            && loginRequest.password == "test123456789"
        ) {
            call.respond(
                LoginResponse(true, "Login successful!")
            )
        } else {
            call.respond(
                LoginResponse(false, "Invalid password!")
            )
        }
    }
}

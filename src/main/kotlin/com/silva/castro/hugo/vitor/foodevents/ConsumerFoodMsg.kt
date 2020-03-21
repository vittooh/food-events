package com.silva.castro.hugo.vitor.foodevents

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink

@EnableBinding(Sink::class)
class ConsumerFoodMsg {

    @StreamListener(Sink.INPUT)
    fun reciveMsg(msg: String) {
        println("Default delivery nos vamos comer  ::: $msg !!")
    }
}
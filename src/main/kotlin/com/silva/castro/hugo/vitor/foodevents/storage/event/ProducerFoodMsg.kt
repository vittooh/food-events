package com.silva.castro.hugo.vitor.foodevents.storage.event

import org.springframework.cloud.stream.annotation.EnableBinding

@EnableBinding(FoodStorageSource::class)
class ProducerFoodStorage
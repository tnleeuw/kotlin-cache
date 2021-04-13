package com.pavleprica.kotlin.cache

import java.util.*

interface Cache<T, E> {

    val size: Long

    operator fun set(key: T, value: E)

    operator fun get(key: T): Optional<E>

    fun remove(key: T)

    fun clear()

}
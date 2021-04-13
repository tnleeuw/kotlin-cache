package com.pavleprica.kotlin.cache.time.based

/**
 * [CustomTimeBasedValue] is used to add a custom expiration time
 * not influencing the default value.
 *
 * @property value the value to add
 * @property expirationTime the expiration time of the value
 */
data class CustomTimeBasedValue<E>(
    val value: E,
    val expirationTime: Long,
)

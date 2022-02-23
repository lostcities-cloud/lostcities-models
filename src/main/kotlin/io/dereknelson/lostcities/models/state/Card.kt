package io.dereknelson.lostcities.models.state

import com.fasterxml.jackson.annotation.JsonIgnore

data class Card(
    @JsonIgnore
    val cardNumber: Int = 0,
    val color: Color,
    val value: Int,
    val isMultiplier: Boolean = false,
) {
    val id: String get() = "$color($cardNumber)-$value"
}

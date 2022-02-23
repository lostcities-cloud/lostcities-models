package io.dereknelson.lostcities.models.state

data class Card(
    val cardNumber: Int,
    val color: Color,
    val value: Int,
    val isMultiplier: Boolean = false,
) {
    val id: String get() = "$color($cardNumber)-$value"
}

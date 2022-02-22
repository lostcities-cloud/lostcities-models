package io.dereknelson.lostcities.models.matches

import io.dereknelson.lostcities.models.Color

data class PlayerEvent(
    val game: Long,
    val player: String,
    val type: PlayerEventType,
    val card: String?,
    val color: Color?
)
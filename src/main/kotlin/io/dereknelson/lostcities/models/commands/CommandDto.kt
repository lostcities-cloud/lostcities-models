package io.dereknelson.lostcities.models.commands

import io.dereknelson.lostcities.models.state.Color
import java.time.LocalDateTime

/**
 *  Events
 Play: {type: "play", card: "${card}", user: ${user}}
 Discard: {type: "discard", card: "${card}", user: ${user}}
 Draw From Deck: {type: "draw", user: ${user}}
 Draw From Deck: {type: "draw", color: "YELLOW", user: ${user}}
 */

data class CommandDto(
    val type: CommandType,
    val card: String?,
    val color: Color?,
    val player: String? = null,
    val received: LocalDateTime? = null,
)

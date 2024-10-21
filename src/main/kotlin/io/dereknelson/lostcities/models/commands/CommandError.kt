package io.dereknelson.lostcities.models.commands

data class CommandError(
    val id: Long,
    val player: String,
    val command: CommandDto,
    val error: String,
)

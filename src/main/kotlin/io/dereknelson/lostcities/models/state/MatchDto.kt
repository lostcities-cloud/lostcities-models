package io.dereknelson.lostcities.models.state


class MatchDto(
    val id: Long? = null,
    val players: UserPair,
    val currentPlayer: String? = null,

    val isReady: Boolean = false,
    val isStarted: Boolean = false,
    val isCompleted: Boolean = false,
)

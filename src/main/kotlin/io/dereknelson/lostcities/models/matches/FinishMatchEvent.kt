package io.dereknelson.lostcities.models.matches

import java.time.LocalDateTime

data class FinishMatchEvent(
    val id: Long,
    val scores: Map<String, Int>,
    val finishedAt: LocalDateTime,
)

package io.dereknelson.lostcities.models.matches

class TurnChangeEvent(
    val matchId: Long,
    val nextPlayer: String,
    val turns: Long,
) {
    override fun toString(): String {
        return "TurnChangeEvent(matchId=$matchId, nextPlayer='$nextPlayer', turns=$turns)"
    }
}

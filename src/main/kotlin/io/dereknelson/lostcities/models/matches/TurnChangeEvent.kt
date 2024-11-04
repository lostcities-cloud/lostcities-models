package io.dereknelson.lostcities.models.matches

class TurnChangeEvent(
    val matchId: Long,
    val nextPlayer: String,

) {
    override fun toString(): String {
        return "TurnChangeEvent(matchId=$matchId, nextPlayer='$nextPlayer')"
    }
}

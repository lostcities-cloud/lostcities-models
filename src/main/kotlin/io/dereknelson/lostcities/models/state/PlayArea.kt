package io.dereknelson.lostcities.models.state

import com.fasterxml.jackson.annotation.JsonProperty


class PlayArea {
    @JsonProperty
    private val board: Map<Color, MutableList<Card>> = Color.values()
        .associateWith { mutableListOf() }

    fun get(color: Color) : MutableList<Card> {
        return board[color]!!
    }

    fun add(card: Card) {
        get(card.color).add(card)
    }

    fun peak(color: Color) : Card? {
        return if(isEmpty(color)) {
            null
        } else {
            get(color).last()
        }
    }

    fun isEmpty(color : Color) : Boolean {
        return board[color]?.isEmpty()!!
    }
}
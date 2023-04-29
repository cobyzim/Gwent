package com.personal.gwent.model.gameboard.deck;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.personal.gwent.model.gameboard.cards.Faction;

@Entity
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(nullable = false)
    private Faction faction;

    @NotBlank
    @Column(nullable = false)
    private Integer numCards;

    @NotBlank
    @Column(nullable = false)
    private Integer numCardsSpecial;

    @NotBlank
    @Column(nullable = false)
    private Integer leaderCardId;

    public Deck() {
        
    }

    public Deck(@NotBlank Faction faction, @NotBlank Integer numCards, @NotBlank Integer numCardsSpecial,
            @NotBlank Integer leaderCardId) {
        this.faction = faction;
        this.numCards = numCards;
        this.numCardsSpecial = numCardsSpecial;
        this.leaderCardId = leaderCardId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((faction == null) ? 0 : faction.hashCode());
        result = prime * result + ((numCards == null) ? 0 : numCards.hashCode());
        result = prime * result + ((numCardsSpecial == null) ? 0 : numCardsSpecial.hashCode());
        result = prime * result + ((leaderCardId == null) ? 0 : leaderCardId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Deck other = (Deck) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (faction != other.faction)
            return false;
        if (numCards == null) {
            if (other.numCards != null)
                return false;
        } else if (!numCards.equals(other.numCards))
            return false;
        if (numCardsSpecial == null) {
            if (other.numCardsSpecial != null)
                return false;
        } else if (!numCardsSpecial.equals(other.numCardsSpecial))
            return false;
        if (leaderCardId == null) {
            if (other.leaderCardId != null)
                return false;
        } else if (!leaderCardId.equals(other.leaderCardId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Deck [id=" + id + ", faction=" + faction + ", numCards=" + numCards + ", numCardsSpecial="
                + numCardsSpecial + ", leaderCardId=" + leaderCardId + "]";
    }
    
}

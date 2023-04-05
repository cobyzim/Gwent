package com.personal.gwent.model.gameboard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Entity
public class Unit extends Card {
    
    @Column(nullable = false)
    private Integer strength;

    @Enumerated(value = EnumType.STRING)
    private Range range;

    @Enumerated(value = EnumType.STRING)
    private SpecialAbility ability;

    @Enumerated(value = EnumType.STRING)
    private Faction faction;

    public Unit() {

    }

    public Unit(@NotBlank String name, @NotBlank String quote, Integer strength, Range range, SpecialAbility ability,
            Faction faction) {
        super(name, quote);
        this.strength = strength;
        this.range = range;
        this.ability = ability;
        this.faction = faction;
    }

    


}

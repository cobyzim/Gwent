package com.personal.gwent.model.gameboard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Entity
public class Unit extends Card {
    
    @NotBlank
    @Column(nullable = false)
    private Integer strength;

    @NotBlank
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Range range;

    @NotBlank
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private SpecialAbility ability;

    @NotBlank
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Faction faction;

    public Unit() {

    }

    public Unit(@NotBlank String name, @NotBlank String quote, @NotBlank Integer strength, @NotBlank Range range, @NotBlank SpecialAbility ability,
            @NotBlank Faction faction) {
        super(name, quote);
        this.strength = strength;
        this.range = range;
        this.ability = ability;
        this.faction = faction;
    }

    


}

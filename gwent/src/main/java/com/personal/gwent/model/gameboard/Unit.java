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
    @Column(nullable = false, name = "unit_range")
    private Range range;

    @Enumerated(value = EnumType.STRING)
    @Column()
    private SpecialAbility specialAbility;

    @Enumerated(value = EnumType.STRING)
    @Column()
    private Faction faction;

    public Unit() {

    }

    public Unit(@NotBlank String name, @NotBlank String quote, @NotBlank Integer strength, @NotBlank Range range, SpecialAbility specialAbility,
            Faction faction) {
        super(name, quote);
        this.strength = strength;
        this.range = range;
        this.specialAbility = specialAbility;
        this.faction = faction;
    }

    


}

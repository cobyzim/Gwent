package com.personal.gwent.model.gameboard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Entity
public class Leader extends Card {
    
    @NotBlank
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Faction faction;

    @NotBlank
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private LeaderAbility ability;

    public Leader() {

    }

    public Leader(@NotBlank String name, @NotBlank String quote, @NotBlank Faction faction, @NotBlank LeaderAbility ability) {
        super(name, quote);
        this.faction = faction;
        this.ability = ability;
    }

    


}

package com.personal.gwent.model.gameboard;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Entity
public class Leader extends Card {
    
    @Enumerated(value = EnumType.STRING)
    private Faction faction;

    @Enumerated(value = EnumType.STRING)
    private LeaderAbility ability;

    public Leader() {

    }

    public Leader(@NotBlank String name, @NotBlank String quote, Faction faction, LeaderAbility ability) {
        super(name, quote);
        this.faction = faction;
        this.ability = ability;
    }

    


}

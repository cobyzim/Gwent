package com.personal.gwent.model.gameboard.cards;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Special extends Card {
    
    public Special() {

    }

    public Special(@NotBlank String name, @NotBlank String quote) {
        super(name, quote);
    }

}

package com.personal.gwent.service;

import java.util.Collection;

import com.personal.gwent.model.gameboard.cards.Card;

public interface CardService {
    public abstract Collection<Card> getCards();
}

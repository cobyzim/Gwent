package com.personal.gwent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.personal.gwent.model.gameboard.cards.Card;

@NoRepositoryBean
public interface CardRepository extends JpaRepository<Card, Integer> {
    
}

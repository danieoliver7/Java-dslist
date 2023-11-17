package com.danieloliver.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.danieloliver.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    
} 
package com.danieloliver.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danieloliver.dslist.dto.GameListDto;

import com.danieloliver.dslist.entities.GameList;
import com.danieloliver.dslist.repositories.GameListRepository;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

   
    
    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
           List<GameList> result =  gameListRepository.findAll();
           List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
           return dto;
    }
}

package com.danieloliver.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danieloliver.dslist.dto.GameListDto;

import com.danieloliver.dslist.entities.GameList;
import com.danieloliver.dslist.projections.GameMinProjection;
import com.danieloliver.dslist.repositories.GameListRepository;
import com.danieloliver.dslist.repositories.GameRepository;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;
   
    
    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
           List<GameList> result =  gameListRepository.findAll();
           List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
           return dto;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex,obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for( int i = min; i < max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}

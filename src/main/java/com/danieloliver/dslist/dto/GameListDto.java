package com.danieloliver.dslist.dto;

import com.danieloliver.dslist.entities.GameList;


public class GameListDto {
    

    private Long id;
    private String name;



    public GameListDto() {
    }



    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }



    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
   
    
}

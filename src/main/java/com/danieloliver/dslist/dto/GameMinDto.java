package com.danieloliver.dslist.dto;
import com.danieloliver.dslist.entities.Game;
import com.danieloliver.dslist.projections.GameMinProjection;

public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;



    public GameMinDto() {
    }



    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDto(GameMinProjection proje) {
        id = proje.getId();
        title = proje.getTitle();
        year = proje.getGameYear();
        imgUrl = proje.getImgUrl();
        shortDescription = proje.getShortDescription();
    }



    public Long getId() {
        return this.id;
    }

  

    public String getTitle() {
        return this.title;
    }

   

    public Integer getYear() {
        return this.year;
    }

    

    public String getImgUrl() {
        return this.imgUrl;
    }

  

    public String getShortDescription() {
        return this.shortDescription;
    }

   


}

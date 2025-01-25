package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO () {
    }

    public GameMinDTO(Game Entity) {
        //this.id = Entity.getId();
        id = Entity.getId();
        this.id = Entity.getId();
        //this.title =  Entity.getTitle();
        title =  Entity.getTitle();
        //this.year = Entity.getYear();
        year = Entity.getYear();
        //this.imgUrl = Entity.getImgUrl();
        imgUrl = Entity.getImgUrl();
        //this.shortDescription = Entity.getShortDescription();
        shortDescription = Entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }    

}



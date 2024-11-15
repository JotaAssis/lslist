package com.jotaassis.lslist.dto;

import com.jotaassis.lslist.entities.Game;
import com.jotaassis.lslist.entities.GameList;

import java.util.List;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}

package com.jotaassis.lslist.controllers;

import com.jotaassis.lslist.dto.GameMinDTO;
import com.jotaassis.lslist.entities.Game;
import com.jotaassis.lslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findALl();
        return result;
    }
}

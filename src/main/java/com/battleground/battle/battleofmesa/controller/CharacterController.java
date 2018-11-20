package com.battleground.battle.battleofmesa.controller;

import com.battleground.battle.battleofmesa.BattleofmesaApplication;
import com.battleground.battle.battleofmesa.entity.Archer;
import com.battleground.battle.battleofmesa.entity.GameCharacter;
import com.battleground.battle.battleofmesa.services.ICharacterService;
import com.battleground.battle.battleofmesa.services.IGameStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    BattleofmesaApplication battleofmesaApplication;

    @Autowired
    ICharacterService characterService;

    @PostMapping(value="/gen/{name}/{characterClass}")
    public GameCharacter createCharacter(@PathParam("name") String name, @PathParam("characterClass") String characterClass)
    {
        GameCharacter gameCharacter = battleofmesaApplication.getCharacterBean(name,characterClass);
        if(gameCharacter!=null)
        {
            characterService.generateCharacter(gameCharacter);
        }
        else
        {
            gameCharacter = new Archer("Archer");
            gameCharacter.setErrorMessage("No Character Found");
        }
        return gameCharacter;
    }

}
package com.battleground.battle.battleofmesa.controller;

import com.battleground.battle.battleofmesa.entity.GameCharacter;
import com.battleground.battle.battleofmesa.services.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/inventory/")
public class InventoryController {

    @Autowired
    public IInventoryService inventoryService;

    @PutMapping(value="/pickup/{characterid}/{itemid}")
    public GameCharacter pickUp(@PathVariable("characterid") Long characterid, @PathVariable("itemid") Long itemid)
    {
        GameCharacter gameCharacter = inventoryService.pickUp(characterid,itemid);
        return gameCharacter;
    }

}

package com.battleground.battle.battleofmesa.services.implementation;

import com.battleground.battle.battleofmesa.entity.GameCharacter;
import com.battleground.battle.battleofmesa.entity.Item;
import com.battleground.battle.battleofmesa.repository.CharacterRepository;
import com.battleground.battle.battleofmesa.repository.GameStateRepository;
import com.battleground.battle.battleofmesa.services.IInventoryService;
import com.sun.deploy.util.ArrayUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryServiceImpl implements IInventoryService {

    @Autowired
    GameStateRepository gameStateRepository;

    @Autowired
    CharacterRepository characterRepository;

    @Override
    public GameCharacter pickUp(Long characterid, Long itemid) {

        GameCharacter gameCharacter = characterRepository.findById(characterid).get();
        Item item = gameStateRepository.findById(itemid).get();
        List itemList = new ArrayList<Item>();
        itemList.add(item);
        gameCharacter.setInventory((Item[]) itemList.toArray());
        return characterRepository.save(gameCharacter);
    }

    @Override
    public GameCharacter drop(Long characterid, Long itemid) {
        return null;
    }
}

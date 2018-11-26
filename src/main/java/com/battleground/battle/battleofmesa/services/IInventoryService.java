package com.battleground.battle.battleofmesa.services;

import com.battleground.battle.battleofmesa.entity.GameCharacter;

public interface IInventoryService {

    public GameCharacter pickUp(Long characterid, Long itemid);
    public GameCharacter drop (Long characterid, Long itemid);
}

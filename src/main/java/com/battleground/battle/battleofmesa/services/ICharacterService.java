package com.battleground.battle.battleofmesa.services;

import com.battleground.battle.battleofmesa.entity.GameCharacter;

public interface ICharacterService {

    public Iterable<GameCharacter> getCharacter();
    public GameCharacter generateCharacter(GameCharacter gameCharacter);

}


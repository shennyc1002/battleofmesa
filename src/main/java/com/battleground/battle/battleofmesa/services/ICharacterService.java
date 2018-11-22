package com.battleground.battle.battleofmesa.services;

import com.battleground.battle.battleofmesa.entity.GameCharacter;

import java.util.Optional;

public interface ICharacterService {

    public Iterable<GameCharacter> getAllCharacter();
    public Iterable <GameCharacter> getCharacter(String name, String characterClass);
    public GameCharacter generateCharacter(GameCharacter gameCharacter);

}


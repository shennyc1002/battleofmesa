package com.battleground.battle.battleofmesa.services.implementation;

import com.battleground.battle.battleofmesa.entity.GameCharacter;
import com.battleground.battle.battleofmesa.repository.CharacterRepository;
import com.battleground.battle.battleofmesa.services.ICharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements ICharacterService {

    private CharacterRepository characterRepository;

    @Autowired
    public CharacterServiceImpl(CharacterRepository characterRepository)
    {
        this.characterRepository = characterRepository;
    }

    @Override
    public Iterable<GameCharacter> getCharacter() {

        return characterRepository.findAll();
    }

    @Override
    public GameCharacter generateCharacter(GameCharacter gameCharacter) {

        return characterRepository.save(gameCharacter);
    }
}

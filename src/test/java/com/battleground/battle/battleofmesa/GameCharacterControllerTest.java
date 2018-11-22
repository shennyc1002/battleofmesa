package com.battleground.battle.battleofmesa;

import com.battleground.battle.battleofmesa.controller.CharacterController;
import com.battleground.battle.battleofmesa.controller.GameStateController;
import com.battleground.battle.battleofmesa.entity.GameCharacter;
import com.battleground.battle.battleofmesa.services.implementation.CharacterServiceImpl;
import com.battleground.battle.battleofmesa.services.implementation.GameStateServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class GameCharacterControllerTest {

    Logger logger = LoggerFactory.getLogger(GameCharacterControllerTest.class);

    @InjectMocks
    CharacterController characterController;

    @Mock
    CharacterServiceImpl characterService;

    @Mock
    BattleofmesaApplication battleofmesaApplication;

    @Test
    public void createCharacterObjectNotNull() throws Exception {
        GameCharacter gameCharacter = characterController.createCharacter("Garth","Warrior");
        assertNotNull(gameCharacter);
    }
}

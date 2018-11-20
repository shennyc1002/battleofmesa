package com.battleground.battle.battleofmesa;

import com.battleground.battle.battleofmesa.entity.GameCharacter;
import com.battleground.battle.battleofmesa.entity.Warrior;
import com.battleground.battle.battleofmesa.repository.CharacterRepository;
import com.battleground.battle.battleofmesa.services.implementation.CharacterServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class GameCharacterServiceTest {

    @Autowired
    BattleofmesaApplication battleofmesaApplication;

    @InjectMocks
    CharacterServiceImpl characterServiceImpl;

    @Mock
    CharacterRepository characterRepository;

    Logger logger = LoggerFactory.getLogger(GameCharacterServiceTest.class);


    @Before
    public void setup()
    {

    }
    @Test
    public void createWarriorCharacterTest()
    {
        logger.debug("Inside test");
        GameCharacter gameCharacter = new Warrior("Garth","Warrior");
        logger.debug("Warrior name is "+gameCharacter.getName());
        logger.debug("Class is "+gameCharacter.getCharacterClass());
        logger.debug("Str is "+gameCharacter.getStr());
        logger.debug("Int is "+gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getName());
        assertNotNull(gameCharacter.getCon());
        assertNotNull(gameCharacter.getCha());
        assertNotNull(gameCharacter.getDex());
        assertNotNull(gameCharacter.getCharacterClass());
        assertNotNull(gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getLocation());
        assertNotNull(gameCharacter.getStr());
        assertNotNull(gameCharacter.getWis());
    }

    @Test
    public void createWarriorCharacterNameTest()
    {
        GameCharacter gameCharacter = new Warrior("Garth","Warrior");
        assertEquals("Garth", gameCharacter.getName());
        assertEquals("Warrior",gameCharacter.getCharacterClass());
    }

    @Test
    public void createArcherCharacterTest()
    {
        logger.debug("Inside test");
        GameCharacter gameCharacter = new Warrior("Garth","Archer");
        logger.debug("Warrior name is "+gameCharacter.getName());
        logger.debug("Class is "+gameCharacter.getCharacterClass());
        logger.debug("Str is "+gameCharacter.getStr());
        logger.debug("Int is "+gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getName());
        assertNotNull(gameCharacter.getCon());
        assertNotNull(gameCharacter.getCha());
        assertNotNull(gameCharacter.getDex());
        assertNotNull(gameCharacter.getCharacterClass());
        assertNotNull(gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getLocation());
        assertNotNull(gameCharacter.getStr());
        assertNotNull(gameCharacter.getWis());
    }

    @Test
    public void createArcherCharacterNameTest()
    {
        GameCharacter gameCharacter = new Warrior("Garth","Archer");
        assertEquals("Garth", gameCharacter.getName());
        assertEquals("Archer",gameCharacter.getCharacterClass());
    }

    @Test
    public void createWizardCharacterTest()
    {
        logger.debug("Inside test");
        GameCharacter gameCharacter = new Warrior("Garth","Wizard");
        logger.debug("Warrior name is "+gameCharacter.getName());
        logger.debug("Class is "+gameCharacter.getCharacterClass());
        logger.debug("Str is "+gameCharacter.getStr());
        logger.debug("Int is "+gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getName());
        assertNotNull(gameCharacter.getCon());
        assertNotNull(gameCharacter.getCha());
        assertNotNull(gameCharacter.getDex());
        assertNotNull(gameCharacter.getCharacterClass());
        assertNotNull(gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getLocation());
        assertNotNull(gameCharacter.getStr());
        assertNotNull(gameCharacter.getWis());
    }
    @Test
    public void createWizardCharacterNameTest()
    {
        GameCharacter gameCharacter = new Warrior("Garth","Wizard");
        assertEquals("Garth", gameCharacter.getName());
        assertEquals("Wizard",gameCharacter.getCharacterClass());
    }
    @Test
    public void createRoguesCharacterTest()
    {
        logger.debug("Inside test");
        GameCharacter gameCharacter = new Warrior("Garth","Rogues");
        logger.debug("Warrior name is "+gameCharacter.getName());
        logger.debug("Class is "+gameCharacter.getCharacterClass());
        logger.debug("Str is "+gameCharacter.getStr());
        logger.debug("Int is "+gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getName());
        assertNotNull(gameCharacter.getCon());
        assertNotNull(gameCharacter.getCha());
        assertNotNull(gameCharacter.getDex());
        assertNotNull(gameCharacter.getCharacterClass());
        assertNotNull(gameCharacter.getIntValue());
        assertNotNull(gameCharacter.getLocation());
        assertNotNull(gameCharacter.getStr());
        assertNotNull(gameCharacter.getWis());
    }

    @Test
    public void createRoguesCharacterNameTest()
    {
        GameCharacter gameCharacter = new Warrior("Garth","Rogues");
        assertEquals("Garth", gameCharacter.getName());
        assertEquals("Rogues",gameCharacter.getCharacterClass());
    }
}

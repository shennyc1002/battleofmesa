package com.battleground.battle.battleofmesa;

import com.battleground.battle.battleofmesa.entity.Item;
import com.battleground.battle.battleofmesa.repository.GameStateRepository;
import com.battleground.battle.battleofmesa.services.implementation.GameStateServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class BattleOfMesaApplicationServiceTest {

    @InjectMocks
    GameStateServiceImpl gameStateService;

    @Mock
    GameStateRepository gameStateRepository;


    Logger logger = LoggerFactory.getLogger(BattleOfMesaApplicationServiceTest.class);
   /* Given An object of type  "item" with the format { "id": 1, "name": "sword" }, that is not in the data store.
    When a POST call is made to /object/create/{className}
    Then The object is registered in the data store and a 200 is returned.*/

   @Test
    public void addItemTest()
   {
       Item item = new Item("sword");
       Item expected = new Item("sword");
       logger.debug("expected is "+expected);

       when(gameStateRepository.save(item)).thenReturn(expected);
       Item actual = gameStateService.create(item);
        logger.debug("After Add ItemTest "+item.getItemName());
       assertEquals("Item object is returned after save", expected.getItemName(),actual.getItemName() );
   }

   @Test
    public void addItemTimestest()
    {
        Item item = new Item("sword");
        when(gameStateRepository.save(item)).thenReturn(item);
        gameStateService.create(item);
        verify(gameStateRepository,Mockito.times(1)).save(item);
    }

    @Test
    public void addItemMultipleTimestest()
    {
        Item item = new Item("sword");
        when(gameStateRepository.save(item)).thenReturn(item);
        gameStateService.create(item);
        gameStateService.create(item);
        gameStateService.create(item);
        verify(gameStateRepository,Mockito.times(3)).save(item);
    }

    @Test
    public void addItemNegativeTest()
    {
        Item item = new Item("sword");
        Item expected = new Item("sword");
        logger.debug("expected is "+expected);

        when(gameStateRepository.save(item)).thenReturn(new Item("dagger"));
        Item actual = gameStateService.create(item);
        logger.debug("After Add ItemTest "+item.getItemName());
        assertNotEquals("Item object is returned after save", expected.getItemName(),actual.getItemName() );
    }

    /*Given An object of type  "item" with the format { "id": 1, "name": "sword" }, that is in the data store.
    When a POST call is made to /object/create/{className}
    Then The object that has type=="item" and "id"==1 will be overwritten in the data store and a 200 is returned.
    All objects have an "id" field that holds their key value.*/

    @Test
    public void updateItemTest()
    {
        Item item = new Item("dagger");
        item.setId(1L);
        Item expected = new Item("sword");
        expected.setId(1L);
        logger.debug("expected is "+expected);
        when(gameStateRepository.save(item)).thenReturn(expected);
        Item actual = gameStateService.create(item);
        logger.debug("After Add ItemTest "+item.getItemName());
        assertEquals("Item object is returned after update", expected.getItemName(),actual.getItemName() );
    }

    /*Given An object of type  "item" with the format { "id": 1, "name": "sword" } is in the data store.
    When a GET call is made to /object/get/{className}/{id}
    Then The object is returned in json format along with a 200 code.*/

    @Test
    public void getItemTest()
    {
        Item item = new Item("sword");
        when(gameStateRepository.findById(anyLong())).thenReturn(Optional.of(item));
        gameStateService.getById(anyString(),anyLong());
        verify(gameStateRepository,times(1)).findById(anyLong());
    }

    @Test
    public void getAllItemTest()
    {
        Item item = new Item("sword");
        when(gameStateRepository.findAll()).thenReturn(new ArrayList<Item>());
        gameStateService.getAll();
        verify(gameStateRepository,times(1)).findAll();
    }


}

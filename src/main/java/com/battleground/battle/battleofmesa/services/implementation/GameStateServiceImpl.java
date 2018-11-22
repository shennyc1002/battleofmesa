package com.battleground.battle.battleofmesa.services.implementation;


import com.battleground.battle.battleofmesa.entity.Item;
import com.battleground.battle.battleofmesa.repository.GameStateRepository;
import com.battleground.battle.battleofmesa.services.IGameStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameStateServiceImpl implements IGameStateService {


    private GameStateRepository gameRepository;

    Logger logger = LoggerFactory.getLogger(GameStateServiceImpl.class);

    @Autowired
    public GameStateServiceImpl(GameStateRepository gameRepository)
    {

        this.gameRepository = gameRepository;
    }
    @Override
    public Item create(Item item) {

       logger.debug("Game repository is "+gameRepository);
       Item item1 =  gameRepository.save(item);
       logger.debug("Item is "+item1);
       return item1;
    }

    @Override
    public boolean delete(Item item) {


        try
        {
            gameRepository.delete(item);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    @Override
    public Item getById(String name, Long id) {
        return gameRepository.findById(id).get();

    }

    @Override
    public Iterable<Item> getAll() {

        return gameRepository.findAll();
    }
}

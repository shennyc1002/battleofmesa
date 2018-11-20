package com.battleground.battle.battleofmesa;

import com.battleground.battle.battleofmesa.entity.Item;
import com.battleground.battle.battleofmesa.repository.GameStateRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BattleofmesaApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Mock
	GameStateRepository gameStateRepository;

	@Test
	public void contextLoads() {
	}

/*
	@Test
	public void createItemTest()
	{
		Item expected = new Item("sword");
		//when(gameStateRepository.save(new Item("sword"))).
	}
*/

}

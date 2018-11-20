package com.battleground.battle.battleofmesa;

import com.battleground.battle.battleofmesa.entity.*;
import com.battleground.battle.battleofmesa.entity.GameCharacter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class BattleofmesaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BattleofmesaApplication.class, args);
	}


	public  Item getItemBean(String beanName)
	{
		return new Item(beanName);
	}


/*
	@Bean(name="Warrior")
	public GameCharacter getWarriorBean(String name)
	{
		return new Warrior(name,"Warrior");
	}*/

	@Bean(name="gameCharacter")
	public GameCharacter getCharacterBean(String name, String characterName)
	{
		if("Warrior".equals( characterName))
			return new Warrior(name, characterName);
		else if ("Archer".equals( characterName))
			return new Archer(name,characterName);
		else if ("Rogues".equals( characterName))
			return new Rogues(name,characterName);
		else if("Wizard".equals( characterName))
			return new Wizard(name,characterName);
		else
			return null;
	}

	/*@Bean(name="Rouges")
	public GameCharacter getRoguesBean(String beanName)
	{
		return new Rogues(beanName);
	}

	@Bean(name="Wizard")
	public GameCharacter getWizardBean(String beanName)
	{
		return new Wizard(beanName);
	}*/
}

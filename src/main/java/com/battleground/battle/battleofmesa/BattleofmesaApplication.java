package com.battleground.battle.battleofmesa;

import com.battleground.battle.battleofmesa.entity.*;
import com.battleground.battle.battleofmesa.entity.GameCharacter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;

import javax.persistence.Transient;
import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
@ComponentScan({"com.battleground.battle.battleofmesa"})
public class BattleofmesaApplication {

	private int min = 8;

	private int max = 18;

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


	/*public GameCharacter getCharacterBean(String gname, String characterName) throws Exception
	{
		if("Warrior".equals( characterName))
			return new GameCharacter(
					gname,
					characterName,
					generateRandomSequence(min,max).min().getAsInt(),
					generateRandomSequence(min,max).max().getAsInt(),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max)
			);

		else if ("Archer".equals( characterName))
			return new GameCharacter(

					gname,
					characterName,
					generateRandomNumber(min,max),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max),
					generateRandomSequence(min,max).min().getAsInt(),
					generateRandomSequence(min,max).max().getAsInt(),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max)
					);
		else if ("Rogues".equals( characterName))
			return new GameCharacter(

					gname,
					characterName,
					generateRandomNumber(min,max),
					generateRandomSequence(min,max).min().getAsInt(),
					generateRandomNumber(min,max),
					generateRandomSequence(min,max).max().getAsInt(),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max)
			);
		else if("Wizard".equals( characterName))
			return new GameCharacter(

					gname,
					characterName,
					generateRandomNumber(min,max),
					generateRandomSequence(min,max).min().getAsInt(),
					generateRandomNumber(min,max),
					generateRandomSequence(min,max).max().getAsInt(),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max),
					generateRandomNumber(min,max)
			);
		else
			throw new Exception("Character Class not found");


	}*/

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

	public int generateRandomNumber(int min, int max)
	{
		return new Random().nextInt((max - min) + 1) + min;
	}

	public IntStream generateRandomSequence(int min, int max)
	{
		// logger.debug("generaRandomSequence "+ min+"  "+max);
		Random random = new Random();
		return  random.ints(11,min,(max+1));
	}
}

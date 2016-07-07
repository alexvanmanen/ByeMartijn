package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Jos implements Colleague{

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate()  throws NotImplementedException{
		return new Date(84, 5, 31);
	}
	
	@Override
	public String getFarewellMessage() {
		return "Beste Martijn, we hebben qua werk weinig met elkaar van doen gehad. De eerste keer dat we elkaar wat langer mochten ontmoeten was met het techniek-uitje. Het was toen een plezierige samenwerking, we hebben onze streep kranig verdedigd tegen alle kindervoetjes!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Martijn, ik wens je alle goeds toe in je nieuwe baan en ik hoop dat je een zinvolle invulling kunt gaan geven aan de vele uren reistijd, die je nu meer hebt. Ik vermoed dat dat wel goed komt! Jos";
	}

}
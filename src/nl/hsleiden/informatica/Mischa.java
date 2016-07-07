package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Mischa implements Colleague{

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
		return "Dag Martijn!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Veel succes met je nieuwe baan in Utrecht!";
	}

}
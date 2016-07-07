package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Alex implements Colleague{

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate()  throws NotImplementedException{
		throw new NotImplementedException();
	}

	@Override
	public String getFarewellMessage() {
		return "Hey Martijn, \n "
				+ "Ik hoop dat je het heel erg naar je zin krijgt in Utrecht. Het gaat je goed!\n"
				+ "Alex";
	}

	@Override
	public String getWishForTheFuture() throws NotImplementedException {
		return "Hey Martijn, \n "
				+ "Ik hoop dat je het heel erg naar je zin krijgt in Utrecht. Het gaat je goed!\n"
				+ "Alex";
	
	}

}

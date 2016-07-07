package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Marja implements Colleague{

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
		throw new NotImplementedException();
	}

	@Override
	public String getWishForTheFuture(){
		return "Heel veel plezier in je nieuwe baan.";
	}

}
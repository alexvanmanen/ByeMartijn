package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Corinne implements Colleague{

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
		return "Hi Martijn, veel succes in je nieuwe job! Maak er iets moois van! Groet, Corinne";
	}

	@Override
	public String getWishForTheFuture(){
		return "";
	}

}
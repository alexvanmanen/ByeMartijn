package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Robbert implements Colleague{

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
		return "56 65 65 6C 73 75 63 63 65 73 21";
	}

	@Override
	public String getWishForTheFuture(){
		return "45 65 6E 6D 6F 6F 69 65 74 6F 65 6B 6F 6D 73 74 69 6E 55 74 72 65 63 68 74";
	}

}
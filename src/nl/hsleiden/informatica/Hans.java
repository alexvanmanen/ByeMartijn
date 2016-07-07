package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Hans implements Colleague{

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
		return "Hartelijk dank voor je werkcolleges scripting tbv FICT.\nVeel succes in Utrecht toegewenst.";
	}

	@Override
	public String getWishForTheFuture(){
		return "";
	}

}
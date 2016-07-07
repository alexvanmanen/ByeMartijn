package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Remco implements Colleague{

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
		return "Gooi vooral oude schoenen weg, maar kijk voordien wel eerst even wat je nog in de kast had staan.";
	}

	@Override
	public String getWishForTheFuture(){
		return "Een warm en gelukkig nieuw nest toegewenst, waar je je draai in vindt, iets leren kunt en je verstand bijpunt.";
	}

}
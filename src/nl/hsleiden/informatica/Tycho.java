package nl.hsleiden.informatica;


import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Tycho implements Colleague{

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate()  throws NotImplementedException{
		throw new NotImplementedException();
	}

	public String getFarewellMessage() {
		return "Je was een fijne collega om mee samen te werken, altijd direct en je wist wat je wilde, ik vind het jammer dat je gaat en ik hoop je ooit weer eens tegen te komen  --Tycho";
	}

	public String getWishForTheFuture() {
		return "Ik hoop dat je veel plezier en uitdagingen krijgt op je nieuwe baan. Ik wens je veel plezier toe met je nieuwe carrierepad. --Tycho";
	}

	

}

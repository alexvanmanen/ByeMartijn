package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Vincent implements Colleague{

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
		return "Veel succes met je nieuwe baan!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Ik hoop dat je bij de HU de ruimte vindt om je vakken zo vorm te geven zoals je dat graag wilt.";
	}

}
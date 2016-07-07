package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Carla implements Colleague {

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public String getFarewellMessage() {
		return "Veel succes in Utrecht. Scheelt in ieder geval een hoop reizen, dus je houdt veel tijd over!"
				+ "\nHartelijke groet, Carla";
	}

	@Override
	public String getWishForTheFuture() {
		return "";
	}

}
package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Vera implements Colleague {

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		return new Date(84, 5, 31);
	}

	@Override
	public String getFarewellMessage() {
		return "Een nieuwe kans, een nieuw baan\n" + "Doe je best en ga er tegenaan!\n"
				+ "Heel veel succes met je nieuwe job\n" + "En beloof, maak bij ons nog eens een stop";
	}

	@Override
	public String getWishForTheFuture() {
		return "Heel veel werkplezier in je nieuwe baan.";
	}

}
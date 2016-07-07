package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Jacco implements Colleague {

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
		return "Ik wens je heel veel plezier bij je nieuwe baan, maak het mooi!\n" +

				"Ik snap niet wat inhoudelijk gaat lesgeven bij je nieuwe baan maar wat je hier lesgeeft snap ik ook niet in ieder geval heel veel plezier.";
	}

	@Override
	public String getWishForTheFuture() {
		return "";
	}

}
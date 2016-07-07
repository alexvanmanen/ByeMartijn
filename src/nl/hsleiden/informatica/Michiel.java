package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Michiel implements Colleague {

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
		return "Beste Martijn, Afgelopen jaar ben je als software engineer gegroeid en ik vond het leuk dat we daar samen\n"
				+ "wat ontwikkelingsstappen in hebben gemaakt. Mobile Devices en IPSEN4 en IPSEN5 hebben we dit jaar toch maar weer mooi afgerond.";
	}

	@Override
	public String getWishForTheFuture() {
		return "Ik hoop dat je je nieuw werk net zo leuk of nog leuker vind als hier in Leiden. Dat je maar in een goed team\n"
				+ "terecht komt en dat je maar een grote stapel met slimme studenten voor je krijgt. Heel veel plezier en succes in Utrecht !";
	}

}
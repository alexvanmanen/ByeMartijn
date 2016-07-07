package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class James implements Colleague{

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
		return "Dat was bij Informatica kort maar krachtig! Bedankt voor de prettige samenwerking!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Ik wens je veel succes in je nieuwe baan! Groeten en tot ziens, James.";
	}

}
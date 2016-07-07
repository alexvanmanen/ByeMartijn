package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PeterVanVliet implements Colleague {

	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		return "peter@uitdehoogte.nl";
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		 return new Date( Math.round( Math.random() * 75 ));
	}

    public static int getEuShoeSize()
    {
       return  (int) Math.floor( 45.99999 );
    }

	
	@Override
	public String getFarewellMessage() {
		 return "Na een jaar ondersteuning bij de specialisatie Software Engineering zullen we het komende jaar het zonder je moeten proberen. Jammer!";
	}

	@Override
	public String getWishForTheFuture() throws NotImplementedException {
		 return "Ik hoop dat je het erg naar je zin hebt in Utrecht en daar vind wat je hier hebt gemist.";

	}

}

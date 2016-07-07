package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JeroenR implements Colleague{

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
		return "Hallo Martijn! Ik heb aardig wat samengewerkt met je dit jaar en ik hoop dat jij (net zoals ik) dit altijd soepel vond verlopen. Ook zijn we samen dit jaar in de wereld van Android gedoken en zodoende mochten we ons na de cursus echte ‘Masters of Android’ noemen! Ik wens je zeer veel geluk en succes met het vervolg van je (educatieve) carrière.";
	}

	@Override
	public String getWishForTheFuture(){
		return "Veel geluk en wijsheid(in o.a. Python, Android en Bash) gewenst! Happy Coding :-)";
	}

}
package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JeroenM implements Colleague{

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
		return "Beste Martijn, onwijs bedankt voor het afgelopen jaar. Ik wil je bedanken voor je behulpzaamheid en zorg die je hebt getoond aan mij als junior docent en de kneepjes van het vak die je me wilde bijbrengen. Dank je wel!";
	}

	@Override
	public String getWishForTheFuture(){
		return "Allereerst heel veel geluk. Ik hoop dat je het naar je zin zult hebben in Utrecht. Hopelijk zul je daar je draai helemaal vinden en kun je jezelf in de buurt gaan settelen. Ga ervan genieten en het aller beste!";
	}

}
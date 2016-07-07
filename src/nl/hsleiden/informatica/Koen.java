package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by koen on 30-06-16.
 */
public class Koen implements Colleague{

	private String name = "Koen";
	private String fareWell = "Beste Martijn, fijn dat je hier een tijd gewerkt hebt. We hebben veel gehad aan de " +
			"IOPR-toetsen die je hebt gemaakt. Niemand haalt zo'n hoge productie in zo'n korte tijd als jij. Dat gaan " +
			"we nog missen!";
	private String wish = "Ik wens je veel succes in Utrecht en wellicht zien we je nog eens in Leiden.";


	public String getName(){
		return this.name;
	}

	public String farewellMessage() {

		return getName() + ": " + this.fareWell;
	}

	public String wishForTheFuture() {

		return getName() + ": " +  this.wish;
	}



	@Override
	public String getMyPersonalEmail() throws NotImplementedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getMyBirthDate() throws NotImplementedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFarewellMessage() throws NotImplementedException {
		// TODO Auto-generated method stub
		return fareWell;
	}

	@Override
	public String getWishForTheFuture() throws NotImplementedException {
		// TODO Auto-generated method stub
		return wish;
	}
}

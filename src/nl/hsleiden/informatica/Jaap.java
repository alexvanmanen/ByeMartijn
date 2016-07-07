package nl.hsleiden.informatica;

import java.util.Date;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Jaap implements Colleague{

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
		return "Wnzzre qng wr baf ny tnng ireyngra. Ortevwcryvwxr xrhf trmvra qr ervfgvwq qvr wr qntryvwxf xjvwg jnf bz anne Yrvqra gr xbzra.";

	}

	@Override
	public String getWishForTheFuture(){
		return "Vx jraf wr irry fhpprf gbr bc qr Ubtrfpubby Hgerpug ra jryyvpug gbg jrremvraf!";
	}

}
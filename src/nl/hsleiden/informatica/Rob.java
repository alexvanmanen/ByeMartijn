package nl.hsleiden.informatica;



import java.util.Date;

public class Rob implements Colleague
{
    
    public String getMyPersonalEmail()
    {
        return ("schub8@hotmail.com");
    }
    
    public Date getMyBirthDate()
    {
        return new Date (1954, 9, 7); // eigenlijk deprecated ;-) 
    }
    public String getFarewellMessage()
    {
        return ("Veel geluk en fijne collega's in een warme omgeving");
        
    }
    public String getWishForTheFuture()
    {
        return ("Luister naar de baas maar vooral ook goed naar je collega");
    }
    
}
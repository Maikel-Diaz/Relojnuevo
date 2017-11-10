
/**
 * Write a description of class FechaYHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private CalendarioBasico fecha;
    private ClockDisplay hora;

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        fecha = new CalendarioBasico();
        hora= new ClockDisplay();
    }
    
    /**
     * 
     */
    public String getFechaYHora()
    {
        return fecha.obtenerFecha() + " y " + hora.getTime();
    }
    
}
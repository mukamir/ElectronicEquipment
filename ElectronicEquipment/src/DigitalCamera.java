
public class DigitalCamera extends ElectronicDevice
{
	/*** Class Constants ***/
	
	private final boolean DEFAULT_FLASH    = true;
	private final double  DEFAULT_APERTURE = 5.0; //in feet  
	
	/*** Class Variables ***/
	
	private boolean flash;  
	private double  aperture;   //ft
	
	/*** Constructors ***/
	
	public DigitalCamera()
	{
		super();
		this.setFlash( DEFAULT_FLASH );
		this.setAperture( DEFAULT_APERTURE );		
	}
	
	public DigitalCamera( String manufacturer, String model, double cost, double weight, double power, 
			              boolean flash, double aperture )
	{
		super( manufacturer, model, cost, weight, power );
		this.setFlash( flash );
		this.setAperture( aperture );
	}
	
	/*** Accesor Methods -- getters ***/
	
	public boolean getFlash ()
	{
		return this.flash;
	}
	
	public double getAperture ()
	{
		return this.aperture;
	}
	
	@Override
	public String toString()
	{
		return "Digital Camera: \n" + super.toString() + 
			   String.format( "     %-7s  %8b%n", "Flash:", this.getFlash() ) +
			   String.format( "     %-7s  %8.2f (ft)%n", "Aperture:", this.getAperture() );
	}
	
	/*** Mutators/Transformers -- setters ***/
	
	public void setFlash ( boolean flash )
	{
		this.flash = flash;
	}
	
	public void setAperture ( double aperture)
	{
		this.aperture = aperture;
	}
}

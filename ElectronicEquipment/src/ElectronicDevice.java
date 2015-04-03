/*
 * 
 */

public abstract class ElectronicDevice 
{
	/*** Class Constants ***/

	private final String DEFAULT_MANUFACTURER = "Sony";
	private final String DEFAULT_MODEL        = "Alpha a5000";
	private final double DEFAULT_COST         = 500.0;
	private final double DEFAULT_WEIGHT       = 9.5;        //Ounces
	private final double DEFAULT_POWER        = 12.0;       //Volts

	/*** Class Variables ***/
	
	private String manufacturer;
	private String model;
	private double cost;
	private double weight;
	private double power;
	
	/*** Constructors ***/
	
	public ElectronicDevice()
	{
		this.manufacturer = DEFAULT_MANUFACTURER;
		this.model        = DEFAULT_MODEL;
		this.cost         = DEFAULT_COST;
		this.weight       = DEFAULT_WEIGHT;
		this.power        = DEFAULT_POWER;			
	}
	
	public ElectronicDevice( String manufacturer, String model, double cost, double weight, double power )
	{
		this.manufacturer = manufacturer;
		this.model        = model;
		this.cost         = cost;
		this.weight       = weight;
		this.power        = power;		
	}
	
	/*** Accessor Methods -- getters ***/
	
	public String getManufacturer ()
	{
		return this.manufacturer;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public double getCost()
	{
		return this.cost;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getPower()
	{
		return this.power;
	}
	
	@Override
	public String toString()
	{
		/*** Local Variable ***/
		
		String displayString = "";
		
		/*** Create formatted string for display ***/

		displayString += String.format( "     %-13s %-20s", "Manufacturer:", this.getManufacturer() );
		displayString += String.format( " %-13s %-15s%n", "Model:",     this.getModel() );
	    displayString += String.format( "     %-7s $%8.2f%n",         "Cost:",   this.getCost() );
		displayString += String.format( "     %-7s  %8.2f (lbs)%n",   "Weight:", this.getWeight() );
		displayString += String.format( "     %-7s  %8.2f (watts)%n", "Power: ", this.getPower() );
		
		return displayString;
	}
	
	/*** Mutator/Transformer Methods -- setters ***/

	public void setManufacturer( String manufacturer )
	{
		this.manufacturer = manufacturer;
	}
	
	public void setModel( String model )
	{
		this.model = model;
	}
	
	public void setCost( double cost)
	{
		this.cost = cost ;
	}
	
	public void setWeight( double weight )
	{
		this.weight = weight ;
	}
	
	public void setPower( double power )
	{
		this.power = power ;
	}
}

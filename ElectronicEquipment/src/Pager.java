/*
 * 
 */

public class Pager extends ElectronicDevice
{
	/*** Class Constants ***/
	
	private final double DEFAULT_RANGE = 0.5; //in miles
	
	/*** Class Variables ***/
	
	private double range;
	
	/*** Constructors ***/
	
	public Pager()
	{
		super();
		this.setRange( DEFAULT_RANGE );
	}
	
	public Pager( String manufacturer, String model, double cost, double weight, double power, double range )
	{
		super( manufacturer, model, cost, weight, power );
		this.setRange( range );
	}
	
	/*** Accessor Methods -- getters ***/
	
	public double getRange()
	{
		return this.range;
	}
	
	@Override
	public String toString()
	{
		return "Pager: \n" + super.toString() + String.format( "     %-7s  %8.2f (miles)%n", "Range:", this.getRange() );
	}
	
	/*** Mutators/Transformers -- setters ***/
	
	public void setRange( double range )
	{
		this.range = range;
	}
}
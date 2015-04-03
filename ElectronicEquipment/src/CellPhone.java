
public class CellPhone extends ElectronicDevice
{
	/*** Class Constants ***/
	
	private final String DEFAULT_PROVIDER = "AT&T";
	
	/*** Class Variables ***/
	
	private String provider;
	
	/*** Constructors ***/
	
	public CellPhone()
	{
		super();
		this.setProvider( DEFAULT_PROVIDER );
	}
	
	public CellPhone( String manufacturer, String model, double cost, double weight, double power, 
			          String provider )
	{
		super( manufacturer, model, cost, weight, power );
		this.setProvider( provider );
	}
	
	/*** Accessor Methods -- getters ***/
	
	public String getProvider()
	{
		return this.provider;
	}
	
	@Override
	public String toString()
	{
		return "Cell Phone: \n" + super.toString() + 
			   String.format( "     %-7s  %8s%n",    "Provider:", this.getProvider() );
	}
	
	/*** Mutators/Transformers -- setters ***/
	
	public void setProvider( String provider )
	{
		this.provider = provider;
	}
}
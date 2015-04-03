/*
 * 
 */

public class Computer extends ElectronicDevice
{
	/*** Class Constants ***/
	
	private final boolean DEFAULT_LAPTOP     = true;
	private final double  DEFAULT_HARD_DRIVE = 500.0;   //in GB's
	
	/*** Class Variables ***/
	
	private boolean laptop;
	private double  hardDrive;
	
	/*** Constructors ***/
	
	public Computer()
	{
		super();
		this.setLaptop( DEFAULT_LAPTOP );
		this.setHardDrive( DEFAULT_HARD_DRIVE );		
	}
	
	public Computer( String manufacturer, String model, double cost, double weight, double power, 
			         boolean laptop, double hardDrive )
	{   
		super( manufacturer, model, cost, weight, power );
		this.setLaptop( laptop );
		this.setHardDrive( hardDrive );	
	}
	
	/*** Accessor Methods -- getters ***/
	
	public boolean getLaptop()
	{
		return this.laptop;
	}
	
	public double getHardDrive()
	{
		return this.hardDrive;
	}
	
	@Override
	public String toString()
	{
		return "Computer: \n" + super.toString() + 
			   String.format( "     %-7s  %8b%n",    "Laptop:",    this.getLaptop() ) +
			   String.format( "     %-7s  %8.2f%n", "HardDrive:", this.getHardDrive() );			
	}
	
	/*** Mutators/Transformers -- setters ***/
	
	public void setLaptop( boolean laptop)
	{
		this.laptop = laptop;
	}
	
	public void setHardDrive( double hardDrive)
	{
		this.hardDrive = hardDrive;
	}
}
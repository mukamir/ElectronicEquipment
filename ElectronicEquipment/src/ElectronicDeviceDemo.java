/*
 * 
 */

import java.util.*;

public class ElectronicDeviceDemo 
{
    /*** Class Methods ***/
	
	public void startTest()
	{
		/*** Local Variables ***/
		
		ArrayList<ElectronicDevice> listOfElectronicDevices = new ArrayList<ElectronicDevice>();
		Computer      computer      = null;
		CellPhone     cellPhone     = null;
		Pager         pager         = null;
		DigitalCamera digitalCamera = null;
		
		/*** Instantiate one of each electronic device ***/

		computer      = new Computer( "Dell", "Inspiron 3000", 279.99, 3.0, 60, true, 300 );
		cellPhone     = new CellPhone( "Samsung", "Galaxy S5", 799.99, 0.6, 60, "AT&T" );		
		pager         = new Pager( "Motorolla", "SlimLine", 38.0, 0.2, 60, 0.5 );		
		digitalCamera = new DigitalCamera();
		
		/*** Store them in arraylist ***/
		
		listOfElectronicDevices.add( computer );
		listOfElectronicDevices.add( cellPhone );
		listOfElectronicDevices.add( pager );
		listOfElectronicDevices.add( digitalCamera );
		
		/*** Display each electronic device ***/
		
		for ( ElectronicDevice device : listOfElectronicDevices )
		{
			System.out.println( device.toString() );
		}
	}
	
	/*** Application ***/
	
	public static void main( String [] args )
	{
		ElectronicDeviceDemo driver = new ElectronicDeviceDemo();
		driver.startTest();
	}
}
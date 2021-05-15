package day6Task1;

public class MainApp {
	public static void main(String[] args) {
		
		ElectronicDevice device[] = new ElectronicDevice[4000];
		device[0] = new MobilePhone();
		device[1] = new Printer();
		device[2] = new Laptop();
		device[3]=new AC();
		System.out.println("hello");
		
	}
	
	public void doThings(ElectronicDevice device)
	{
		device.doSwitchOn();
		
		if(device instanceof MobilePhone)
		{
			MobilePhone phone = (MobilePhone)device;
			phone.doCalling();
			phone.doFlashOn();
			phone.doFlashOff();
		}
		if(device instanceof Printer)
		{
			((Printer)device).doPrinting("c:\\MyDoc.txt");
			
		}
		if(device instanceof AC) {
			AC ac=(AC) device;
			ac.doConnection();
			}
		
		
		device.doSwitchOff();
		
	}

}

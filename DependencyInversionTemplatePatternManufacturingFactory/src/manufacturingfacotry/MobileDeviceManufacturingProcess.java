package manufacturingfacotry;


public class MobileDeviceManufacturingProcess extends GeneralManufacturingProcess {
	


	@Override
	public String toString() {
		return "MobileDevice";
	}

	
	@Override
	public void assembleProduct() {
		System.out.println("assembling mobile device..");
	}

	@Override
	public void testProduct() {
		System.out.println("testing mobile device..");
		
	}

	@Override
	public void packageProduct() {
		System.out.println("packaging mobile device..");
		
	}

	@Override
	public void storeProduct() {
		System.out.println("storing mobile device..");
		
	}

}

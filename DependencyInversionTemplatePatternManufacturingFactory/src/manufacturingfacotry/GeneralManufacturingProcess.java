package manufacturingfacotry;


public abstract class GeneralManufacturingProcess  {
	
	
	public abstract void assembleProduct( );
	public abstract  void testProduct( );
	public abstract void packageProduct();
	public abstract void storeProduct();
	
	
	//template method design pattern
	public void goThroughProductionLine( ) {
		assembleProduct();
		 testProduct();
		packageProduct();
		storeProduct();
		
		
	}
	
	

}

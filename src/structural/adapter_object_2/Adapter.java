package structural.adapter_object_2;

public class Adapter extends Target
{
	private Adaptee _Adaptee = null;
	
	public Adapter(Adaptee adaptee)
	{
		this._Adaptee = adaptee;
	}
	
	@Override
	public void Request()
	{
  	System.out.println("\r\nI,m Adapter,\r\nI will adapt to Adaptee.");
  	this._Adaptee.SpecificRequest();
	}
}

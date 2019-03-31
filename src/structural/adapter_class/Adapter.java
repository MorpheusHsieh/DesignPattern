package structural.adapter_class;

public class Adapter implements Target
{
	private Adaptee1 _A1;
	private Adaptee2 _A2;
	private Adaptee3 _A3;
	
  public Adapter(Adaptee1 a1, Adaptee2 a2, Adaptee3 a3)
  {
  	this._A1 = a1;
  	this._A2 = a2;
  	this._A3 = a3;
  }
	
	public void Request()
	{
	  this._A1.SpecificRequest();
	  this._A2.SpecificRequest();
		this._A3.SpecificRequest();
	}
}

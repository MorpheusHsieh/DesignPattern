package structural.adapter_object_2;

public class RunAdapter
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		
		System.out.println();
		target.Request();
	}
}

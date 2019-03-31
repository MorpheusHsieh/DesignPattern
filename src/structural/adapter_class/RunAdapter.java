package structural.adapter_class;

public class RunAdapter
{
	public static void main(String[] args)
	{
		Adaptee1 a1 = new Adaptee1();
		Adaptee2 a2 = new Adaptee2();
		Adaptee3 a3 = new Adaptee3();
		
		Target target = new Adapter(a1, a2, a3);
		target.Request();
	}

}

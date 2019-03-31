package structural.adapter_class_2;

public class RunAdapter
{
	public static void main(String[] args)
	{
		Target target = new Adapter();
		
		System.out.println("I'm Target,\r\nI will request.");
		target.Request();
	}

}

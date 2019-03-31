package structural.adapter_class_2;

public class Adapter extends Adaptee implements Target
{
	@Override
	public void Request()
	{
		
		System.out.println("\r\nI'm Adapter,"
				+"\r\nI receive request from Target \r\nand will adapt to Adaptee.");
		this.SpecificRequest();
	}
}

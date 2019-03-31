package behavioral.command.car;

public class PowerOnCommand implements ICommand
{
	private Car _Car = null;

	public PowerOnCommand(Car car) { this._Car = car; }
	
	@Override
	public void execute() { this._Car.PowerOn(); }
}

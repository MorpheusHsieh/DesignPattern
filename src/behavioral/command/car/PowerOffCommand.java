package behavioral.command.car;

public class PowerOffCommand implements ICommand
{
	private Car _Car = null;

	public PowerOffCommand(Car car) { this._Car = car; }
	
	@Override
	public void execute() { this._Car.PowerOff(); }
}

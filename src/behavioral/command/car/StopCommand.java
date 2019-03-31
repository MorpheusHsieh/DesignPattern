package behavioral.command.car;

public class StopCommand implements ICommand
{
	private Car _Car = null;

	public StopCommand(Car car) { this._Car = car; }
	
	@Override
	public void execute() { this._Car.Stop(); }
}

package behavioral.command.car;

public class MoveCommand implements ICommand
{
	private Car _Car = null;

	public MoveCommand(Car car) { this._Car = car; }
	
	@Override
	public void execute() { this._Car.Move(); }
}

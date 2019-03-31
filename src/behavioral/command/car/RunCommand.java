package behavioral.command.car;

public class RunCommand
{
	public static void main(String[] args)
  {
    RemoteControl remoteCtrl = new RemoteControl();
    Car car = new Car();

    PowerOnCommand powerOn = new PowerOnCommand(car);
    PowerOffCommand powerOff = new PowerOffCommand(car);
    MoveCommand move = new MoveCommand(car);
    StopCommand stop = new StopCommand(car);

    remoteCtrl.setCommand(0, powerOn);
    remoteCtrl.setCommand(1, powerOff);
    remoteCtrl.setCommand(2, move);
    remoteCtrl.setCommand(3, stop);

    remoteCtrl.PushButton(0);
    remoteCtrl.PushButton(2);
    remoteCtrl.PushButton(3);
    remoteCtrl.PushButton(1);
  }  
}
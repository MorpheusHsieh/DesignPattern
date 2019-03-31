package behavioral.command.car;

public class RemoteControl
{
  private ICommand[] Commands;

  public RemoteControl()
  {
    Commands = new ICommand[8];
    for (int i = 0; i < 8; i++)
    {
      Commands[i] = new NoCommand();
    }
  }

  public void setCommand(int slot, ICommand cmd)
  {
    Commands[slot] = cmd;
  }

  public void PushButton(int slot)
  {
    Commands[slot].execute();
  }
}

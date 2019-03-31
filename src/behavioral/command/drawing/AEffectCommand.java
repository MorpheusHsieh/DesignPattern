package behavioral.command.drawing;

public class AEffectCommand implements Command 
{
  public void execute(Drawing drawing) 
  {
    System.out.println("�@ A �S��");
    drawing.processSome();
    drawing.processOther();
  }
}


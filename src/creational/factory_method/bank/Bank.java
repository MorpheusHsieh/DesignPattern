package creational.factory_method.bank;

abstract public class Bank
{
	public enum Position {
		Manager, TeamLeader, Employee;
	}
	
  public PayList create(Position position)
  {
      PayList p = createPayList(position);
      return p;
  }

  abstract protected PayList createPayList(Position position);
}


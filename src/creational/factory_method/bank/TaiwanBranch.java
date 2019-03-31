package creational.factory_method.bank;

import creational.factory_method.bank.Bank.Position;

public class TaiwanBranch
{
  public PayList createPayList(Position position) 
  {
    switch (position)
    {
      case Manager:
        return new TaiwanManagerPayList();
      case TeamLeader:
        return new TaiwanTeamLeaderPayList();
      case Employee:
        return new TaiwanEmployeePayList();
      default:
      	String mesg = "The position enumertation is excepted...";
      	throw new RuntimeException(mesg);
    }
  }

}

package creational.factory_method.bank;

import creational.factory_method.bank.Bank.Position;

public class Main
{
	public static void main(String[] args)
	{
    TaiwanBranch twBranch = new TaiwanBranch();
    Position position = null; 

    position = Position.Manager;
    System.out.println(position.name());
    PayList twManager = twBranch.createPayList(position);
    twManager.printPayList();
    System.out.println();

    position = Position.TeamLeader;
    System.out.println(position.name());
    PayList twTeamLeader = twBranch.createPayList(position);
    twTeamLeader.printPayList();
    System.out.println();

    position = Position.Employee;
    System.out.println(position.name());
    PayList twEmployee = twBranch.createPayList(position);
    twEmployee.printPayList();
    System.out.println();

	}
}

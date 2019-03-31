package creational.factory_method.bank;

public class HongKongEmployeePayList extends PayList
{
	public HongKongEmployeePayList()
  {
		basePay = 50000;
    bonus = 0;
    taxRating = 0.09;
  }
}

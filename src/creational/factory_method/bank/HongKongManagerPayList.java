package creational.factory_method.bank;

public class HongKongManagerPayList extends PayList
{
  public HongKongManagerPayList()
  {
    basePay = 100000;
    bonus = 30000;
    taxRating = 0.32;    
  }
}

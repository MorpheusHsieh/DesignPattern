package creational.factory_method.bank;

public class TaiwanManagerPayList extends PayList
{
  public TaiwanManagerPayList()
  {
    basePay = 80000;
    bonus = 20000;
    taxRating = 0.21;
  }
}

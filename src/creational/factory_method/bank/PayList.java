package creational.factory_method.bank;

abstract public class PayList
{
  protected double basePay;
  protected double bonus;
  protected double taxRating;

  public double revenue() { return basePay + bonus; }

  public double tax() { return revenue() * taxRating; }

  public double paying() { return revenue() - tax(); }

  
  public void printPayList()
  {
  	System.out.println("薪水: " + revenue());
  	System.out.println("所得稅: " + tax());
  	System.out.println("應付: " + paying());
  }
}
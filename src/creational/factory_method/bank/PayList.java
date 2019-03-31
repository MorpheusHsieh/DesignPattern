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
  	System.out.println("�~��: " + revenue());
  	System.out.println("�ұo�|: " + tax());
  	System.out.println("���I: " + paying());
  }
}
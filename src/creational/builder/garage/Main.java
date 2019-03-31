package creational.builder.garage;



public class Main 
{
  public static void main(String[] args) 
  {
    Designer you = new Designer();
    GarageBuilder builder = new CheapBuilder();

    you.buildGarage(builder);
    
    // �o�u�O��ܦ��~�Ӥw
    builder.printGarage();
  }
}
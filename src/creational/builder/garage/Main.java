package creational.builder.garage;



public class Main 
{
  public static void main(String[] args) 
  {
    Designer you = new Designer();
    GarageBuilder builder = new CheapBuilder();

    you.buildGarage(builder);
    
    // 這只是顯示成品而已
    builder.printGarage();
  }
}
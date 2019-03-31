package creational.abstract_factory.house;

public class Main 
{
  public static void main(String[] args) 
  {
    House houseForHome = new House();
  
    //為這間房子加入一些家用傢俱
    houseForHome.addFurniture(new HomeFactory());
    System.out.println();
    
    //為這間房子加入一些辦公傢俱
    House houseForOffice = new House();
    houseForOffice.addFurniture(new OfficeFactory());
  }
}
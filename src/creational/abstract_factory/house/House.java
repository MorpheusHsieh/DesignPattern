package creational.abstract_factory.house;

public class House 
{
  public House() 
  {
    System.out.println("有了一間房子");
  }
  
  public void addFurniture(FurnitureFactory factory) 
  {
    factory.createTable();
    factory.createChair();
  }
}

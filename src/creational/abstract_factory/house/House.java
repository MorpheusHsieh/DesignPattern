package creational.abstract_factory.house;

public class House 
{
  public House() 
  {
    System.out.println("���F�@���Фl");
  }
  
  public void addFurniture(FurnitureFactory factory) 
  {
    factory.createTable();
    factory.createChair();
  }
}

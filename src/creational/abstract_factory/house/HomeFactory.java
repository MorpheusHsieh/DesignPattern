package creational.abstract_factory.house;

public class HomeFactory extends FurnitureFactory 
{
  public Table createTable() 
  {
    return new HomeTable();
  }
  
  public Chair createChair() 
  {
    return new HomeChair();
  }
}

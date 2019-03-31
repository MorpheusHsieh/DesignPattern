package creational.abstract_factory.house;

public class OfficeFactory extends FurnitureFactory 
{
  public Table createTable() 
  {
    return new OfficeTable();
  }
  
  public Chair createChair() 
  {
    return new OfficeChair();
  }
}

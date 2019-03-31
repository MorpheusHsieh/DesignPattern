package creational.builder.pizza;

/**
 * "Product"
 */
public class Pizza
{
  private String dough = "";
  private String sauce = "";
  private String topping = "";
 
  public void setDough(String dough) {
    this.dough = dough;
  }
 
  public void setSauce(String sauce) {
    this.sauce = sauce;
  }
 
  public void setTopping(String topping) {
    this.topping = topping;
  }
  
  public String toString()
  {
    String EOL = System.getProperty("line.separator");
    StringBuffer sb = new StringBuffer();
    sb.append("Dough: "+dough);
    sb.append(EOL);
    sb.append("Sauce:"+sauce);
    sb.append(EOL);
    sb.append("Topping: "+topping);
    return sb.toString();
  }
}

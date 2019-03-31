package structural.bridge.shape;

/** "Abstraction" */
abstract class Shape 
{
   protected DrawingAPI drawingAPI;
 
   protected Shape(DrawingAPI drawingAPI)
   {
      this.drawingAPI = drawingAPI;
   }
 
   abstract public void draw();                             // low-level
   abstract public void resizeByPercentage(double pct);     // high-level
}
 

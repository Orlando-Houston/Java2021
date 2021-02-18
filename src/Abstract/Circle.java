package Abstract;

public class Circle extends GeometricalShapes {
    private double radius;
    public   double pi= Math.PI;

    public  void features(double radius){
        objectName ("Daire :");
        this.radius=radius;
    }
    public double calculateArea(){
      return pi*radius;
   }
}

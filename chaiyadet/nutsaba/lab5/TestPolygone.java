/**
 * This program is to display the height width to find the area of ​​rectangles and triangles.
 * 
 @author Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* @version january 13, 2023
 */
 
package chaiyadet.nutsaba.lab5;

enum PolygonType {RECTANGLE,TRIANGLE}
/**
 * Define width, height, type, and area.
 */
class Polygon {
    float width;
    float height;
    PolygonType type;
    double area;
    static int  numPolygons ;
    static double sumPolygonsArea ;
   public double getArea() {
     if (type == PolygonType.RECTANGLE){
        return width*height;
     }
     else {
        return (width*height)/2;
     }
   }
   public static void setNumPolygons(int numNewPolygons) {
        numPolygons += numNewPolygons;
   } 
   public static void setSumPolygonsArea(double newPolygonsArea) {
        sumPolygonsArea += newPolygonsArea;
   }
}
/**
 * Getting Value and Displaying
 */
public class TestPolygone {
    public static void main(String[] args) {
    Polygon polygon1 = new Polygon();
    polygon1.width = 2;
    polygon1.height = 3;
    polygon1.type = PolygonType.RECTANGLE;
    Polygon.setNumPolygons(1);
    Polygon.setSumPolygonsArea(polygon1.getArea());
    Polygon polygon2 = new Polygon();
    polygon2.width = 3;
    polygon2.height = 4;
    polygon2.type = PolygonType.TRIANGLE;
    Polygon.setNumPolygons(1);
    Polygon.setSumPolygonsArea(polygon2.getArea());
    System.out.println("The number of polygons is " + Polygon.numPolygons + " or " + polygon1.numPolygons + " or " + polygon2.numPolygons);
    System.out.println("The width of polygon1 is " + polygon1.width + " the width of polygon2 is " + polygon2.width);
    System.out.println("The sum of polygons area is " + Polygon.sumPolygonsArea);
    }
}






// // /**** P1/Shape.java ****/
 package P1;
 public abstract class Shape {
 protected abstract void getData() throws java.io.IOException;
  public abstract double area() throws java.io.IOException;
}
// // /**** P2/Rectangle.java ****/
package P2;
 import java.io.*;
 import P1.*;
 public class Rectangle extends Shape {
  private double length;
private double breadth;
  protected void getData() throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(
 System.in
 ));
 System.out.print("Enter Length of Rectangle: ");
 length = Double.parseDouble(br.readLine());
 System.out.print("Enter Breadth of Rectangle: ");
 breadth = Double.parseDouble(br.readLine());
  }
  public double area() throws IOException {
  getData();
  return length * breadth;
  }
}
/**** P3/Circle.java ****/
package P3;
import java.io.*;
 import P1.*;
 public class Circle extends Shape {
  private double radius;
  protected void getData() throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(
System.in
));
 System.out.print("Enter Radius of Circle: ");
 radius = Double.parseDouble(br.readLine());
 }
 public double area() throws IOException {
 getData();
 return Math.PI * radius * radius;
 }
}
/**** Main.java ****/
import java.io.*;
import P1.*;
import P2.*;
 import P3.*;
 public class question3 {
  static int getShapeType() throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(
 System.in
 ));
  System.out.println("==============\n SHAPE TYPE \n==============");
  System.out.println(" (1) Rectangle\n (2) Circle");
  System.out.print("Enter Choice: ");
  return Integer.parseInt(br.readLine());
  }
  public static void main(String[] args) throws IOException {
  Shape ref;
  boolean flag = false;
  while (!flag) {
  switch (getShapeType()) {
  case 1:
  flag = true;
  ref = new Rectangle();
  System.out.println("Area: " + ref.area() + " sq units");
  break;
  case 2:
  flag = true;
  ref = new Circle();
/  System.out.println("Area: " + ref.area() + " sq units");
  break;
  default:
  System.err.println("Invalid Option");
  break;
  }
  }
  }
 }

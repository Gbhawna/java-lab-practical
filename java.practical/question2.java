

// package P1; import 
// java.util.Scanner;
// public class TwoDim
// {
// public int x; 
// public int y;
// Scanner S= new Scanner(System.in);
// public TwoDim() //default constructor
// {
// x=0; 
// y=0;
// }
// public TwoDim(int a,int b) //parameterized constructor
// {
// x=a; 
// y=b;
// } public void 
// input()
// {
// System.out.print("\nEnter the value of x : "); 
// x=S.nextInt();
// System.out.print("\nEnter the value of y : ");
// y=S.nextInt();
// } public String 
// toString()
// { return ("x : "+x+"\ny : "+y);
// }
// }
// package P2; import 
// java.util.Scanner; 
// import P1.TwoDim;
// public class ThreeDim extends TwoDim
// { public int z;
// Scanner S =new Scanner(System.in); 
// public ThreeDim()
// {
// super(); 
// z=0;
// } public ThreeDim(int a,int b,int 
// c)
// {
// super(a,b); 
// z=c;
// } public void 
// input()
// {
// super.input();
// System.out.print("\nEnter the value of z : "); 
// z=S.nextInt();
// } public String 
// toString() {
// return(super.toString()+"\nz : "+z);
// }
// }
// package P; import 
// P1.TwoDim; import 
// P2.ThreeDim;
// class Package_test
// { public static void main(String [] args )
// {
// TwoDim ob1; ob1=new 
// TwoDim();
// ob1.input();
// System.out.println(ob1.toString())
// ; ob1=new ThreeDim(); 
// ob1.input(); 
// System.out.println(ob1);
// }
// }


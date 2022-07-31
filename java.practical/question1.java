



class complex_number
{
int real,image; public 
complex_number(int r, int i)
{
this.real=r;
this.image=i;
} public void 
print()
{
System.out.println(this.real + " + i" + this.image);
}
public static complex_number Add(complex_number n1, complex_number n2)
{
complex_number sum= new 
complex_number(0,0); sum.real= n1.real + n2.real; 
sum.image= n1.image + n2.image; return sum;
}
public static complex_number Multiply(complex_number n1, complex_number n2)
{
complex_number pro= new complex_number(0,0); 
int prod_1= n1.real*n2.real; int prod_2= 
n1.image*n2.image; int prod_3= (n1.real + 
n1.image)*(n2.real + n2.image); pro.real= prod_1 -
prod_2; pro.image= prod_3 - prod_1 - prod_2; return 
pro;
} public static void main(String[] 
args)
{
complex_number c1 = new complex_number(4,5); 
complex_number c2 = new complex_number(2,3); 
System.out.print("First complex number is : "); 
c1.print();
System.out.print("Second complex number is : "); c2.print(); complex_number sum = 
Add(c1,c2);
System.out.print("The addition of both the complex number is : " );
sum.print(); complex_number prod = 
Multiply(c1,c2);
System.out.print("The Multiplication of both the complex number is : " ); 
prod.print();
}
}
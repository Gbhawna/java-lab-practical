import java.util.Scanner; class 
UnderAge extends Exception
{
int age; 
UnderAge()
{
age=0;
}
UnderAge(int x)
{
age =x;
} public String 
toString()
{
return "Under age \n Age : "+ age;
}
}
class Exception_Test
{
static void test(int age) throws UnderAge
{
if (age<18)
{
throw new UnderAge(age);
}
}
public static void main(String args[])
{
int a;
Scanner scan = new Scanner 
(System.in); System.out.println("Enter the age : "); a=scan.nextInt(); try
{
test(a);
System.out.print("The age is above 18");
}
catch(UnderAge e)
{
System.out.println(e);
}
}
}
import java.util.Scanner;
 class 
Stack_Excep extends Exception

{
public String Overflow()
{
return "OVERFLOW";
}
public String empty()
{
return "EMPTY STACK";
}
}
class Stack
{ int t=-1; int size; 
int S[];
Scanner scan = new Scanner(System.in); 
public Stack()
{
size=0;
} public Stack(int 
size)
{ this.size = size; 
S=new int [size];
}
public void Push(int e) throws Stack_Excep
{ if (t==size-1)
{
throw new Stack_Excep();
} if 
(t==1)
{
t=0;
} else 
t++; 
S[t]=e;
}
public void Pop() throws Stack_Excep
{ if(t==-1) throw new Stack_Excep(); else
t--;
} public void 
Display()
{ int i; if(t==-1)
System.out.println("Stack is empty"); for(i=t;i>=0;i--
)
{
System.out.println(S[i]+"\t");
}
}
}
public class question5
{ public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int e,size; 
char ch='y';
System.out.println("Enter size of Stack"); 
size=scan.nextInt(); Stack s=new 
Stack(size);
int c;
do
{
System.out.println("1.Push 2.Pop 3.Display"); 
System.out.println("Enter your choice"); 
c=scan.nextInt(); switch(c)
{
case 1: try
{
System.out.println("Enter the element "); 
e=scan.nextInt();
s.Push(e);
}
catch(Stack_Excep x)
{
System.out.println(x.Overflow());
}
break;
case 2: try
{
s.Pop(); 
}
catch(Stack_Excep y)
{
System.out.println(y.empty());
}
break;
case 3:
s.Display(); 
break;
default:
System.out.println("Wrong choice"); 
break;
}
System.out.println("Do you want to continue?"); 
ch=scan.next().charAt(0);
}
while(ch=='Y'||ch=='y');
}
}


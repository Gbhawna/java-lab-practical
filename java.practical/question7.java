import java.io.*;
class DisplayFile
{ public static void main(String [] args)
{
FileReader 
fin=null; String i; if 
(args.length!=1)
{
System.out.println("File name not specified"); 
return;
}
try
{
fin=new FileReader(args[0]);
BufferedReader br = new BufferedReader(fin); 
while(br.ready())
{ i=br.readLine(); char 
x=i.charAt(0); if 
(x=='\\')
{

System.out.println(i);
}
}
}
catch(IOException e)
{
System.out.println("I/O ERROR : "+e);
} 
finally
{ try
{
if (fin!=null)
fin.close();
}
catch(IOException e1)
{
System.out.println("Error closing the Input file");
}
}
}
}

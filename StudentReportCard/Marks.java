import java.util.*;
class Marks extends Student {
int english;
int tamil;
int maths;
int science;
int social;
Scanner sc=new Scanner(System.in);
void entermarks()
{
	System.out.println("Enter the English mark ");
	english=sc.nextInt();
	System.out.println("Enter the Tamil mark ");
	tamil=sc.nextInt();
	System.out.println("Enter the Maths mark ");
	maths=sc.nextInt();
	System.out.println("Enter the Science mark ");
	science=sc.nextInt();
	System.out.println("Enter the Social mark ");
	social=sc.nextInt();
	
}
 void viewmarks()
{
     System.out.println("English:"+english);
     System.out.println("Tamil:"+tamil);
     System.out.println("Maths:"+maths);
     System.out.println("Science:"+science);
     System.out.println("Social:"+social);
     
}
}


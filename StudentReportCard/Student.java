import java.util.*;
 class Student {
	String name;
	int Roll_no;
	Scanner sc = new Scanner(System.in);
	void enterdetail()
	{
	System.out.println("Enter Student name");
	name=sc.next();
	System.out.println("Enter Roll no");
	Roll_no=sc.nextInt();
	}
	void viewdetail()
	{
		System.out.println("Name:\n"+name);
		System.out.println("Roll no:\n"+Roll_no);
	}

}

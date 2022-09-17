import java.util.*;
public class Class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of students in class");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		Marks m[]=new Marks[n];
		int j;
		do
		{
			System.out.println("1.Enter students detail");
			System.out.println("2.View student detail");
			System.out.println("Please enter 1 or 2");
			j=sc.nextInt();
		
			switch(j)
			{
			case 1:
				for(int i=0;i<s.length;i++)
				{
				
					s[i]=new Student();
					s[i].enterdetail();
					m[i]=new Marks();
					m[i].entermarks();
					
				}
		
				break;
			case 2:
				boolean found = false;
				System.out.println("Enter student Roll no to view details");
				int rno=sc.nextInt();
			
				for(int i=0;i<s.length;i++)
				{			
					if(rno==s[i].Roll_no)
					{
						s[i].viewdetail();
			            m[i].viewmarks();	
			            found=true;
				}
				if(!found)
				{
					System.out.println("The student name doesn't exist");
				}
				}
				break;
			}
		}while(j!=0);

	}

}



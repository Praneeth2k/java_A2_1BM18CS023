import java.util.*;
class Person{
	String name;
	int age;
	String address;
	static String topper;
	static double max_avg;
	double avg;
	Scanner sc=new Scanner(System.in);
	Person(){
		System.out.println("Enter name,age and address");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		age=sc.nextInt();
		address=sc.next();
		
        }
}

class Student extends Person{
	int rollno;
	int sem;
	Scanner sc=new Scanner(System.in);
	Student(){
		super();
		System.out.println("Enter roll no and semester");
		rollno=sc.nextInt();
		sem=sc.nextInt();
	}
}

class Exam extends Student{
	float marks1;
	float marks2;
	Scanner sc=new Scanner(System.in);
	
	Exam(){
		super();
		System.out.println("Enter mark1 and mark2");
		marks1=sc.nextInt();
		marks2=sc.nextInt();
	}	
	
	double compute_avg(){
		double avg1=(marks1+marks2)*0.5;
		if(avg1>max_avg){
			topper=name;
			max_avg=avg1;
		}
		avg=avg1;
		
		return avg;
	}
	
	void topper(){
		System.out.println("The topper is:"+topper);
	}
}

class PersonDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		Exam ob[]=new Exam[n];
		
		for(int i=0;i<n;i++){
		System.out.println("Student "+(i+1));
			ob[i]=new Exam();
			ob[i].compute_avg();
			
			
			System.out.println("The average for the student is="+ob[i].avg);
		}
		
		System.out.println("The topper is "+Person.topper);
	}
}
		
		
		
		
	
	

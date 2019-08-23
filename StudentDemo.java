import java.util.*;
class Student{
 

  String USN,name;
  int no_subs;
  int arr_credits[];
  double arr_marks[];
  double cgpa;
 
  void Input()

  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the USN and Name of the student");
    USN=sc.next();
    name=sc.next();
    System.out.println("Enter the number of subjects");
    no_subs=sc.nextInt();
    arr_marks=new double[no_subs];
    arr_credits=new int[no_subs];
    for(int i=0;i<no_subs;i++)
     {
        System.out.println("Enter the credit and marks obtained for subject "+(i+1));
        arr_credits[i]=sc.nextInt();
        arr_marks[i]=sc.nextFloat();
     }

   } 
   double grade(double mark)
     {
       double grade;
       if((mark<=100)&&(mark>=90))
         grade=10;
       else if((mark<90)&&(mark>=75))
         grade=9;
      else if((mark<75)&&(mark>=60))
         grade=8;
       else if((mark<60)&&(mark>=50))
         grade=7;
       else if((mark<50)&&(mark>=40))
         grade=6;
       else
         grade=0;
       return grade;

      } 



  double sgpa(){
    double sum=0;
    int deno=0;
    for(int i=0;i<no_subs;i++)
          sum+=(arr_credits[i])*(grade(arr_marks[i]));
      for(int i=0;i<no_subs;i++)
        {
         deno+=arr_credits[i];  
        }     
      cgpa=sum/deno;
    
     return cgpa;
    }
   void display()
     
     { 
        int flag=1;
       for(int i=0;i<no_subs;i++)
          {
            if(arr_marks[i]<40)
             {
              flag=0;
              break;
             }
           }
             
       if(flag==0)
          System.out.println("The student has failed");
       
       System.out.println("The cgpa of the student is "+sgpa());
       
     } 
    }



class StudentDemo{
 
     public static void main(String args[])
       {
            
           Student s=new Student();
           s.Input();
           s.display();
           
           
        }
} 
           

    

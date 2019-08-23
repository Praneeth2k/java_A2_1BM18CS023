import java.util.*;
public class Employee {
    String emp_num,name;
    double basic,DA,IT,net_sal;
    
    void input(int i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee_Number,name,Basic of employee "+(i+1));
        emp_num=sc.next();
        name=sc.next();
        basic=sc.nextInt();
    }
    
    void net_sal(){
        DA=basic*3/4;
        double gross=basic+DA;
        IT=gross*3/10;
        net_sal=basic+DA-IT;
        
    }
    void print(){
        System.out.println("The employee details are\n"+"Employee number:"+emp_num+"\nEmployee Name:"+name+"\nBasic salary:"+basic+"\nDA:"+DA+"\nIT:"+IT+"\nNet salary:"+net_sal);
    }
}
    
class Employee_Demo{
     
    public static void main(String args[]){
        System.out.println("Enter the number of employees");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee e=new Employee();
        for(int i=0;i<n;i++)
        {
           e.input(i);
           e.net_sal();
           e.print();
        }
    }
 
}



import java.util.*;
public class Patients {
    Scanner sc=new Scanner(System.in);
    int p_id,p_age;
    String p_name;
    String doc;
    void input(){
        System.out.println("Enter the name,id,age and dcotors name");
        p_name=sc.next();
        p_id=sc.nextInt();
        p_age=sc.nextInt();
        doc=sc.next();
    }
    
    void display(){
        System.out.println();
        
    }
    
    public static void main(String args[]){
        int n,count=0;;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of patients");
        n=sc.nextInt();
        Patients arr[]=new Patients[n];
        for(int i=0;i<n;i++){
            arr[i]=new Patients();
            arr[i].input();
        }
        
        System.out.println("Enter the doctors name whose patient list you want");
        String d=sc.next();
        for(int i=0;i<n;i++){
            if(d.equals(arr[i].doc)){
                if(count==0){
                    System.out.println("Patient list:-");
                }
                System.out.println(arr[i].p_name);
                count++;
            }
        }
        if(count==0){
            System.out.println("The are no patients who have this doctor");
    }
    
    
    
    

    
    }
}


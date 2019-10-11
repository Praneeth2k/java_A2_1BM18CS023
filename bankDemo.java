import java.lang.System.*;
import java.util.*;
abstract class Account{
    String name,account_num;
    float balance;
    Scanner sc=new Scanner(System.in);
    void Display(){
        System.out.println("The balance is "+balance);
    }
    void Deposit(){
        
        System.out.println("Enter the deposit");
        balance+=sc.nextFloat();
    }
    void Input(){
         System.out.println("Enter the balance");
         balance=sc.nextFloat();
         System.out.println("Enter the name of the account holder and acc_number");
         name=sc.next();
         account_num=sc.next();
    }
    void withdrawal(){
	 System.out.println("How much do you want to withdraw?");
         balance-=sc.nextFloat();
     }
    abstract void add_cmpInt();
    abstract void Penalty();
    }

class Sav_acct extends Account{
    void add_cmpInt(){
         System.out.println("Enter time");
         
         int time=sc.nextInt();
         float interest=(float)(balance*Math.pow(1.06,time));
         balance=balance+interest;
     }
     
     void Penalty(){
         System.out.println("No penalty for Savings account2");
     }
}
         

class Curr_acct extends Account{
    final float min_balance=10000;
    void Penalty(){
        if(balance<min_balance){
            balance-=2000;
        }
    }
    void add_cmpInt(){
         System.out.println("No option of adding compound interest in Current account"); 
     }
}


class bankDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Enter 1 for creating a Savings account and 2 for current account");
        ch=sc.nextInt();
        Account ref=null;
        if(ch==1)
            ref=new Sav_acct();
        else if(ch==2)
            ref=new Curr_acct();
        else{
            System.out.println("Wrong input");
             System.exit(0);
        }        
        ref.Input();
        do{
            System.out.println("Do you want to Deposit:1 add_compount interest:2 or Display the balance:3 impose penalty:4 or exit:5"); 
        int ch2=sc.nextInt();
        switch(ch2){
            case 1:ref.Deposit();
                   ref.Display();
                   break;
            case 2:ref.add_cmpInt();
                   ref.Display();
                   break;
            case 3:ref.Display();
                   break;
            case 4:ref.Penalty();
                   break;
            case 5:System.exit(0);      
            default:System.out.println("Wrong input");
         }
        
        }while(true);
     }
}
        
                
        
    
         

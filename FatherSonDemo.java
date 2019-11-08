//Write a program that demonstrates handling of exceptions in inheritance tree. Create a base class called “Father” and derived class called “Son” which extends the base class. In Father class, implement a constructor which takes the age and throws the exception WrongAge( ) when the input age=father’s age.
import java.util.*;
class Father{
    int fage;
    Father(int a) throws AgeException{
        if(a<=0)
            throw new AgeException();
        fage=a;
    }
}

class Son extends Father{
    int sage;
    Son(int a,int b) throws AgeException{
        super(a);
        if(a<b)
            throw new AgeException();
        
        sage=b;
    }
}

class FatherSonDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=45,b=30;
        try{
            Son ob=new Son(a,b);
            System.out.println("The age of father is "+ob.fage);
            System.out.println("The age of the son is "+ob.sage);
        }
        catch(AgeException e){
            System.out.println(e);
        }
        

    }
}

class AgeException extends Exception{
    public String toString(){
        return("Invalid Age");
    }
}

        

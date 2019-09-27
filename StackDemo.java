import java.util.*;
interface Stack{
    void push();
    void pop();
    void display();

}

class SS implements Stack{
    int top=-1,item,i;
    Scanner sc=new Scanner(System.in);
    final int size=5;
    int stack[]=new int[size];
    public void push(){
        if(top==size-1){
            System.out.println("Stack overflow");
            return;
        }
        System.out.println("Enter the element");
        item=sc.nextInt();
        top=top+1;
        stack[top]=item;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        int del=stack[top];
        top--;
        System.out.println("The deleted element is" +del);


    }
     public void display(){
         for(i=0;i<=top;i++){
         System.out.print(stack[i]+" ");}
     }
}

class DS implements Stack{
    int top=-1,i=1;
    public void push(){
        if(top==size-1){
            int arr[]=new int[size+i];
            i++;



        }
    }
    public void pop(){
        if(top==-1){
            System.out.prinln("Stack underflow");
            return;
        }
        int del=stack[top];
        top--;
        System.out.println("The deleted element is" +del);
    }
    public void display(){
        for(int i=0;i<=top;i++){
        System.out.print(stack[i]+" ");
        }    
    }

}

class StackDemo{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch2=0;
        System.out.println("Do you want a static stack(1) or a dynamic stack(2) ");
        int ch=sc.nextInt();
        Stack ref;
        ref=new SS();
        if(ch==1){
            ref=new SS();
        }
        else if(ch==2){
            ref=new DS();
        }
        
        do{
            System.out.println("Do you wnat to push{1} , pop{2} or display{3}??");
            int x=sc.nextInt();
            switch(x){
                case 1:ref.push();
                        break;   
                case 2:ref.pop();
                       break;
                case 3:ref.display();   
                       break;    
                default:System.out.println("Invalid input");
            

            };
            System.out.println("Do you want to continue?(1/0)");
            ch2=sc.nextInt();
        }while(ch2==1);
        }
    }

    
    


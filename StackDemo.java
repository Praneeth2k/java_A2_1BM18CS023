import java.util.*;

interface Stack{
     void push(int item);
     int pop();
     void display();
}

class StackTest implements Stack{
      int top;
      int size=5;
      int stack[]=new int[size];
      StackTest(){
	    top=-1;
      }

      public void push(int item){
          if(top==size-1){
              int temp[]=new int[size+2];
          for (int i=0;i<size;i++)
              temp[i]=stack[i];
           size+=2;
          stack=temp;
          stack[++top]=item;
          return;          
        }
        top=top+1;
        stack[top]=item;

      }
       
      public int pop(){
           if(top==-1){
               System.out.println("Stack underflow");
               return -9999;
           }
           int del=stack[top];
           top--;
           return del;
      }
      public void display(){
          for(int i=0;i<=top;i++){
              System.out.print(stack[i]+ " ");
           }
      }
}

class StackDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StackTest ob=new StackTest();
        int ch2;
        
         do{
           System.out.println("1:push   2:pop   3:display"); 
           int x=sc.nextInt();
           switch(x){
               case 1:System.out.println("Enter the element");
                      int item=sc.nextInt();
                      ob.push(item);
                      break;
               case 2:int d=ob.pop();
                      if(d!=-9999)
                        System.out.println("The deleted element is "+d);
                      break;
               case 3:ob.display();
                      break;
               default:System.out.println("Wrong input");
           };
           System.out.println("Do you want to continue(1/0)");
           ch2=sc.nextInt();
         }while(ch2==1);           
          
      }
}


         

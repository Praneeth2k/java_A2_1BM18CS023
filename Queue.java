//queue
import java.util.*;
class Queue{
	int q[];
	int f,r,n;
	
	Scanner sc=new Scanner(System.in);
	Queue(){
	    System.out.println("Enter the size of the queue");
	    n=sc.nextInt();
	    q=new int[n];
	    f=0;
	    r=-1;
	}
	
	void insert(int ele){
	    
	    if(r==n-1){
	        System.out.println("Queue overflow");
	        return;
	     }
	     r=r+1;
	     q[r]=ele;
	}
	
	int delete(){
	    int del;
	    if(f>r){
	        System.out.println("Queue underfolw");
	        return -9999;
	    }
	    del=q[f];
	    f=f+1;
	    return del;
	}
	
	void display(){
	    if(f>r){
	        System.out.println("Queue is empty");
	        return;
	    }
	    System.out.println("The queue elements are");
	    
	    for(int i=f;i<r;i++)
	        System.out.println(q[i]+" ");
	}
}
class Demo{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int del,y;
	    Queue q1=new Queue();
	    do{
	        System.out.println("Enter 1 to insert,2 to delete and 3 to display");
	        int x=sc.nextInt();
	        switch(x){
	            case 1:System.out.println("Enter the element");
	                   int ele=sc.nextInt(); 
	                   q1.insert(ele);
	                   break;
	            case 2: del=q1.delete();
	                    System.out.println("The deleted element is"+del);
	            case 3: q1.display();
	            default:System.out.println("Invalid input");
	        };
	        System.out.println("Do you want to continue?(1/0)");
	        y=sc.nextInt();
	        
	     }while(y==1);
	 }
}	       
	                    
	                          
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    
	        
	        
	       
		

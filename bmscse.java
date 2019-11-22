import java.util.*;
class A implements Runnable{
	Thread t;
        public A(){
        	t=new Thread(this,"t1");
       		t.start();
	}
	public void run(){
        	while(true){
			System.out.println("B.M.S College of Engineering");
			try{
				Thread.sleep(10000);
			}
			catch(InterruptedException e){
				System.out.println("BMS thread interrupted");
			}
		}
	}
}
/*
class B implements Runnable{
	Thread t;
        public B(){
        	t=new Thread(this,"t2");
       		t.start();
	}
	public void run(){
        	while(true){
			System.out.println("CSE");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println("CSE thread interrupted");
			}
		}
	}
}
*/
class bmscse{
	public static void main(String args[]){
  		new A();
                /*new B();*/
                while(true){
                    System.out.println("CSE");
                    try{
                        Thread.sleep(2000);
                     }
                     catch(InterruptedException e){
                         System.out.println("Main thread interrupted");
                      }
                }
	}
}
        


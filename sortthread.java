import java.util.*;
class asc implements Runnable{
    Thread t;
    int array[];
    asc(int arr[]){
        array=arr;
        t=new Thread(this,"t1");
        t.start();
    }
    
    public void run(){
        Arrays.sort(array);

    }
}
class desc implements Runnable{
    Thread t;
    int array[];
    desc(int arr[]){
        array=arr;
        t=new Thread(this,"t2");
        t.start();

    }
    public void run(){
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
         } 
        
    }
}
class sortthread{
    public static void main(String args[]){
        int arr1[]={3,2,6,4,7,1,2,8};
        int arr2[]={3,2,6,4,7,1,2,8};
        asc ob1=new asc(arr1);
        desc ob2=new desc(arr2);
        for(int a:(ob1.array)){
            System.out.print(a+ " ");
        }
        System.out.println("");
        for(int b:(ob2.array)){
            System.out.print(b+" ");
        }
    }
}
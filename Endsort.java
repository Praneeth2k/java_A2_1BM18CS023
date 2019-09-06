import java.util.*;
public class Endsort {
    int n,arr[];
    Endsort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements(disticnt)");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void end(int i){
        int j;
        int temp=arr[i];
        for(j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1]=temp;
    }
    int no_of_steps(){
        int count=0;
        int sorted[]=arr;
        
        Arrays.sort(sorted);
        
        while(!(Arrays.equals(sorted,arr))){
            for(int i=0;i<n;i++){
                if(arr[i]>arr[i+1]||(arr[i]>arr[n-1])){
                    end(i);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    
    
        

}
public class Demo {
    public static void main(String args[]){
        Endsort e1=new Endsort();
        System.out.println(e1.no_of_steps());
    }

}

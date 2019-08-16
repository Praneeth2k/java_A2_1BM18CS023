//maximum element in 2D array
import java.util.*;
class Max_2D
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of rows and columns of the 2D array"); 
   int r=sc.nextInt();
   int c=sc.nextInt();
   int arr[][]=new int[r][c];
   System.out.println("Print the elements of the array");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
       arr[i][j]=sc.nextInt();
    }
    int largest=arr[0][0];
   for(int ar[]:arr)
     {
       for(int x:ar)
       {
        if(x>largest)
         largest=x;
       }
     }
     System.out.println("The largest element in the array is "+largest);
  }    
}

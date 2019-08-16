//Write an interactive program that reads elements of a one dimensional array, sorts the elements in ascending order, and displays them.
 

import java.util.*;

  class Array_sort
  {
    public static void main(String args[])
    {
     int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements you want to enter");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elelments");
    int temp;
     for(i=0;i<n;i++)
       arr[i]=sc.nextInt();
     for(i=0;i<n;i++)
     {
        for(j=i+1;j<n;j++)
       {
        if (arr[i]>arr[j])
           {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
        } 
      }
           

     System.out.println("The sorted array is");
      for(i=0;i<n;i++)
       System.out.print(arr[i]+" ");
   }
 }

     
          

    
 

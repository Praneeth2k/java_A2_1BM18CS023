//Write an interactive program using two-dimensional arrays to perform matrix addition and subtraction.

import java.util.*;
class Matrix_add_sub

{
  
   public static void main(String args[])
   
   {
    
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the number of rows and columns of the first matrix");
     int r1=sc.nextInt();
     int c1=sc.nextInt();
     System.out.println("Enter the number of rows and columns of the second matrix");
     int r2=sc.nextInt();
     int c2=sc.nextInt();
     int arr1[][]=new int[r1][c1];
     int arr2[][]=new int[r2][c2];
     int i,j;

     
   if((r1==r2)&&(c1==c2))
    {
      System.out.println("Enter the elements of the first array");
      int add[][]=new int[r1][c1];
      int sub[][]=new int[r1][c1];
     
      for(i=0;i<r1;i++)
       {
         for(j=0;j<c1;j++)
           arr1[i][j]=sc.nextInt();
       }
    
      System.out.println("Enter the elements of the second array");
    
       for(i=0;i<r1;i++)
       {
         for(j=0;j<c1;j++)
           arr2[i][j]=sc.nextInt();
       }
       System.out.println("Matrix addition give us the array:");
       
      for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
         {
          add[i][j]=arr1[i][j]+arr2[i][j];
          System.out.print(add[i][j]+" ");
         } 
        System.out.print("\n"); 
      }
         
       System.out.println("Matrix subtraction give us the array:");
       
      for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
         {
          sub[i][j]=arr1[i][j]-arr2[i][j];
          System.out.print(sub[i][j]+" ");
         } 
        System.out.print("\n"); 
       }

    }
   else
    System.out.println("Pls enter the same number of rows and colums for both the matrices else addition and subtraction cannot be performed");

   }
  
}
 
     
     

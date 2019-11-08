package CIE;

import java.util.*;
public class Internals extends Student{
    Scanner sc=new Scanner(System.in);
    public int cie[]=new int[5];
    public Internals(){
        System.out.println("Enter the marks obtained in CIE in the 5 subjects");
        for(int i=0;i<5;i++){
            cie[i]=sc.nextInt();
        }
    }
}

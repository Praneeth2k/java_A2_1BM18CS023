package SEE;
import CIE.*;

import java.util.*;

public class External extends Internals{
    Scanner sc=new Scanner(System.in);
    public int see[]=new int[5];
    public External(){
        super();
        System.out.println("Enter the marks obtained SEE in the 5 subjects");
        for(int i=0;i<5;i++){
            see[i]=sc.nextInt();
        }
     }
}
    
   

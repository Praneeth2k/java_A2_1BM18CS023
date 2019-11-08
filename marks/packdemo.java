import SEE.*;
import CIE.*;

import java.util.*;

class packdemo{
    public static void main(String args[]){
        External ob=new External();
        for(int i=0;i<5;i++){
            System.out.println("Total marks in subject "+(i+1)+" is "+(ob.cie[i]+ob.see[i]));
         }
    }
}



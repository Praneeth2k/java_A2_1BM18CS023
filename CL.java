import java.util.*;
class CL{
	public static void main(String args[]){
		int largest=Integer.parseInt(args[0]);
		for(int i=1;i<args.length;i++){
			if(Integer.parseInt(args[i])>largest)
				largest=Integer.parseInt(args[i]);
			}
			
			
		
		System.out.println("The largest is "+largest);
	}
}	
    

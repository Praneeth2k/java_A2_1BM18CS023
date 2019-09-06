import java.util.*;
class Vehicle{
    public String model,color;
    public int year;
    public static int total_number_of_vehicles;
    
    Vehicle(String model,int year,String color){
        this.model=model;
        this.year=year;
        this.color=color;
        total_number_of_vehicles++;
    }
    void output(){
        System.out.println("Model:"+model+"\nColor:"+color+"\nyear:"+year);
    }
    static void total_cars(){
        System.out.println("The total number of cars are "+total_number_of_vehicles);
    }    
}
    
class VehicleDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String model,color;
        int year;
        System.out.println("Enter the number of vehicle");
        int n=sc.nextInt();
        Vehicle v[]=new Vehicle[n];
        System.out.println("Enter the details of the vehicles");
        for(int i=0;i<n;i++){
            
            System.out.println("vehicle 1");
            System.out.println("Enter the name");
            model=sc.next();
            System.out.println("What's it's color?");
            color=sc.next();
            System.out.println("Year of manufacturing?");
            year=sc.nextInt();
            
            v[i]=new Vehicle(model,year,color);
        }
    
          Vehicle.total_cars();
    }
}
        
            
            
            
           
    	
     
            
    
        
        


     package companyv2;

import java.util.ArrayList;


     public class PartTimeEmployee extends Employee {
     private int workedHours;
     private int priceOfHour=20;
     protected boolean inServing;

     public PartTimeEmployee(int workedHours, String name, String address, String birthdate, int sectionId) {
     super(name, address, birthdate, sectionId);
     this.workedHours = workedHours;
     super.idNumber+=0;
     super.inServing=true;
     }
  
   
     public int getWorkedHours() {
     return workedHours;
     }

     public void setWorkedHours(int workedHours) {
     this.workedHours = workedHours;
     }
    
     public int clacPay(){
       
     return workedHours*priceOfHour;
   
   
     }
     public static PartTimeEmployee addPartTimeEmployee(int workedHours,String name, String address, String birthdate, int sectionId){
     
     return new PartTimeEmployee(workedHours, name, address, birthdate, sectionId);
     }
     public void report(){
         
    //to call it in show part time employees 
       
     System.out.println("data of employee");
    System.out.println( "number is ==> "+getIdNumber()+"  name ==>  "+this.getName()+"  the address is ==> "+this.getAddress()+"work ed hours is ==>"+getWorkedHours());
    System.out.println("  birthDate is  ==> "+getBirthdate()+"section id ==>   "+ getSectionId());
    }
    //remove part time employee serving
     
    public static void removePartEmployee(ArrayList<PartTimeEmployee> list, int num) {
      list.remove(num); 
     System.out.println(" removed done");
    }
       //end part time employee serving
    public  void EndServingPartEmployee (){
    this.inServing=false;
    }
    }
     
     
     
     
     
    

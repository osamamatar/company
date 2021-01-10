
     package companyv2;

     import java.util.ArrayList;


     public class FullTimeEmployee extends Employee {
     private double salary;
     private int numOfYear;
     private int days;
    
     public FullTimeEmployee(){};

     public FullTimeEmployee(double salary, int numOfYear ,String name, String address, String birthdate,int sectionId) {
            super(name,address,birthdate,sectionId);
     this.salary = salary;
     this.numOfYear = numOfYear;
     super.idNumber+=0;
     super.inServing=true;
         
     }
    
    

     public double getSalary() {
     return salary;
     }

    public void setSalary(double salary)      
     {
     this.salary = salary;
     }

     public int getNumOfYear() {
     return numOfYear;
     }

     public void setNumOfYear(int numOfYear) {
     this.numOfYear = numOfYear;
     }
     public int getDays() {
     return days;
     }

     public void setDays(int days) {
     this.days = days;
     }
     public void updateYears(){
     setNumOfYear(getNumOfYear()+1);
      
     }
     public int calcLeave(){
     if(getNumOfYear()<10){
     //to do
     setDays(getNumOfYear()+15);
     System.out.println(getDays());
       
     }
     else if(getNumOfYear()>10){
     setDays(25);
     System.out.println(getDays());
            
     }
     return getDays();
     }

    
     public void report() {
     System.out.println("data of employee");
     System.out.println( "number is ==> "+getIdNumber()+"  name ==>  "+this.getName()+"  the address is ==> "+this.getAddress()+"  salary is ==>  "+this.getSalary());
     System.out.println("  birthDate is  ==> "+getBirthdate()+"  The number of rest days " +this.calcLeave()+" he took "+getNumOfDays()+" rest Days "+"section id ==>"+ getSectionId());
     }
     public static FullTimeEmployee addFullTimeEmployee(double salary, int numOfYear ,String name, String address, String birthdate,int sectionId) {
     FullTimeEmployee f=new FullTimeEmployee(salary, numOfYear, name, address, birthdate, sectionId);
        
     return f;
     }

        public void ShowfullLeave(){
          System.out.println("the leave of FullTime Employee :"+this.calcLeave());
        }
   
 
     public static void removeFullEmployee(ArrayList<FullTimeEmployee> list, int num) {
     list.remove(num); 
     System.out.println(" removed done");
    }

 public   void EndServingFullEmployee (){
     this.inServing=false; 
   }


}


     package companyv2;

     import java.util.ArrayList;


     public class Employee {
     private int numOfDays;
     private String name;
     protected static int idNumber=0;
     private String address;
     private String birthdate;
     private int sectionId;
     protected boolean inServing;

    public Employee(String name, String      address, String birthdate, int      sectionId) {
    this.name = name;
  //  this.idNumber = idNumber;
    this.address = address;
    this.birthdate = birthdate;
    this.sectionId = sectionId;
    this.inServing=true;
    }

   

    public Employee() {
    }
     

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public int getIdNumber() {
    return idNumber;
    }

  

    public String getAddress() {
    return address;
    }

    public void setAddress(String address) {
    this.address = address;
    }

    public String getBirthdate() {
    return birthdate;
    }

    public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
    }
    
    public int getSectionId() {
    return sectionId;
    }

    public void setSectionId(int sectionId) {
    this.sectionId = sectionId;
    }
    
 
     public void endServingEmployee(){
     this.inServing=false;
     
     }
    
   
     /*
     method to add new employee 
     return new employee object
     
     */
    public static Employee addEmployee(String name, String address, String birthdate, int sectionId){
       
    Employee e=new Employee(name, address, birthdate, sectionId);
    e.idNumber+=1;
    return e;
    
    }
     public static void removeEmployee(ArrayList<Employee> list,Employee e){
     list.remove(e);
     
     }


    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }
 

     
}


package companyv2;

import java.util.ArrayList;

/**
 *
 * @author osama
 */
public class LongServingEmployee extends FullTimeEmployee {

    protected boolean inServing;

    public LongServingEmployee() {

    }

    ;
    
    
      public LongServingEmployee(double salary, int numOfYear, String name, String address, String birthdate, int sectionId, boolean inServing) {
        super.inServing = true;
    }

    @Override
    public void setNumOfYear(int numOfYear) {
        if (numOfYear > 15) {
            super.setNumOfYear(numOfYear);
        } else {
            System.out.println("number of years is invalid ,the long serving employee should have  15 years at least ! ");
        }
    }

    @Override
    public int calcLeave() {
        if (super.getNumOfYear() > 15) {
            super.setDays(((super.getNumOfYear() - 15) / 2) + super.calcLeave());

            System.out.println(super.getDays());
        } else {
            System.out.println("here");
        }
        return super.getDays();
    }

    public static LongServingEmployee addLongServingEmployee(double salary, int numOfYear, String name, String address, String birthdate, int sectionId) {

        return new LongServingEmployee(salary, numOfYear, name, address, birthdate, sectionId);
    }

    public void report() {
        System.out.println("data of employee");
        System.out.println("number is ==> " + getIdNumber() + "  name ==>  " + this.getName() + "  the address is ==> " + this.getAddress() + "  salary is ==>  " + this.getSalary());
        System.out.println("  birthDate is  ==> " + getBirthdate() + "  The number of rest days " + this.calcLeave()+" he took "+getNumOfDays()+" rest Days "+ "section id ==>" + getSectionId());
    }

    public void ShowlongLeave() {
        System.out.println("the calcLeave of Long serving employee:  " + this.calcLeave());

    }

    public LongServingEmployee(double salary, int numOfYear, String name, String address, String birthdate, int sectionId) {
        super(salary, numOfYear, name, address, birthdate, sectionId);

        super.idNumber += 0;
    }

    public static void removelongEmployee(ArrayList<LongServingEmployee> list, int num) {
        list.remove(num);
        System.out.println(" removed done");
    }

    public void EndServingLongEmployee() {
        this.inServing = false;
    }

    public void addlongleave() {
        System.out.println("enter leave you want to add it");

    }
}

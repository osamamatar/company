package companyv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Util {

    public static void decor() {

        System.out.println("*****************************************************");
        System.out.println("************    welcom to my program     ************");
        System.out.println("*****************************************************");
        System.out.println("************    please add new employee   ***********");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");

    }

    public static ArrayList createDepartments(LongServingEmployee manager, String SecName) {
        ArrayList<Section> sec = new ArrayList<Section>();

        return sec;

    }

    public static void go() {

        ArrayList<FullTimeEmployee> fullList = new ArrayList<>();
        ArrayList<LongServingEmployee> longList = new ArrayList<>();
        ArrayList<PartTimeEmployee> partList = new ArrayList<>();

        //seeds data*****************
        fullList.add(FullTimeEmployee.addFullTimeEmployee(1000, 8, "hanaa", "13/mlxc", "12/12/1980", 1));
        //   fullList.add(FullTimeEmployee.addFullTimeEmployee(salary, numOfYrears, name, address, birthdate, sectionId));
        //  fullList.add(FullTimeEmployee.addFullTimeEmployee(salary, numOfYrears, name, address, birthdate, sectionId));

        longList.add(LongServingEmployee.addLongServingEmployee(1000, 12, "saadOsama", "12dfsssd", "12/12/1980", 1));
        longList.add(LongServingEmployee.addLongServingEmployee(1000, 14, "saadOsama", "3effdvfv", "12/12/1980", 2));
        longList.add(LongServingEmployee.addLongServingEmployee(1000, 12, "saadOsama", "44fdjnf", "12/12/1980", 3));

        partList.add(PartTimeEmployee.addPartTimeEmployee(100, "saadOsama", "12dfsssd", "12/12/1980", 1));
        //  partList.add(PartTimeEmployee.addPartTimeEmployee(workedHours, name, address, birthdate, sectionId));
        // partList.add(PartTimeEmployee.addPartTimeEmployee(workedHours, name, address, birthdate, sectionId));
        //++++++++++++++++++++++++++++++++++++++++++++
        int iscontinue = 2;
        System.out.println("** plz choose number : ");
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("*****************************************************");
            System.out.println("**   [1] new full time employee           ***********");
            System.out.println("**   [2] new long  serving employee       ***********");
            System.out.println("**   [3] new part time employee           ***********");
            System.out.println("*****************************************************");
            System.out.println("** choose number : ");
            switch (Integer.parseInt(input.next())) {
                case 1:
                    //if the uder choose fulltime employee
                    System.out.println(" enter name");
                    String name = input.next();
                    System.out.println(" enter address");
                    String address = input.next();
                    System.out.println(" enter birthdate");
                    String birthdate = input.next();
                    System.out.println(" enter sectionId");
                    int sectionId = Integer.parseInt(input.next());
                    System.out.println(" enter salary");
                    int salary = Integer.parseInt(input.next());
                    System.out.println(" enter numOfYrears");
                    int numOfYrears = Integer.parseInt(input.next());
                    fullList.add(FullTimeEmployee.addFullTimeEmployee(salary, numOfYrears, name, address, birthdate, sectionId));
                    System.out.println("** full time employee added ");
                    break;
                case 2:
                    System.out.println(" enter name");
                    name = input.next();
                    System.out.println(" enter address");
                    address = input.next();
                    System.out.println(" enter birthdate");
                    birthdate = input.next();
                    System.out.println(" enter sectionId");
                    sectionId = Integer.parseInt(input.next());
                    System.out.println(" enter salary");
                    salary = Integer.parseInt(input.next());
                    System.out.println(" enter numOfYrears");
                    numOfYrears = Integer.parseInt(input.next());
                    longList.add(LongServingEmployee.addLongServingEmployee(salary, numOfYrears, name, address, birthdate, sectionId));
                    System.out.println("** long time employee added ");

                    break;
                case 3:
                    System.out.println(" enter name");
                    name = input.next();
                    System.out.println(" enter address");
                    address = input.next();
                    System.out.println(" enter birthdate");
                    birthdate = input.next();
                    System.out.println(" enter sectionId");
                    sectionId = Integer.parseInt(input.next());
                    System.out.println(" enter workedHours");
                    int workedHours = Integer.parseInt(input.next());
                    partList.add(PartTimeEmployee.addPartTimeEmployee(workedHours, name, address, birthdate, sectionId));
                    System.out.println("** part time employee added    ");
                    break;
                default:
                    System.out.println("** wrong input ");
            }

            System.out.println("** [1]  add anthor employee   ");
            System.out.println("** [2]  to contiune           ");
            System.out.println("** [3]  Exit                  ");

            iscontinue = Integer.parseInt(input.next());

            if (iscontinue == 3) {
                System.out.println("exit...");
                // Terminate JVM 
                System.exit(0);
            }

        } while (iscontinue == 1);

        Util.createDepartments(longList.get(0), " IT       ");
        Util.createDepartments(longList.get(1), "production");
        ArrayList<Section> section = Util.createDepartments(longList.get(2), "accounting");

        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");

        System.out.println("**  enter number [1] if you want to remove an employee                      *****************");

        System.out.println("**  enter number [2] if you want to end an employee serving                 *****************");

        System.out.println("**  enter number [3] if you want to add leave to an employee                *****************");

        System.out.println("**  enter number [4] if you want to show part time employee list            *****************");

        System.out.println("**  enter number [5] if you want to show deserved leave to any employee     *****************");

        System.out.println("**  enter number [6] if you want to show employees in any section           *****************");

        System.out.println("**  enter number [7] if you want to show all sections and the employees inside **************");
        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");

        iscontinue = Integer.parseInt(input.next());
        switch (iscontinue) {
//            *************************************************************************************************
            case 1:
                System.out.println("enter number [1] if you want to remove an Full employee                      ");
                System.out.println("enter number [2] if you want to remove an Long employee                      ");
                System.out.println("enter number [3] if you want to remove an part employee                      ");
                iscontinue = Integer.parseInt(input.next());
                switch (iscontinue) {
                    case 1:
                        for (int i = 0; i < fullList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            fullList.get(i).report();
                            System.out.println("***********************************************************************");
                        }

                        System.out.println("enter index of Full employee to remove hem    ");
                        iscontinue = Integer.parseInt(input.next());

                        FullTimeEmployee.removeFullEmployee(fullList, iscontinue);

                        break;
                    case 2:
                        for (int i = 0; i < longList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            longList.get(i).report();
                            System.out.println("***********************************************************************");
                        }

                        System.out.println("enter index of Long employee to remove hem    ");
                        iscontinue = Integer.parseInt(input.next());
                        LongServingEmployee.removelongEmployee(longList, iscontinue);

                        break;
                    case 3:

                        for (int i = 0; i < partList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            partList.get(i).report();
                            System.out.println("***********************************************************************");
                        }

                        System.out.println("enter index of part employee to{} remove hem    ");
                        iscontinue = Integer.parseInt(input.next());

                        PartTimeEmployee.removePartEmployee(partList, iscontinue);
                        for (int i = 0; i < partList.size(); i++) {
                            partList.get(i).report();
                        }
                        break;
                }
                break;
//          *************************************************************************************************
            case 2:
                //to end Employee serving
                System.out.println("enter number [1] if you want to end an Full employee  serving                ");
                System.out.println("enter number [2] if you want to end an Long employee serving                 ");
                System.out.println("enter number [3] if you want to end an part employee serving                 ");
                iscontinue = Integer.parseInt(input.next());
                switch (iscontinue) {
                    case 1:
                        for (int i = 0; i < fullList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            fullList.get(i).report();
                            System.out.println("***********************************************************************");
                        }

                        System.out.println("enter index of Full employee to end hem    ");
                        iscontinue = Integer.parseInt(input.next());
                        fullList.get(iscontinue).EndServingFullEmployee();
                        for (int i = 0; i < fullList.size(); i++) {
                            fullList.get(i).report();
                        }

                        break;
                    case 2:
                        for (int i = 0; i < longList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            longList.get(i).report();
                            System.out.println("***********************************************************************");
                        }

                        System.out.println("enter index of Full employee to end hem    ");
                        iscontinue = Integer.parseInt(input.next());
                        longList.get(iscontinue).EndServingLongEmployee();
                        for (int i = 0; i < longList.size(); i++) {
                            longList.get(i).report();
                        }

                        break;
                    case 3:

                        for (int i = 0; i < partList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            partList.get(i).report();
                            System.out.println("***********************************************************************");
                        }

                        System.out.println("enter index of Full employee to end hem    ");
                        iscontinue = Integer.parseInt(input.next());
                        partList.get(iscontinue).EndServingPartEmployee();
                        for (int i = 0; i < partList.size(); i++) {
                            partList.get(i).report();
                        }

                        break;

                }
            //            *************************************************************************************************
            case 3:
                // to add leave to an employee
                System.out.println("**********************************************************************          ");
                System.out.println("**  enter number [1] if you want to add leave of FullTime Employee          ");
                System.out.println("**  enter number [2] if you want to add leave of Long time employee         ");
                System.out.println("**********************************************************************          ");
                iscontinue = Integer.parseInt(input.next());
                switch (iscontinue) {
                    case 1:
                        System.out.println("enter index of full time employee you want to add leave to him ");

                        for (int i = 0; i < fullList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            fullList.get(i).report();
                            System.out.println("***********************************************************************");
                        }
                        iscontinue = Integer.parseInt(input.next());
                        System.out.println("enter number of days ? ");

                        fullList.get(iscontinue).setNumOfDays(Integer.parseInt(input.next()));

                        break;
                    case 2:
                        System.out.println("enter index of full time employee you want to add leave to him ");

                        for (int i = 0; i < longList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            longList.get(i).report();
                            System.out.println("***********************************************************************");
                        }
                        iscontinue = Integer.parseInt(input.next());
                        System.out.println("enter number of days ? ");

                        longList.get(iscontinue).setNumOfDays(Integer.parseInt(input.next()));

                        System.out.println("the leave added Successfully!");
                        break;
                }
                break;
            //         *************************************************************************************************
            case 4:
                //to show part time employees  
                for (int i = 0; i < partList.size(); i++) {
                    partList.get(i).report();
                }
                break;
            //          *************************************************************************************************           
            case 5:
                //to show deserved leave to any employee
                System.out.println("**********************************************************************          ");
                System.out.println("**  enter number [1] if you want to show leave of FullTime Employee          ");
                System.out.println("**  enter number [2] if you want to show leave of Long time employee         ");
                System.out.println("**********************************************************************          ");
                iscontinue = Integer.parseInt(input.next());

                switch (iscontinue) {
                    case 1:
                        System.out.println("enter index of full time employee you want to show  his serving ");

                        for (int i = 0; i < fullList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            fullList.get(i).report();
                            System.out.println("***********************************************************************");
                        }
                        iscontinue = Integer.parseInt(input.next());
                        System.out.println(fullList.get(iscontinue).calcLeave() + " days");

                        break;
                    case 2:

                        System.out.println("enter index of long time employee you want to show  his serving ");

                        for (int i = 0; i < longList.size(); i++) {
                            System.out.println("***********************************************************************");
                            System.out.print("**[" + i + "]  ");
                            longList.get(i).report();
                            System.out.println("***********************************************************************");
                        }
                        iscontinue = Integer.parseInt(input.next());
                        System.out.println(longList.get(iscontinue).calcLeave() + " days");

                        break;
                }
                break;
            //           *************************************************************************************************
            case 6:
                //to show employees in any section
                System.out.println("[1] it ");
                System.out.println("[2] prudaction");
                System.out.println("[3] accounting ");

                System.out.println("enter index of section ");
                iscontinue = Integer.parseInt(input.next());

                ArrayList<String> sectionMember = new ArrayList<>();

                for (int i = 0; i < fullList.size(); i++) {
                    if (fullList.get(i).getSectionId() == iscontinue) {
                        sectionMember.add(fullList.get(i).getName());

                    }
                }
                for (int i = 0; i < longList.size(); i++) {
                    if (longList.get(i).getSectionId() == iscontinue) {
                        sectionMember.add(longList.get(i).getName());

                    }
                }
                for (int i = 0; i < partList.size(); i++) {
                    if (partList.get(i).getSectionId() == iscontinue) {
                        sectionMember.add(partList.get(i).getName());

                    }
                }

                for (int i = 0; i < sectionMember.size(); i++) {
                    System.out.println("[" + i + 1 + "] " + sectionMember.get(i));
                }

                break;

// **********************************************************************************************************************
            case 7:

                // to view all department and employees inside>>
                ArrayList<String> sec1Show = new ArrayList<>();

                for (int i = 0; i < fullList.size(); i++) {
                    if (fullList.get(i).getSectionId() == 1) {
                        sec1Show.add(fullList.get(i).getName());

                    }
                }
                for (int i = 0; i < longList.size(); i++) {
                    if (longList.get(i).getSectionId() == 1) {
                        sec1Show.add(longList.get(i).getName());

                    }
                }
                for (int i = 0; i < partList.size(); i++) {
                    if (partList.get(i).getSectionId() == 1) {
                        sec1Show.add(partList.get(i).getName());

                    }
                }
                //==================================================================
                ArrayList<String> sec2Show = new ArrayList<>();
                for (int i = 0; i < fullList.size(); i++) {
                    if (fullList.get(i).getSectionId() == 2) {
                        sec1Show.add(fullList.get(i).getName());

                    }
                }
                for (int i = 0; i < longList.size(); i++) {
                    if (longList.get(i).getSectionId() == 2) {
                        sec1Show.add(longList.get(i).getName());

                    }
                }
                for (int i = 0; i < partList.size(); i++) {
                    if (partList.get(i).getSectionId() == 2) {
                        sec1Show.add(partList.get(i).getName());

                    }
                }
                // ============================================
                ArrayList<String> sec3Show = new ArrayList<>();
                for (int i = 0; i < fullList.size(); i++) {
                    if (fullList.get(i).getSectionId() == 3) {
                        sec1Show.add(fullList.get(i).getName());

                    }
                }
                for (int i = 0; i < longList.size(); i++) {
                    if (longList.get(i).getSectionId() == 3) {
                        sec1Show.add(longList.get(i).getName());

                    }
                }
                for (int i = 0; i < partList.size(); i++) {
                    if (partList.get(i).getSectionId() == 3) {
                        sec1Show.add(partList.get(i).getName());

                    }
                }
                //===================================================
                System.out.println("******** IT DEPARTMENT ***********");
                for (int i = 0; i < sec1Show.size(); i++) {

                    System.out.println("[" + i + 1 + "] " + sec1Show.get(i));
                }
                System.out.println("******** PRODUCATION DEPARTMENT ***********");
                for (int i = 0; i < sec2Show.size(); i++) {

                    System.out.println("[" + i + 1 + "] " + sec2Show.get(i));
                }
                System.out.println("******** ACOUNTING DEPARTMENT ***********");
                for (int i = 0; i < sec3Show.size(); i++) {

                    System.out.println("[" + i + 1 + "] " + sec3Show.get(i));
                }

                break;

        }

    }

}

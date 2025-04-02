package HospitalManagementSystem.src;

import java.util.*;
public class hospital implements utility {
    String hospital_name;
    String hospital_address;
    int total_staff;
    int total_patient = 0;
    String HeadDoc_name;
    
    @Override
    public void get_details() {
        System.out.println("Hospital Name: "+hospital_name);
        System.out.println("Hospital Address: "+hospital_address);
        System.out.println("Head Doctor Name: "+HeadDoc_name);
        System.out.println("Total Employees: "+total_staff);
        System.out.println("Total patient: "+total_patient);

    }

    @Override
     public void set_details(){
         Scanner sc = new Scanner(System.in);
         System.out.println("======================= *** ENTER HOSPITAL DETAILS *** =======================");
         System.out.println();
         System.out.print("HOSPITAL NAME: ");
         hospital_name = sc.nextLine();
         System.out.print(("HOSPITAL ADDRESS: "));
         hospital_address = sc.nextLine();
         System.out.print("HEAD DOCTOR IN CHARGE NAME: ");
         HeadDoc_name = sc.nextLine();
         System.out.print("TOTAL NO OF STAFF: ");
         total_staff = sc.nextInt();
         System.out.print("TOTAL PATIENT: ");
         total_patient = sc.nextInt();
 
     }
}

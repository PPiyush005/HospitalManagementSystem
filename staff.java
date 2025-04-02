package HospitalManagementSystem.src;

import java.util.*;

public class staff extends hospital implements utility  {
    String sta_id;
    String sta_name;
    int sta_age;
    String sta_department;
    String sta_designation;
    
     @Override
     public void get_details() {
         System.out.println("ID: "+sta_id);
         System.out.println("Name: "+sta_name);
         System.out.println("Age: "+sta_age);
         System.out.println("Department: "+sta_department);
         System.out.println("Designation: "+sta_designation);
         System.out.println("Showroom Name: "+hospital_name);
 
     }
     @Override
     public void set_details(){
         Scanner sc = new Scanner(System.in);
         UUID uuid = UUID.randomUUID();
         sta_id = String.valueOf(uuid);
         System.out.println("======================= *** ENTER STAFF DETAILS *** =======================");
         System.out.println();
         System.out.print("STAFF NAME: ");
         sta_name = sc.nextLine();
         System.out.print(("STAFF AGE: "));
         sta_age = sc.nextInt();
         sc.nextLine();
         System.out.print("STAFF DEPARTMENT: ");
         sta_department = sc.nextLine();
         System.out.println("STAFF DESIGNATION: ");
         sta_designation = sc.nextLine();
         System.out.print("HOSPITAL NAME: ");
         hospital_name = sc.nextLine();
 
 
     }
}

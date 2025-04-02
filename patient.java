package HospitalManagementSystem.src;

import java.util.Scanner;

public class patient extends hospital implements utility {
    String pat_name;
    String pat_sex;
    int    pat_age;
    int    pat_height;
    int    pat_weight;
    String pat_problem;

    @Override
     public void get_details(){
         System.out.println("NAME: "+pat_name);
         System.out.println("SEX: "+pat_sex);
         System.out.println("AGE: "+pat_age);
         System.out.println("HEIGHT: "+pat_height);
         System.out.println("WEIGHT: "+pat_weight);
         System.out.println("PROBLEM RELATED TO: "+pat_problem);
     }
 
     @Override
     public void set_details(){
         Scanner sc = new Scanner(System.in);
         System.out.println("======================= *** ENTER PATIENT DETAILS *** =======================");
         System.out.println();
         System.out.print("PATIENT NAME: ");
         pat_name = sc.nextLine();
         System.out.print(("PATIENT SEX(M/F): "));
         pat_sex = sc.nextLine();
         System.out.print("PATIENT AGE: ");
         pat_age = sc.nextInt();
         System.out.print("PATIENT HEIGHT: ");
         pat_height = sc.nextInt();
         sc.nextLine();
         System.out.print("PATIENT WEIGHT: ");
         pat_weight = sc.nextInt();
         System.out.print("PROBLEM RELATED TO: ");
         pat_problem = sc.nextLine();
         total_patient++;
     }
}

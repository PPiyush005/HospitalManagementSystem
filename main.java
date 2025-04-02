package HospitalManagementSystem.src;

import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class main {
    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO HOSPITAL MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD HOSPITAL \t\t\t 2].ADD STAFF \t\t\t 3].ADD PATIENT");
        System.out.println();
        System.out.println("4].GET HOSPITAL \t\t\t 5].GET STAFF \t\t\t 6].GET PATIENT");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hospital hospital[] =new hospital[100];
        staff staff[]= new staff[100];
        patient patient[] = new patient[100];

        int patient_counter=0;
        int hospital_counter=0;
        int staff_counter=0;

        int choice=100;

        while(choice!=0){
 
            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                    hospital [hospital_counter] = new hospital();
                    hospital [hospital_counter].set_details();
                    hospital_counter++;
                    System.out.println();
                    System.out.println("1].ADD NEW HOSPITAL");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;

                    case 2:
                    staff [staff_counter] = new staff();
                    staff [staff_counter].set_details();
                    staff_counter++;
                    System.out.println();
                    System.out.println("2].ADD NEW STAFF");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;
                    
                    case 3:
                    patient[patient_counter] = new patient();
                    patient[patient_counter].set_details();
                    patient_counter++;
                    System.out.println();
                    System.out.println("3].ADD NEW PATIENT");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;

                         case 4:
                         for (int i = 0; i < hospital_counter; i++) {
                             hospital [i].get_details();
                             System.out.println();
                             System.out.println();
                         }
                         System.out.println();
                         System.out.println("9].GO BACK TO MAIN MENU");
                         System.out.println("0].EXIT");
                         choice = sc.nextInt();
                         break;

                         case 5:
                         for (int i = 0; i < staff_counter; i++) {
                             staff [i].get_details();
                             System.out.println();
                             System.out.println();
                         }
                         System.out.println();
                         System.out.println("9].GO BACK TO MAIN MENU");
                         System.out.println("0].EXIT");
                         choice = sc.nextInt();
                         break;

                         case 6:
                         for (int i = 0; i < patient_counter; i++) {
                             patient [i].get_details();
                             System.out.println();
                             System.out.println();
                         }
                         System.out.println();
                         System.out.println("9].GO BACK TO MAIN MENU");
                         System.out.println("0].EXIT");
                         choice = sc.nextInt();
                         break;

                         default:
                         System.out.println("ENTER VALID CHOICE: ");
                         break;
                }
            }
        }
    }
}

package com.bridgelabz;


import javax.swing.plaf.synth.SynthOptionPaneUI;
 import java.util.ArrayList;
import java.util.Scanner;

    public class AddressBook {
        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program");
            ContactPerson contactPersonDetails = new ContactPerson();
            ArrayList<ContactPerson> contactDetails = new ArrayList<>();
            String name;
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            int userChoice = 1;
            // User Choose the Option
            while (flag) {
                System.out.print(" 1 - Add more contact \n2 - Edit Contact \n3 - Delete Person Contact \n4 - Show AddressBook " + "\n0 - for exist \n Enter your choice");
                userChoice = sc.nextInt();

                switch (userChoice) {
                    case 1:
                        contactDetails.add(contactPersonDetails.getInput());
                        break;
                    case 2:
                        System.out.println("Enter first name that you want to edit contactDetails");
                        name = sc.next();
                        contactPersonDetails.updateData(name, contactDetails);
                        break;
                    case 3:
                        System.out.println("Enter the first name that you want to delete Contact details ");
                        name = sc.next();
                        contactPersonDetails.deleteRecord(name, contactDetails);
                        break;

                    case 4:
                        System.out.println("contactDetails : " + contactDetails.size());
                        contactPersonDetails.addressBook(contactDetails);
                        break;
                    case 0:
                        flag = false;
                        break;
                }
            }
        }
    }
}
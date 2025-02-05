package CarShowRoomManagement.com;

import java.util.Scanner;

public class ShowRoom implements main.utility {

    String ShowRoom_name;
    String ShowRoom_Address;
    String Manager_name;
    int total_number_of_Employee;
    int Total_car_in_Stock = 0;

    @Override
    public void get_details() {
        System.out.println("ShowRoom Name = " + ShowRoom_name);
        System.out.println("ShowRoom Address = "+ ShowRoom_Address);
        System.out.println("Manager Name = "+ Manager_name);
        System.out.println("Total_number of Employee = "+ total_number_of_Employee);
        System.out.println("Total number of cars = " + Total_car_in_Stock);
    }

    @Override
    public void set_details() {
        Scanner src = new Scanner(System.in);
        System.out.println("==================Enter Car Details======================");
        System.out.println();
        System.out.print("Enter ShowRoom Name = ");
        ShowRoom_name = src.nextLine();
        System.out.print("Enter ShowRoom Address = ");
        ShowRoom_Address = src.nextLine();
        System.out.print("Enter Manager Name = ");
        Manager_name = src.nextLine();
        System.out.print("Total_number of Employee = ");
        total_number_of_Employee = Integer.parseInt(src.nextLine());
        Total_car_in_Stock++;
    }
}

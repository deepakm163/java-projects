package CarShowRoomManagement.com;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends ShowRoom implements main.utility {

     String emp_name;
     String emp_id;
     int emp_age;
     String emp_department;

    @Override
    public void get_details() {
        System.out.println("Employee ID = "+ emp_id);
        System.out.println("Employee Name = "+ emp_name);
        System.out.println("Employee Age = "+ emp_age);
        System.out.println("Employee work in Department = "+ emp_department);
        System.out.println("ShowRoom Name = "+ ShowRoom_name);
    }

    @Override
    public void set_details() {
        Scanner src = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("==================Enter Employee Details============================");
        System.out.println();
        System.out.print("Employee Name = ");
        emp_name = src.nextLine();
        System.out.print("Employee age = ");
        emp_age = Integer.parseInt(src.nextLine());
        System.out.print("Employee Department Name = ");
        emp_department = src.nextLine();
    }
}

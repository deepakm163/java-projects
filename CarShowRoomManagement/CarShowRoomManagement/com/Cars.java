package CarShowRoomManagement.com;

import java.util.Scanner;

public class Cars extends ShowRoom implements main.utility {

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println("Car Name = " + car_name);
        System.out.println("Car Color = " + car_color);
        System.out.println("Car fuel type = " + car_fuel_type);
        System.out.println("Car price = " + car_price);
        System.out.println("Car Type = " + car_type);
        System.out.println("Car Transmission = " + car_transmission);
    }

    @Override
    public void set_details() {
        Scanner src = new Scanner(System.in);
        System.out.println("==================Enter Car Details======================");
        System.out.println();
        System.out.print("Enter Car Name = ");
        car_name = src.nextLine();
        System.out.print("Enter Car Color = ");
        car_color = src.nextLine();
        System.out.print("Enter Car Fuel Type = ");
        car_fuel_type = src.nextLine();
        System.out.print("Enter Car Price = ");
        car_price = Integer.parseInt(src.nextLine());
        System.out.print("Enter Car Type = ");
        car_type = src.nextLine();
        System.out.print("Enter Car Transmission = ");
        car_transmission = src.nextLine();

    }
}

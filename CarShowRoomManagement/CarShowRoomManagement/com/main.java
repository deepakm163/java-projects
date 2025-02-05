package CarShowRoomManagement.com;

import java.util.Scanner;

public class main {
    interface utility{

        public void get_details();
        public void set_details();

    }

     static void menu(){
        System.out.println();
        System.out.println("======================Enter your Choice===================");
        System.out.println();
        System.out.println();
        System.out.println("1] ADD ShowRoom\t\t 2] ADD Employee\t\t 3] ADD Cars");
        System.out.println();
        System.out.println("4] Get ShowRoom\t\t 5] Get Employee\t\t 6] Get Cars");
        System.out.println();
        System.out.println("================== 0] To Exits ============================");

    }

    public static void main(String[] args){

        Scanner src = new Scanner(System.in);
        ShowRoom[] showRoom = new ShowRoom[5];
        Employee []employees = new Employee[5];
        Cars []car = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employee_counter = 0;
        int choice = 100;

        while(choice != 0){
            menu();
            choice = src.nextInt();

            while(choice != 9 && choice != 0){
                switch (choice){
                    case 1:
                        showRoom[showroom_counter] = new ShowRoom();
                        showRoom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1] ADD New ShowRoom");
                        System.out.println("9] Go Back To Menu ");
                        choice = src.nextInt();
                        break;
                    case 2:
                        employees[employee_counter] = new Employee();
                        employees[employee_counter].set_details();
                        employee_counter++;
                        System.out.println();
                        System.out.println("1] ADD New Employees");
                        System.out.println("9] Go Back To Menu ");
                        choice = src.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("1] ADD New Cars");
                        System.out.println("9] Go Back To Menu");
                        choice = src.nextInt();
                        break;
                    case 4:

                        for(int i = 0; i < showroom_counter; i++){
                            showRoom[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Menu ");
                        System.out.println("0] To Exits");
                        choice = src.nextInt();
                        break;
                    case 5:
                        for(int i = 0; i < employee_counter; i++){
                            employees[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Menu ");
                        System.out.println("0] To Exits");
                        choice = src.nextInt();
                        break;
                    case 6:
                        for(int i = 0; i < car_counter; i++){
                            car[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Menu ");
                        System.out.println("0] To Exits");
                        choice = src.nextInt();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
        }


    }
}

package java08.ex02;

import java.util.Scanner;

public class Declaration {
    private static final String VEHICLE_OWNER_NAME = "Tên Chủ Xe";
    private static final String KIND_OF_VEHICLE = "Loại Xe";
    private static final String CAPACITY = "Dung Tích";
    private static final String VALUE_OF_VEHICLE = "Giá Trị Xe";
    private static final String TAX_MONEY = "Thuế Phải Nộp";

    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        /*Vehicle vehicle1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000.00);
        Vehicle vehicle2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000.00);
        Vehicle vehicle3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000.00);

        exportDeclaration(vehicle1, vehicle2, vehicle3);*/
        Vehicle[] vehicles = new Vehicle[3];
        int choice;
        do {
            System.out.println("--------------------Menu-----------------");
            System.out.println("1. Enter vehicle");
            System.out.println("2. Declarate information of vehicle");
            System.out.println("3. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(ip.nextLine());

            switch (choice) {
                case 1:
                    fillInformationOfVehicle(vehicles);
                    break;
                case 2:
                    exportDeclaration(vehicles);
                    break;

                case 3:
                    return;
            }
        } while (choice > 0 && choice < 3);
    }

    private static void fillInformationOfVehicle(Vehicle[] vehicles) {
        int capacity = 0;
        boolean check = true;
        double valueOfVvehicle = 0.0;
        for (int i = 0; i < vehicles.length; i++) {
            System.out.print("Enter vehicle owner name: ");
            String vehicleOwnerName = ip.nextLine();
            System.out.print("Enter kind of vehicle: ");
            String kindOfVehicle = ip.nextLine();
            do {
                try {
                    System.out.print("Enter capacity: ");
                    capacity = Integer.parseInt(ip.nextLine());
                    check = true;

                } catch (NumberFormatException e) {
                    check = false;
                    System.out.println("That variable is not a numberic!!!");
                }
            } while (!check);

            do {
                try {
                    System.out.print("Enter value of vehicle: ");
                    valueOfVvehicle = Double.parseDouble(ip.nextLine());
                    check = true;

                } catch (NumberFormatException e) {
                    check = false;
                    System.out.println("That variable is not a numberic!!!");
                }
            } while (!check);
            vehicles[i] = new Vehicle(vehicleOwnerName, kindOfVehicle, capacity, valueOfVvehicle);
        }

    }

    private static void exportDeclaration(Vehicle[] vehicles) {
        if (vehicles.length == 0) {
            System.out.println("Don't have any vehicle!!!");
            return;
        }
        System.out.format("%20s %15s %15s %20s %20s", VEHICLE_OWNER_NAME, KIND_OF_VEHICLE, CAPACITY, VEHICLE_OWNER_NAME, TAX_MONEY);
        System.out.println("\n===============================================================================================");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.printf("%20s %15s %15s %20s %20s", vehicles[i].getVehicleOwnerName(), vehicles[i].getKindOfVehicle(), vehicles[i].getCapacity(), vehicles[i].getValueOfVehivle(), vehicles[i].getTaxMoney());
            System.out.println();
        }
        System.out.println();

    }
}

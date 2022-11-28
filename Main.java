package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<AddFoodForMenu> Menulist = new ArrayList<>();

        int select1, select2, select3;
        try (Scanner input = new Scanner(System.in)) {
            Admin adminobj = new Admin();
            ManageFood managefoodobj = new ManageFood();
            adminobj.Password();

            do {
                adminobj.Mainmenu();
                System.out.print("Please Enter Your Choice: ");
                select1 = input.nextInt();

                switch (select1) {
                    case 1:
                        do {
                            adminobj.ManageFoodMenu();
                            System.out.print("Please Enter Your Choice: ");
                            select2 = input.nextInt();
                            switch (select2) {
                                case 1 -> managefoodobj.add();
                                case 2 -> managefoodobj.Print();
                                case 3 -> {
                                    managefoodobj.Print();
                                    managefoodobj.EditFood();
                                }
                                case 4 -> {
                                    managefoodobj.Print();
                                    managefoodobj.DeleteFood();
                                }
                                case 5 -> managefoodobj.PrintOrder();
                                case 6 -> managefoodobj.Search();
                                case 0 -> System.out.println("Back to the Menu");
                                default -> {
                                }
                            }
                        } while (select2 != 0);
                        break;
                    case 2:

                        do {
                            adminobj.MenuOrder();
                            System.out.print("Please Enter Your Choice: ");
                            select3 = input.nextInt();
                            switch (select3) {
                                case 1 -> managefoodobj.Print();
                                case 2 -> {
                                    adminobj.AllSeats();
                                    managefoodobj.Price();
                                }
                                case 0 -> System.out.println("Back to the Menu");
                                default -> {
                                }
                            }
                        } while (select3 != 0);
                        break;

                    default:
                        break;
                }
            } while (select1 != 0);
        }


    }

}
package case_study_furama.view;

import case_study_furama.model.Booking;
import case_study_furama.util.CommomUtil;
import case_study_furama.util.ValidationUtil;

public class HomeView {
    public static void main(String[] args) {
        displayHomeMenu();
    }

    public static void displayHomeMenu(){
        BookingView.bookingManager();
/*        String tmp= "";
        int choice= 0;
        do {
            System.out.println("Welcome to Furama Resort.\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");

            System.out.print(tmp.isEmpty() ? "Input your choice: ": "Please just input number from 1 to 6: ");
            tmp = CommomUtil.getScanner().nextLine();
            if(ValidationUtil.isNumber(tmp)) choice= Integer.parseInt(tmp);
        }
        while (choice <= 0 || choice > 6);

        switch (choice){
            case 1:
                EmployeeView.emplayeeManager();
                break;
            case 2:
                CustomerView.customerManager();
                break;
            case 3:
                FacilityView.facilityManager();
                break;
            case 4:
                BookingView.bookingManager();
                break;
            case 5:

                break;
        }*/

        backToHomeMenu();
    }

    private static void backToHomeMenu(){
        System.out.print("Do you back to main menu (Y/N): ");
        if(CommomUtil.getScanner().nextLine().equalsIgnoreCase("y")) displayHomeMenu();
        else System.exit(0);
    }

//
//    private static void promotionManager(){
//        String tmp= "";
//        int choice= 0;
//        do {
//            System.out.println("1. Display list customers use service");
//            System.out.println("2. Display list customers get voucher");
//            System.out.println("3. Return main menu");
//
//            System.out.print(tmp.isEmpty() ? "Input your choice: ": "Please just input number from 1 to 3: ");
//            tmp = scanner.nextLine();
//            if(ValidationUtil.isNumber(tmp)) choice= Integer.parseInt(tmp);
//        }
//        while (choice <= 0 || choice > 3);
//    }
//

}

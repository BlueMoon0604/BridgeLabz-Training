package futureLogistic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility util = new Utility();

        System.out.println("Enter transport details:");
        String input = sc.nextLine();

        GoodsTransport gt = util.parseDetails(input);

        if (!util.validateTransportId(gt.getTransportId())) {
            System.out.println("Please provide a valid record");
            return;
        }

        String type = util.findObjectType(gt);
        float total = gt.calculateTotalCharge();

        System.out.println("Transport Id: " + gt.getTransportId());
        System.out.println("Transport Date: " + gt.getTransportDate());
        System.out.println("Transport Rating: " + gt.getTransportRating());
        System.out.println("Transport Type: " + type);
        System.out.println("Vehicle Type: " + gt.vehicleSelection());
        System.out.println("Total Charge: Rs." + total);

        sc.close();
    }
}

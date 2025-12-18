public class ProfitAndLoss {
    public static void main(String[] args) {
        double CostPrice = 129;
        double SellingPrice = 191;
        double Profit  = SellingPrice - CostPrice;
        double Loss= CostPrice - SellingPrice;
        double ProPercent = (Profit / CostPrice) * 100 ;
        double LossPercent = (Loss / CostPrice) * 100 ;
        System.out.println("The Cost Price is INR " + CostPrice + " and Selling Price is INR " + SellingPrice +"\n" + "The profit is INR " + Profit + "and The Profit Percent is " + ProPercent + "\n" + "The Loss is INR " + Loss + "and The Loss Percent is " + LossPercent );

    }
     
}

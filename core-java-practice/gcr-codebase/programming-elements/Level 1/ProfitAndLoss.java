public class ProfitAndLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit  = sellingPrice - costPrice;
        double loss= costPrice - sellingPrice;
        double proPercent = (profit / costPrice) * 100 ;
        double lossPercent = (loss / costPrice) * 100 ;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +"\n" + "The profit is INR " + profit + "and The Profit Percent is " + proPercent + "\n" + "The Loss is INR " + loss + "and The Loss Percent is " + lossPercent );

    }
     
}

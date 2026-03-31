package futureLogistic;

public class Utility {
    public boolean validateTransportId(String transportId) {
        if (transportId.matches("RTS\\d{3}[A-Z]"))
            return true;

        System.out.println("Transport Id " + transportId + " is invalid");
        return false;
    }
    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");
        String transportId = data[0];
        String transportDate = data[1];
        int rating = Integer.parseInt(data[2]);
        String type = data[3];

        if (type.equalsIgnoreCase("BrickTransport")) {

            float brickSize = Float.parseFloat(data[4]);
            int qty = Integer.parseInt(data[5]);
            float price = Float.parseFloat(data[6]);

            return new BrickTransport(transportId, transportDate, rating,
                    brickSize, qty, price);
        }
        else {

            float length = Float.parseFloat(data[4]);
            float radius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);

            return new TimberTransport(transportId, transportDate, rating,
                    length, radius, timberType, timberPrice);
        }
    }
    public String findObjectType(GoodsTransport g) {

        if (g instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }
}

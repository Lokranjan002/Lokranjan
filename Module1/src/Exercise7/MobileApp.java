package Exercise7;

public class MobileApp implements Observer {
    public void update(String stockName, double price) {
        System.out.println("Mobile App: " + stockName + " is now $" + price);
    }
}

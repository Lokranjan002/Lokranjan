package Exercise7;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockData("AAPL", 189.5);
        market.setStockData("GOOGL", 2732.8);
    }
}

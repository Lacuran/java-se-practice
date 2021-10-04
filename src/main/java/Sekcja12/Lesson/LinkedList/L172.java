package Sekcja12.Lesson.LinkedList;

public class L172 {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0,10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50,200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45,7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50,36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99,35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket kornelBasket = new Basket("Kornel");
        sellItem(kornelBasket,"car",1);
        System.out.println(kornelBasket);

        sellItem(kornelBasket,"car",1);
        System.out.println(kornelBasket);

        sellItem(kornelBasket,"car",1);
        sellItem(kornelBasket,"kiełbasa",5);
        System.out.println(kornelBasket);

        sellItem(kornelBasket,"juice",4);
        sellItem(kornelBasket,"cup",12);
        sellItem(kornelBasket,"bread",1);
        System.out.println(kornelBasket);

        System.out.println(stockList);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We dont't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}

package com.ralmeida;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.5, 100);
	    stockList.addStock(temp);

        temp = new StockItem("chocolate", 3.0, 50);
        stockList.addStock(temp);

        temp = new StockItem("coffee", 1.75, 50);
        stockList.addStock(temp);

	    temp = new StockItem("cupcake", 1.5, 30);
        stockList.addStock(temp);

        temp = new StockItem("hot dog", 2, 20);
        stockList.addStock(temp);

        temp = new StockItem("juice", 3, 50);
        stockList.addStock(temp);

        temp = new StockItem("milk", 1.3, 25);
        stockList.addStock(temp);

        temp = new StockItem("sandwich", 4, 15);
        stockList.addStock(temp);

        temp = new StockItem("water", 1, 60);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timBasket = new Basket("Tim");
        sellItem(timBasket,"water", 2);
        sellItem(timBasket, "milk", 1);

        sellItem(timBasket, "phone", 1);

        sellItem(timBasket, "bread", 5);
        System.out.println(timBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        // retrieve item from the list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Item " + item + " is not sell here!");
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}

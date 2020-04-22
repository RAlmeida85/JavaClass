package com.ralmeida;

/*    Modify the program so that adding items to the shopping basket doesn't
    actually reduce the stock count but, instead, reserves the requested
    number of items.

    You will need to add a "reserved" field to the StockItem class to store the
    number of items reserved.

    Items can continue to be added to the basket, but it should not be possible to
    reserve more than the available stock of any item. An item's available stock
    is the stock count less the reserved amount.

    The stock count for each item is reduced when a basket is checked out, at which
    point all reserved items in the basket have their actual stock count reduced.

    Once checkout is complete, the contents of the basket are cleared.

    It should also be possible to "unreserve" items that were added to the basket
    by mistake.

    The program should prevent any attempt to unreserve more items than were
    reserved for a basket.

    Add code to Main that will unreserve items after they have been added to the basket,
    as well as unreserving items that have not been added to make sure that the code
    can cope with invalid requests like that.

    After checking out the baskets, display the full stock list and the contents of each
    basket that you created. */

import java.util.Map;

public class MainChallenge {

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


        Basket anotherBasket = new Basket("Another basket");
        sellItem(anotherBasket,"sandwich", 2);
        sellItem(anotherBasket, "water", 1);
        sellItem(anotherBasket, "chocolate", 5);
        sellItem(anotherBasket, "bread", 5);


        removeItem(anotherBasket, "water", 1);
        removeItem(timBasket, "chocolate", 200);

        System.out.println(timBasket);
        System.out.println(anotherBasket);

        checkOut(timBasket);
        System.out.println(timBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        // retrieve item from the list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Item " + item + " is not sell here!");
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0){
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        // retrieve item from the list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Item " + item + " is not sell here!");
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity){
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }
    public static void checkOut(Basket basket){
        for (Map.Entry<StockItem, Integer> item : basket.items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}

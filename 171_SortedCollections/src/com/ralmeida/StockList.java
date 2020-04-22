package com.ralmeida;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    public int addStock(StockItem item){
        if (item != null) {
            // method getOrDefault will use item from lis tif already exist, otherwise will use the item itself
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // if already stock on this item, adjust quantity
            if (inStock != item){
                item.adjustStock(inStock.availableQuantity());
            }

            // either way, will force item with put method, which will override what exist in list
            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if((inStock != null) && (quantity > 0)){
            return inStock.finalizeStock(quantity);
        }
        return 0;

//        StockItem inStock = list.getOrDefault(item, null);
//        if((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity > 0)){
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//        return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = "\nStockList\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + ", There are " + stockItem.availableQuantity() + " in stock, Value of items: " +
                    String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + String.format("%.2f", totalCost);
    }
}

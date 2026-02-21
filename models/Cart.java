package models;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    private Restaurant restaurant;
    private List<MenuItem> items=new ArrayList<>();
    public Cart(){
        restaurant=null;
    }
    public void addItem(MenuItem item){
        if(restaurant==null){
            System.err.println("Cart: set a restuarant before adding items");
            return;
        }
        items.add(item);
    }
    public double getTotalCost(){
        double cost=0;
        for(MenuItem item: items){
            cost += item.getPrice();
        }
        return cost;
    }
    public boolean isEmpty(){
        return restaurant==null || items.isEmpty();
    }
    public void clear() {
        items.clear();
        restaurant = null;
    }

    public void setRestaurant(Restaurant r) {
        restaurant = r;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}

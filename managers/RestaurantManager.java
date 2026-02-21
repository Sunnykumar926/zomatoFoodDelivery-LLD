package managers;
import java.util.ArrayList;
import java.util.List;

import models.Restaurant;
public class RestaurantManager {
    private List<Restaurant> restaurants = new ArrayList<>();
    private static volatile RestaurantManager instance;

    public RestaurantManager(){}

    public static RestaurantManager getInstance(){
        if(instance==null){
            synchronized(RestaurantManager.class){
                if(instance==null){
                    instance = new RestaurantManager();
                }
            }
        }
        return instance;
    }
    public void addRestaurant(Restaurant r){
        restaurants.add(r);
    }
    public List<Restaurant> searchByLocation(String loc){
        loc = loc.toLowerCase();
        List<Restaurant> list = new ArrayList<>();
        for(Restaurant r: restaurants){
            if(r.getLocation().toLowerCase().equals(loc)){
                list.add(r);
            }
        }
        return list;
    }
}

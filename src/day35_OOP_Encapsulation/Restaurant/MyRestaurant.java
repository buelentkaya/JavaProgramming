package day35_OOP_Encapsulation.Restaurant;

public class MyRestaurant {
    public static void main(String[] args) {
        Server[] servers = {
                new Server("Yasin", 29, 15, false),
                new Server("Sabryne", 28, 10, false),
                new Server("Karim", 27, 12, false),
                new Server("Aysel", 26, 20, true),
                new Server("Kamal", 25, 23, true),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };

        Restaurant restaurant = new Restaurant("Bülent", "Frankfurt", 4);
        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);

        System.out.println(restaurant);
    }
}

package day31Constructer.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant kayaRestaurant=new Restaurant("Bulent Kaya","Frankfurt Am Main",3);

        Server server1=new Server("Tarik",123,15,false);
        Server server2=new Server("Kerem",321,19,false);
        Server server3= new Server("Bera",654,25,true);
        Server server4=new Server("Omer",987,30,true);
        Server[] servers={server1,server2,server3,server4};

        Chef chef1=new Chef("Burcin",456,41,true);
        Chef chef2=new Chef("Jane",789,39,true);
        Chef[] chefs={chef1,chef2};

        kayaRestaurant.hireChef(chefs);
        kayaRestaurant.hireServer(servers);

        System.out.println("kayaRestaurant = " + kayaRestaurant);
    }
}

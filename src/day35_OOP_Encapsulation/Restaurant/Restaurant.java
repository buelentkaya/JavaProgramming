package day35_OOP_Encapsulation.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String owner, location;
    private int numberOfStars;
    private ArrayList<Server> servers;
    private ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
       setOwner(owner);
       setLocation(location);
       setNumberOfStars(numberOfStars);
       setServers(servers);
       setChefs(chefs);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServers(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChefs(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID) {
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
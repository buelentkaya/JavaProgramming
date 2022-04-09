package day35_OOP_Encapsulation.Candies;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<CandiesTask>candies=new ArrayList<>();

        candies.addAll(Arrays.asList(
                new CandiesTask("M&M", 60, 1.5, false),
                new CandiesTask("M&M", 50, 0.5, false),
                new CandiesTask("M&M", 40, 2.5, false),
                new CandiesTask("M&M", 30, 3.5, false),
                new CandiesTask("M&M", 20, 2.75, false)
        ));

for(CandiesTask each:candies){
    System.out.println(each.getBrand()+" : "+each.getPrice());
    System.out.println(each.getQuantity()+" number of "+each.getBrand() +" candies cost " +each.calcCost());
}



    }

}

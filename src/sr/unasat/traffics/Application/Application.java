package sr.unasat.traffics.Application;

import sr.unasat.traffics.CarList;

import java.util.PriorityQueue;

public class Application {


    public static void main(String[] args) {
        PriorityQueue<CarList> carListPriorityQueue = new PriorityQueue<>();
        //Auto's geregeld van links naar richt m.b.v. foto
        // Add items to the Priority Queue linkerhelft
        carListPriorityQueue.add(new CarList("LPS", 1.2));
        carListPriorityQueue.add(new CarList("LA4", 2.4));
        carListPriorityQueue.add(new CarList("LA3", 2.3));
        carListPriorityQueue.add(new CarList("LA2", 2.2));
        carListPriorityQueue.add(new CarList("LA1", 2.1));

        // Add items to the Priority Queue rechterhelft
        carListPriorityQueue.add(new CarList("RA1", 2.5));
        carListPriorityQueue.add(new CarList("RA2", 2.6));
        carListPriorityQueue.add(new CarList("RA3", 2.7));
        carListPriorityQueue.add(new CarList("RBS", 1.1));
        carListPriorityQueue.add(new CarList("RB", 2.8));

        carListPriorityQueue.comparator();
        /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
        */
        while (!carListPriorityQueue.isEmpty()) {
            System.out.println(carListPriorityQueue.remove());
        }
    }
}

import airplane.Airplane;
import helicopter.Helicopter;
import helicopter.Quadcopter;
import mav.AgriculturalDrone;
import mav.MAV;
import multirotor.Multirotor;
import uav.UAV;

/**
 * Main class that contains methods to find the least and most expensive UAVs
 * and demonstrates the usage of various flying object classes.
 *
 * Assignment 1 Part 1
 * Written by: Ayush Patel (40285846) and Krishna Patel (40200870)
 */
public class Main {

    /**
     * Finds and prints the least and most expensive UAV from an array of flying objects.
     *
     * @param flyingObjects is an array of objects some of which may be UAVs
     */

    public static void findLeastAndMostExpensiveUAV(Object[] flyingObjects) {

        //least and most expensive uav variables are declared and set to null
        UAV leastExpensive = null;
        UAV mostExpensive = null;

        //For each loop declared to iterate through the array of Airplane objects
        for (Object obj : flyingObjects) {

            // Check if the current object is an instance of UAV
            if (obj instanceof UAV uav) {

                //Determine the least expensive UAV
                if (leastExpensive == null || uav.getPrice() < leastExpensive.getPrice()) {
                    leastExpensive = uav;
                }

                //Determine the most expensive UAV
                if (mostExpensive == null || uav.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = uav;
                }
            }
        }

        //Prints the results according to the conditions met
        if (leastExpensive == null) {
            System.out.println("\n------------------");
            System.out.println("No UAVs were found!");

        } else if (leastExpensive == mostExpensive) {
            // If there's only one UAV
            System.out.println("\n-------------------");
            System.out.println("Only one UAV found:");
            System.out.println(leastExpensive);

        } else {
            // If there are at least two UAVs
            System.out.println("\n--------------------------");
            System.out.println("Least Expensive UAV found:");
            System.out.println(leastExpensive);
            System.out.println("\nMost Expensive UAV found:");
            System.out.println(mostExpensive);
        }
    }

    /**
     * The main method where the program execution begins.It creates multiple flying objects,
     * prints their details, and finds the least and most expensive UAVs.
     *
     */
    public static void main(String[] args) {

        // 25 objects created with updated values
        Airplane a1 = new Airplane("Gulfstream", 135000.50, 1800);
        Airplane a2 = new Airplane("Delta", 60000.75, 3200);
        Airplane a3 = new Airplane("Spirit", 91000, 3700);
        Airplane a5 = new Airplane("Airbus", 250000.99, 9000);
        Helicopter h1 = new Helicopter("Vortex", 8200.30, 800, 4, 2005, 5);
        Helicopter h2 = new Helicopter("Dragonfly", 7200.89, 1400, 6, 1985, 4);
        Helicopter h3 = new Helicopter("Eagle", 5800.0, 1900, 5, 2021, 3);
        Helicopter h4 = new Helicopter("Hawk", 27000.00, 1150, 6, 2018, 7);
        Quadcopter q1 = new Quadcopter("Storm", 14550.90, 2750, 13, 2025, 14, 720);
        Quadcopter q2 = new Quadcopter("Falcon", 550000, 5200, 11, 2024, 24, 2200);
        Quadcopter q3 = new Quadcopter("Horizon", 14000, 3100, 15, 2023, 11, 770);
        Quadcopter q4 = new Quadcopter("Thunder", 32000.00, 3400, 9, 2022, 13, 620);
        Multirotor m1 = new Multirotor("Cyclone", 52000, 1100, 9, 2013, 3, 5);
        Multirotor m2 = new Multirotor("Tornado", 45000, 600, 9, 2017, 6, 4);
        Multirotor m3 = new Multirotor("Typhoon", 65000.00, 4300, 13, 2019, 4, 7);
        UAV uav1 = new UAV(510, 10500);
        UAV uav2 = new UAV(610, 155000);  // Identical to uav3 for testing equals method
        UAV uav3 = new UAV(610, 155000);  // Identical to uav2 for testing equals method
        UAV uav4 = new UAV(510, 310000);
        UAV uav5 = new UAV(670, 1100000);
        AgriculturalDrone ad1 = new AgriculturalDrone(320.7, 6199.99, "Sprout", 2);
        AgriculturalDrone ad2 = new AgriculturalDrone(470.88, 6999.45, "Seeder", 3);
        AgriculturalDrone ad3 = new AgriculturalDrone(510.5, 7500, "Grower", 4);
        MAV mav1 = new MAV("Tesla", 1210, 220, 1050);
        MAV mav2 = new MAV("DARPA", 250, 110, 105000);
        MAV mav3 = new MAV("Lockheed", 320, 60, 850000);



        //First array declared and filled with objects of each of the 7 classes
        Object[] flyingObjects1 = {a1, a2, h1, h2, q1, q2, m1, m2, uav1, uav2, uav5, uav3, uav4, ad1, ad2, ad3, mav1, mav2, mav3};

        //Second array is declared and filled with objects that are NOT UAVs
        Object[] flyingObjects2 = {a1,m1,h1,q1,a2,h2,q2,m2,h3,q3,a3,a5,h4,q4,m3};

        //For each loop prints and displays information about each element from the first array using toString method
        System.out.println("\nHere is the information in the array flyingObjects1:");
        System.out.println("------------------------------------------------------");
        for(Object obj : flyingObjects1) {
            System.out.println();
            System.out.println(obj.toString());
        }

        //findLeastAndMostExpensiveUAV method is called on both arrays and displays the relevant information correctly
        //Will print the most and least expensive UAV objects in this array
        findLeastAndMostExpensiveUAV(flyingObjects1);

        System.out.println();

        //Will print no UAVs found as there are no UAVs in this array
        findLeastAndMostExpensiveUAV(flyingObjects2);


        System.out.println("\n\n----------------------");
        System.out.println("Is uav2 equal to uav3?: " + uav2.equals(uav3)); //Checks if uav2 is equals to uav3 and prints true since they are equal
        System.out.println("Is uav2 equal to uav4?: " +uav2.equals(uav4));//Checks if uav2 is equals to uav4 and prints false since they are not equal


        System.out.println("\nThe program is now terminating. Thanks !");




    }
}

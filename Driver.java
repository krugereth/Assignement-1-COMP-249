import airplane.Airplane;
import helicopter.Helicopter;
import helicopter.Quadcopter;
import mav.AgriculturalDrone;
import mav.MAV;
import multirotor.Multirotor;
import uav.UAV;

public class Driver {

    public static Object[] copyFlyingObjects(Object[] flyingObjects) {

        //This is where the new deep copied array will be stored
        Object[] copiedArray = new Object[flyingObjects.length];

        //For loop to create a deep copy of the array
        for (int i = 0; i < flyingObjects.length; i++) {

            /*Checks if the element in flyingObjects is an instance of the specified class and if true,
            it will create a new instance of specified class using its respective copy constructor defined in the
            other classes previously
            */
            if(flyingObjects[i] instanceof MAV) {
                copiedArray[i] = new MAV((MAV) flyingObjects[i]);

            } else if (flyingObjects[i] instanceof AgriculturalDrone) {
                copiedArray[i] = new AgriculturalDrone((AgriculturalDrone) flyingObjects[i]);

            } else if (flyingObjects[i] instanceof Helicopter) {
                copiedArray[i] = new Helicopter((Helicopter) flyingObjects[i]);

            }else if (flyingObjects[i] instanceof Quadcopter) {
                copiedArray[i] = new Quadcopter((Quadcopter) flyingObjects[i]);

            } else if (flyingObjects[i] instanceof Multirotor) {
                copiedArray[i] = new Multirotor((Multirotor) flyingObjects[i]);

            }else if (flyingObjects[i] instanceof Airplane) {
                copiedArray[i] = new Airplane((Airplane) flyingObjects[i]);

            }else if (flyingObjects[i] instanceof UAV) {
                copiedArray[i] = new UAV((UAV) flyingObjects[i]);
            }
        }
        return copiedArray; //returns the copied array
    }

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



        //Array is declared and filled with objects from each of the 7 classes
        Object[] flyingObjectsToBeCopied = {a1, a2, h1, h2, q1, q2, m1, m2, uav1, uav2, uav5, uav3, uav4, ad1, ad2, ad3, mav1, mav2, mav3};



        //CopyArray method is called on the first array(flyingObjects1)
        Object[] copiedFlyingObjectsArray = copyFlyingObjects(flyingObjectsToBeCopied);


        System.out.println("Here is the information of each element in the newly-copied array");
        //for each loop used to print the copied array (deep copy)
        for (Object obj : copiedFlyingObjectsArray) {
            System.out.println();
            System.out.println(obj);
        }

        System.out.println("\n\n---------------------------------------------------------------");
        System.out.println("Here is the information of each element in the original array");
        //for each loop used to print the copied array (deep copy)
        for (Object obj : flyingObjectsToBeCopied) {
            System.out.println();
            System.out.println(obj);
        }


    }
}

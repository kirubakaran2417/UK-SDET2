package basics;

import java.sql.SQLOutput;

public class Robo2 {

    //parameters and arguments to methods

    int noofroomsCleaned = 0;

    //method to clean a specific number of rooms
    //method with parameter s
    void cleanRooms(int numberofRooms) {
        noofroomsCleaned=noofroomsCleaned+numberofRooms;
        System.out.println("Robo is cleaning "+numberofRooms+" rooms");
    }
    int getRoomsCleaned(){
        return noofroomsCleaned;
    }
    //method to make specific Biriyani
    void makeBiriyani(String typeOfBiriyani){
        System.out.println("Robo is making "+typeOfBiriyani+" Biriyani");
    }


    public static void main(String[] args) {
        //creating the robo object
        Robo2 robot = new Robo2();
        //Instructing RObo to clean 3 rooms
        robot.cleanRooms(3);
        //asking robo how many rooms it has cleaned
        int cleaned = robot.getRoomsCleaned();
        //printing the answer
        System.out.println("Robo has cleaned "+cleaned+" rooms");
        //Instructing RObo to make biriyani
        robot.makeBiriyani("Malabar");

    }

}

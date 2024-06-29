package basics;

public class Robo {

    int noofroomsCleaned = 0;
    void cleantheRoom(){
        noofroomsCleaned = noofroomsCleaned + 1;
        System.out.println(" Robo is Cleaning the room");
    }

    int getRoomsCleaned(){
        return noofroomsCleaned;
    }
    void makeBiriyani(){
        System.out.println("Robo is making biriyani");
    }
    void wateringPlants(){
        System.out.println("Robo is watering plants");
    }



    public static void main(String[] args) {

        Robo robot = new Robo();
        robot.cleantheRoom();
        robot.cleantheRoom();
        System.out.println("Mam i cleaned "+robot.getRoomsCleaned()+" rooms");
        robot.makeBiriyani();
        robot.wateringPlants();
    }
}

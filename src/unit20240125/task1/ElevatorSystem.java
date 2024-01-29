package unit20240125.task1;

/*1. Задача: вызов лифта
В доме два лифта. Реализовать алгоритм отправки наиближайшего на вызывающий этаж.
 Алгоритм будет применяться в домах разной этажности.*/
public class ElevatorSystem {
   private Elevator elevatorA;
   private Elevator elevatorB;

    public ElevatorSystem(int totalFloors) {
        this.elevatorA = new Elevator(0);
        this.elevatorB = new Elevator(totalFloors / 2);
    }

    public Elevator requestElevator(int targetFloor) {
        int distanceA = Math.abs(elevatorA.getCurrentFloor() - targetFloor);
        int distanceB = Math.abs(elevatorB.getCurrentFloor() - targetFloor);

        if (distanceA < distanceB) {
            System.out.println("Sending elevator A");
            return elevatorA;
        } else {
            System.out.println("Sending elevator B");
            return elevatorB;
        }
    }


    public static void main(String[] args) {
        int totalFloors = 19;
        ElevatorSystem elevatorSystem = new ElevatorSystem(totalFloors);

        elevatorSystem.elevatorA.moveToFloor(0);
        elevatorSystem.elevatorB.moveToFloor(8);

        Elevator chosenElevator = elevatorSystem.requestElevator(19);
        chosenElevator.moveToFloor(1);
    }
}
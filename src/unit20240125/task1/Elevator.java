package unit20240125.task1;

public class Elevator {
   private int currentFloor;

    public Elevator(int initialFloor) {
        this.currentFloor = initialFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveToFloor(int targetFloor) {
        System.out.println("Moving to floor: " + targetFloor);
        this.currentFloor = targetFloor;
    }
}

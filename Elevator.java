class Elevator {

    static String brand;
    static int capacity;
    static int currentFloor;
    static int maxFloor;
    static boolean isWorking;
    static String buildingName;
    static double speed;

    public static boolean createElevator(String eleBrand, int eleCapacity,int eleCurrentFloor, int eleMaxFloor,boolean workingStatus,String eleBuildingName, double eleSpeed) {
                                         
                                         
                                      

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isCapacityValid = false;
        boolean isCurrentFloorValid = false;
        boolean isMaxFloorValid = false;
        boolean isWorkingValid = false;
        boolean isBuildingValid = false;
        boolean isSpeedValid = false;

        if (eleBrand != null && !eleBrand.isEmpty()) {
            brand = eleBrand;
            isBrandValid = true;
        } else {
            System.out.println("Brand not valid");
        }

        if (eleCapacity > 0) {
            capacity = eleCapacity;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity not valid");
        }

        if (eleCurrentFloor >= 0) {
            currentFloor = eleCurrentFloor;
            isCurrentFloorValid = true;
        } else {
            System.out.println("Current floor not valid");
        }

        if (eleMaxFloor > 0) {
            maxFloor = eleMaxFloor;
            isMaxFloorValid = true;
        } else {
            System.out.println("Max floor not valid");
        }

        isWorking = workingStatus;
        isWorkingValid = true;

        if (eleBuildingName != null && !eleBuildingName.isEmpty()) {
            buildingName = eleBuildingName;
            isBuildingValid = true;
        } else {
            System.out.println("Building name not valid");
        }

        if (eleSpeed > 0) {
            speed = eleSpeed;
            isSpeedValid = true;
        } else {
            System.out.println("Speed not valid");
        }

        if (isBrandValid && isCapacityValid && isCurrentFloorValid &&
            isMaxFloorValid && isWorkingValid &&
            isBuildingValid && isSpeedValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getElevatorDetails() {
        System.out.println("Fetching Elevator Details...........");
        System.out.println("Brand : " + brand);
        System.out.println("Capacity : " + capacity);
        System.out.println("Current Floor : " + currentFloor);
        System.out.println("Max Floor : " + maxFloor);
        System.out.println("Working Status : " + isWorking);
        System.out.println("Building Name : " + buildingName);
        System.out.println("Speed : " + speed);
    }
}
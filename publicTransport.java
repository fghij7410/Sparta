public abstract class publicTransport {
    private int number;
    private int fuelCapacity=100;//주유량
    private int speed=0;
    private int speedChange;
    private int maxPassengers;
    public publicTransport(int number) {
        this.number = number;
        this.maxPassengers = maxPassengers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public abstract int getFuelCapacity(int fuelCapacity);



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedChange() {
        return speedChange;
    }

    public void setSpeedChange(int speedChange) {
        this.speedChange = speedChange;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void startOperation(){}

    public void changeSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    public void changeStatus(){}

    public void passengerBoarding(int numPassengers){}
}

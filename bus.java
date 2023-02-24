public class bus extends publicTransport{
    private int currentPassengers =0;//현재 승객 수
    private  int MAX_PASSENGERS = 30;//최대 승객 수

    private String status = "운행";
    private int fare = 1000;//가격

    private int fuelCapacity=100;

    private int totalPassengers = 0;

    @Override
    public String toString() {
        return "bus{" +
                "탑승 승객 수=" + currentPassengers +
                ", 잔여 승객 수 =" + (MAX_PASSENGERS-currentPassengers) +
                ", 요금 확인=" + (fare*currentPassengers) +
                '}';
    }


    public int getFuelCapacity() {
        if(this.fuelCapacity<10){
            this.status="차고지행";
            System.out.println(this.status);
            System.out.println("주유 필요");
        }
        return this.fuelCapacity;
    }


    public int setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity += fuelCapacity;
        return fuelCapacity;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }




    public bus(int number) {
        super(number);
        this.currentPassengers = currentPassengers;
    }

    @Override
    public int getFuelCapacity(int fuelCapacity) {
        return 0;
    }

    public int getMAX_PASSENGERS() {
        return MAX_PASSENGERS;
    }

    public void setMAX_PASSENGERS(int MAX_PASSENGERS) {
        this.MAX_PASSENGERS = MAX_PASSENGERS;
    }



    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        if(currentPassengers>30){
            this.currentPassengers -= currentPassengers;
            System.out.println("최대승객 수 초과");
        }else{
            this.currentPassengers = currentPassengers;
        }
    }

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        return this.status = status;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    // other bus methods
}

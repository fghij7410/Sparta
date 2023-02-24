public class Main {
    public static void main(String[] args) {
        bus bus1 = new bus(1234);
        bus bus2 = new bus(2345);
        System.out.println(bus1.getNumber());
        System.out.println(bus2.getNumber());
        bus1.setCurrentPassengers(2);
        System.out.println(bus1.toString());

        System.out.println(bus1.setFuelCapacity(-50));
        System.out.println(bus1.getFuelCapacity());

        System.out.println(bus1.setStatus("차고지행"));

        System.out.println(bus1.setFuelCapacity(+10));
        System.out.println(bus1.getFuelCapacity());
        System.out.println(bus1.getStatus());

        System.out.println(bus1.setStatus("운행중"));

        bus1.setCurrentPassengers(45);

        bus1.setCurrentPassengers(5);
        System.out.println(bus1.toString());
        bus1.setFuelCapacity(-55);
        System.out.println(bus1.getFuelCapacity());
    }
}

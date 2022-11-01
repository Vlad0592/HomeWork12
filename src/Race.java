public class Race {

    public static void main(String[] args) {


        Car car1 = new Car("лада", "гранда", 1.5, TypeOfBody.SEDAN);
        Car car2 = new Car("мерседес", "сдс544", 1.5, TypeOfBody.SEDAN);
        Car car3 = new Car("бмв", "х5", 1.5, TypeOfBody.SEDAN);
        Car car4 = new Car("сузуки", "суз", 1.5, TypeOfBody.SEDAN);

        Truck truck1 = new Truck("Зил", "4505", 25, TypeOfWeight.N1);
        Truck truck2 = new Truck("уаз", "4506", 45, TypeOfWeight.N2);
        Truck truck3 = new Truck("паз", "4507", 54, TypeOfWeight.N3);
        Truck truck4 = new Truck("каказ", "4508", 37, TypeOfWeight.N3);


        Bus bus1 = new Bus("Камаз", "4567", 45, TypeOfCapacity.N4);
        Bus bus2 = new Bus("маз", "4568", 85, TypeOfCapacity.N2);
        Bus bus3 = new Bus("ман", "4569", 94, TypeOfCapacity.N3);
        Bus bus4 = new Bus("пан", "4565", 57, TypeOfCapacity.N1);

        DriverB vlad = new DriverB(" Vlad ", 'B', 30, car3);
        DriverC sasha = new DriverC(" Sasha ", 'C', 20, truck4);
        DriverD oleg = new DriverD(" Oleg ",'D',  34, bus2);




      System.out.println(vlad);
        vlad.driverInfo();

        System.out.println(sasha);
       sasha.driverInfo();


        System.out.println(oleg);
        oleg.driverInfo();


    }
}
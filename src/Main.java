public class Main {
    public static void main(String[] args) {

        Car lada = new Car(" лада ", " гранда ", 1.5, TypeOfBody.SEDAN);
        Car mersedes = new Car("мерседес", "564", 3.5, TypeOfBody.HATCHBACK);
        Car bmv = new Car("бмв", "слс546", 4.5, TypeOfBody.VAN);
        Car volvo = new Car("волво", "за567", 1.4, TypeOfBody.HATCHBACK);

        Bus zil = new Bus("Зил", "3105", 2.5, TypeOfCapacity.N1);
        Bus yaz = new Bus("уаз", "3106", 2.6, TypeOfCapacity.N3);
        Bus paz = new Bus("паз", "3107", 2.7, TypeOfCapacity.N4);
        Bus kakaz = new Bus("каказ", "3108", 2.8, TypeOfCapacity.N5);

        Truck kamaz = new Truck("Камаз","4567", 55, TypeOfWeight.N3);
        Truck maz = new Truck("маз","4568", 25, TypeOfWeight.N2);
        Truck man = new Truck("ман","4569", 45, TypeOfWeight.N2);
        Truck pan = new Truck("пан","4578", 75, TypeOfWeight.N1);



        System.out.println();
        print(lada);
        print(mersedes);
        print(bmv);
        print(volvo);
        System.out.println();
        print(zil);
        print(yaz);
        print(paz);
        print(kakaz);
        System.out.println();
        print(kamaz);
        print(maz);
        print(man);
        print(pan);


    }







    public static void print(Transport transport) {
        System.out.println(transport.getBrend() + " " + transport.getModel() + " " + transport.getVolumeEngine());
    }
}
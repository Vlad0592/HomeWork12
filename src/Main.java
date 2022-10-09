public class Main {
    public static void main(String[] args) {

        Car lada = new Car(" лада ", " гранда ", 1.5);
        Car mersedes = new Car("лада", "гранда", 1.5);
        Car bmv = new Car("лада", "гранда", 1.5);
        Car volvo = new Car("лада", "гранда", 1.5);

        Bus zil = new Bus("Зил", "3105", 2.5);
        Bus yaz = new Bus("Зил", "3105", 2.5);
        Bus paz = new Bus("Зил", "3105", 2.5);
        Bus kakaz = new Bus("Зил", "3105", 2.5);

        Truck kamaz = new Truck("Камаз","4567", 25);
        Truck maz = new Truck("Камаз","4567", 25);
        Truck man = new Truck("Камаз","4567", 25);
        Truck pan = new Truck("Камаз","4567", 25);

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
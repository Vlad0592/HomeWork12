public class Bus extends Transport implements Competing {

private TypeOfCapacity typeOfCapacity;

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }

    public Bus(String brend, String model, double volumeEngine,  TypeOfCapacity) {
        super(brend, model, volumeEngine);

    }

    @Override
    public void startMove() {
        System.out.println("Автобус начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Автобус закончил движение");


    }

    @Override
    public String getPitStop() {
        return "Stop the line";
    }

    @Override
    public double getBestLapTime() {
        return 35;
    }

    @Override
    public int getMaxSpeed() {
        return 250;
    }
}

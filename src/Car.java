public class Car extends  Transport implements Competing {


    public Car(String brend, String model, double volumeEngine, TypeOfBody sedan) {
        super(brend, model, volumeEngine);
    }

    @Override
    public void startMove() {
        System.out.println("машина начала движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Машина закончила движение");

    }

    @Override
    public String getPitStop() {
        return "Stop the line";
    }

    @Override
    public double getBestLapTime() {
        return 46;
    }

    @Override
    public int getMaxSpeed() {
        return 350;
    }
}

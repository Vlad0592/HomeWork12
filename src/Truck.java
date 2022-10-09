public class Truck extends Transport implements Competing {

    public Truck(String brend, String model, double volumeEngine) {
        super(brend, model, volumeEngine);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик закончил движение");

    }

    @Override
    public String getPitStop() {
        return "Stop the line";
    }

    @Override
    public double getBestLapTime() {
        return 68;
    }

    @Override
    public int getMaxSpeed() {
        return 89;
    }
}

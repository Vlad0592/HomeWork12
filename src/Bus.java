public class Bus extends Transport implements Competing {


    public Bus(String brend, String model, double volumeEngine) {
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

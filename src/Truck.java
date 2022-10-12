public class Truck extends Transport implements Competing {

    private TypeOfWeight typeOfWeight;

    public TypeOfWeight getTypeOfWeight() {
        return typeOfWeight;
    }

    public void setTypeOfWeight(TypeOfWeight typeOfWeight) {
        this.typeOfWeight = typeOfWeight;
    }

    public Truck(String brend, String model, double volumeEngine, TypeOfWeight) {
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

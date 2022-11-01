public class Car extends  Transport implements Competing {

    private TypeOfBody typeOfBody;


    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public Car(String brend, String model, double volumeEngine, TypeOfBody TypeOfBody ) {
        super(brend, model, volumeEngine);


    }


    @Override
    public void repair() {

        System.out.println("Машина" + getBrend() + getModel() + "починена");

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

    @Override
    public boolean servise() {
        return Math.random() > 0.6;
    }
}

public abstract class  Transport {

    private String brend;
    private String model;
    private double volumeEngine;

    public Transport(String brend, String model, double volumeEngine) {
        this.brend = brend;
        this.model = model;
        this.volumeEngine = volumeEngine;

    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }
    public abstract void startMove();

    public abstract void finishMove();
    public abstract boolean servise();
    @Override
    public String toString() {
        return  brend + " " + model +  " " + " " + volumeEngine;

    }
}

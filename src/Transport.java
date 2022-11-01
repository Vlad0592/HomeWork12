import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport {

    private String brend;
    private String model;
    private double volumeEngine;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport(String brend, String model, double volumeEngine) {
        this.brend = brend;
        this.model = model;
        this.volumeEngine = volumeEngine;


    }

    public String getBrend() {
        return brend;
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }


    public void addSponsor(Sponsor sponsor) {
       sponsors.add(sponsor);
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

    public abstract void repair();

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
        return brend + " " + model + " " + " " + volumeEngine;


    }
}

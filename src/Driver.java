abstract public class Driver<T extends Transport & Competing> {

    private String fio;
    private Character driverLicense;
    private int exp;

    private T car;


    protected Driver(String fio, Character driverLicense, int exp, T car) {
        if (fio == null || fio.isEmpty()) {
            throw new NullPointerException("Укажите имя водителя");


        } else {

            this.fio = fio;
        }

        if (driverLicense != 'B' && driverLicense != 'C' && driverLicense != 'D') {
            throw new NullPointerException("Нет прав иди в автошколу");
        } else {
            this.driverLicense = driverLicense;
        }

        if (car != null) {
            this.car = car;
        }
        setExp(exp);
    }


    public void start() {
        System.out.println(fio + "Поехали" + car.getModel() + car.getBrend());
    }

    public void finish() {
        System.out.println(fio + "Закончили" + car.getBrend() + car.getModel());

    }

    public void refuelauto() {

        System.out.println(fio + "Бензин на нулях" + car.getModel() + car.getBrend());
    }

    public void driverInfo() {
        System.out.println("Водитель" + fio + "управляет" + car.getModel() + " " + car.getBrend() + " и будет учавствовать в заезде");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Character getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(Character driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if (exp <= 0) {
            throw new NullPointerException("Нет прав иди в автошколу");
        } else {
            this.exp = exp;
        }
    }

    public T getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = (T) car;
    }

    @Override
    public String toString() {
        return  fio + " " + driverLicense + "  " + " " + exp + car;

    }
}
public enum TypeOfCapacity {
    N1("особо малая (до 10 мест"),
    N2("малая (до 25)"),
    N3("средняя (40–50)"),
    N4("большая (60–80)"),
    N5("особо большая (100–120 мест)");


    private final String description;

    TypeOfCapacity(String description) {
        this.description = description;


    }

    public String getDescription() {
        return description;
    }
}



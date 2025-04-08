package LLDCaseStudies.ParkingLot.models;

public class Operator {

    private String name;
    private int id;
    private int age;
    private Gate dutyGate;

    public Operator(String name, int id, int age, Gate dutyGate) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dutyGate = dutyGate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gate getDutyGate() {
        return dutyGate;
    }

    public void setDutyGate(Gate dutyGate) {
        this.dutyGate = dutyGate;
    }
}

package Exams_two;

public class Idioktitis {
    private String name;
    private String address;

    public Idioktitis(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Idioktitis{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package Exams_three;

public class Flat extends Residence{
    private int floor;
    public Flat(int floor, int pcode, double price, double area) {
        super(pcode, price, area);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double calculateCommision(){
        return getPrice() * 0.01;
    }

    @Override
    public String toString() {
        return "Flat: " + "floor= " + floor + super.toString();
    }
}

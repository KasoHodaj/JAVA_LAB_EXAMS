package Exams_three;

public class House extends Residence{
    public House(int pcode, double price, double area) {
        super(pcode, price, area);
    }


    public double calculateCommision(){
        return 100 + (3*getArea());
    }

    @Override
    public String toString() {
        return "House: " + super.toString();
    }
}

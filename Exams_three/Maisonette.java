package Exams_three;

public class Maisonette extends House{

    public Maisonette(int pcode, double price, double area) {
        super(pcode, price, area);
    }

    public double calculateCommision(){
        return (super.calculateCommision() + getPrice() *0.01);
    }


    @Override
    public String toString() {
        return "Maisonette: " + super.toString();
    }
}

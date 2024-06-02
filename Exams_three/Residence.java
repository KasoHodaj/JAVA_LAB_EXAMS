package Exams_three;

abstract class Residence {
    private int pcode;
    private double price;
    private double area;

    public Residence(int pcode, double price, double area) {
        if(pcode < 0 || price < 0 || area < 0){
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.pcode = pcode;
        this.price = price;
        this.area = area;
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    abstract double calculateCommision();

    public void openParkingDoor(){
        System.out.println( pcode + " open parking door");
    }

    @Override
    public String toString() {
        return "pcode=" + pcode + ", price=" + price + ", area=" + area;
    }
}

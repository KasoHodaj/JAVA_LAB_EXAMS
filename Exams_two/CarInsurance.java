package Exams_two;

public class CarInsurance extends Insurance{

    private String plateNumber;
    private int cc;

    public CarInsurance(int securityNum, Idioktitis idioktitis, int contract, String plateNumber, int cc) {
        super(securityNum, idioktitis, contract);
        this.plateNumber = plateNumber;
        this.cc = cc;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public void CalculationInsurance() {
        double price = ((double)cc * getContract()) /60;
        System.out.println("To kostos asfaleias einai: " + price);
    }

    @Override
    public String toString() {
        return super.toString() + "CarInsurance{" +
                "plateNumber='" + plateNumber + '\'' +
                ", cc=" + cc +
                '}';
    }
}

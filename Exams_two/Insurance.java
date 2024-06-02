package Exams_two;

abstract class Insurance {
    private int securityNum;
    private Idioktitis idioktitis;
    private int contract; // In months

    public Insurance(int securityNum, Idioktitis idioktitis, int contract) {
        this.securityNum = securityNum;
        this.idioktitis = idioktitis;
        if(contract<0){
            throw new IllegalArgumentException("Contract lenght cannot be negative");  // NOT COMPLETE IN MAIN
        }
        this.contract = contract;
    }

    public int getSecurityNum() {
        return securityNum;
    }

    public void setSecurityNum(int securityNum) {
        this.securityNum = securityNum;
    }

    public Idioktitis getIdioktitis() {
        return idioktitis;
    }

    public void setIdioktitis(Idioktitis idioktitis) {
        this.idioktitis = idioktitis;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    abstract void CalculationInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "securityNum=" + securityNum +
                ", Idioktitis=" + idioktitis +
                ", Contract=" + contract +
                '}';
    }
}

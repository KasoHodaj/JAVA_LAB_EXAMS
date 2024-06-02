package Exams_two;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        CarInsurance[] cars = {
                new CarInsurance(1,new Idioktitis("kaso","kassandrou 89"),12,"NKH5496",1200),
                new CarInsurance(2,new Idioktitis("ioanna","kassandrou 89"),24,"ATB5496",1600),
                new CarInsurance(3,new Idioktitis("spiros","agios paulos 9"),6,"MER1202",1800),
                new CarInsurance(4,new Idioktitis("xristos","agiou dimitriou 53"),12,"TOY5496",2200),
                new CarInsurance(5,new Idioktitis("john","ptolemaiwn 15"),16,"NKA5496",1000)
        };


        System.out.print("Give a security number: ");
        int SecurityNumber = sc.nextInt();

        for(int i=0; i<cars.length; i++){
            if(SecurityNumber == cars[i].getSecurityNum()){
                System.out.println("The Contract information: " + cars[i].toString());
            }
            else{
                System.out.println("There is not insurance with security number: " + SecurityNumber);
            }
        }
    }

}

package Exams_three;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Residence[] residences = new Residence[3];
        int i = 0;
        boolean isValid = false;

        do {
            try {
                residences[0] = new House(2024, 1000, 100);
                residences[1] = new Maisonette(2020, 620, 70);
                residences[2] = new Flat(2, 700, 700,120);
                isValid = true; // If no exception, the input is valid
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                break;
            }
            i++;
        } while (!isValid && i < 2); // Ensure the loop executes only twice in case of invalid inputs




        if(isValid){
            for(i=0; i< residences.length; i++){
                System.out.println();
                System.out.println(residences[i].toString() + " Commision= " + residences[i].calculateCommision());
                residences[i].openParkingDoor();

            }
        }

    }
}

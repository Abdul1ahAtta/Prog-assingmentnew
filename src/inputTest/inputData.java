package inputTest;

import inputTest.readData;
import java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
        System.out.print("Please enter an input= ");
        Scanner scan = new Scanner(System.in);
        readData obj = new readData();
        String inputText = scan.nextLine();

        while (!inputText.equalsIgnoreCase("Stop")) {
            obj.myMethod(inputText);
            System.out.print("Enter next= ");
            inputText = scan.nextLine();
        }

        System.out.println("total number of line are =" + obj.getRows());
        System.out.println("number of characters= " + obj.getCharacters());


    }

}
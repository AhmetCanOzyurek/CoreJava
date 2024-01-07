package Generics;

public class IntegerPrinter {
   static Integer thingToPrint;
    public  IntegerPrinter(Integer thingToPrint){
        this.thingToPrint =thingToPrint;
    }
    public static void print(){
        System.out.println(thingToPrint);
    }
}

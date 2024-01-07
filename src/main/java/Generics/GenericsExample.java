package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<Dog> doglist = new ArrayList<>();
        doglist.add(new Dog());
        printList(doglist);
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

    }
    private static void printList(List<? extends Animal> myList){
        System.out.println(myList);
    }
}

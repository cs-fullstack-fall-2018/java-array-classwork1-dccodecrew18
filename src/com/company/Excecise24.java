package com.company;
import java.awt.*;
import java.util.ArrayList;

public class Excecise24 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(7);

        System.out.println(numberList.get(2));
        numberList.remove(3);
        System.out.println(numberList.get(2));
    }
    }



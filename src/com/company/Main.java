package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("he likes Java");
        String s;
        s.charAt(10);
        System.out.println(s);
        s.setCharAt(0, 'w');
        System.out.p;
        System.out.print();
        System.out.println(s);
        s.insert(3, "all ");

        System.out.println(s);
        s.replace(13, 17, "apple");

        System.out.println(s);
//        int index = s.indexOf("apple");
//        s.replace(index, s.length(), "play");//不用去数，用indexOf办法，Low了吧
    }
}

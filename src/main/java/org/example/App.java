package org.example;


public class App {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "c++";
        String str3 = "java";
        String str4 = new String("java");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1 == str3); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str4); // false
        System.out.println(str1.equals(str4)); //true
    }
}

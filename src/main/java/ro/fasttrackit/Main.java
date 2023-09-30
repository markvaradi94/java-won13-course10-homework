package ro.fasttrackit;

import ro.fasttrackit.exercise1.Basket;
import ro.fasttrackit.exercise3.Company;
import ro.fasttrackit.exercise3.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Basket basket = new Basket();
//        basket.add("Lemon");
//        basket.add("Lemon");
//        basket.add("Orange");
//        basket.add("Apple");
//        basket.add("Pear");
//        basket.add("Lemon");
//
//        System.out.println(basket);
//        System.out.println(basket.distinct());
//        System.out.println(basket.find("pear"));
//        System.out.println(basket.remove("apple"));
//        System.out.println(basket);
//        System.out.println(basket.position("lemon"));
//
//        System.out.println(basket.allPositions("lemon"));
//        System.out.println(basket.lastPosition("lemon"));
//
//        System.out.println("===================================");
//        List<String> content = basket.getContent();
//        content.add("Watermelon");
//        content.add("altceva");
//        System.out.println(basket);
//        System.out.println(content);

        Company company = new Company();
        System.out.println(company);

        Person person1 = new Person("Ana", 25, "dev");
        Person person2 = new Person("Eric", 35, "qa");
        Person person3 = new Person("Max", 45, "dev");
        Person person4 = new Person("Joe", 75, "po");
        Person person5 = new Person("Anabel", 45, "dev");

        company.employ(person1);
        company.employ(person2);
        company.employ(person3);
        company.employ(person4);
        company.employ(person5);
        company.employ(new Person("Andrei", 18, "Manager"));

        System.out.println(company);
    }
}
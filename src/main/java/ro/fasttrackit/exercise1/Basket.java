package ro.fasttrackit.exercise1;

import java.util.*;

/*
 find(String):boolean      - finds if received fruit is in the list and returns true/false

         remove(String): boolean   - removes the received string returns true/false if found

         - position(String):int     - returns the position on which the received fruit is in the basket

         - distinct(): Collection<String>  - returns an unique collection containing all fruits once

        - add(String) - adds a fruit to the basket

        - count():int    - count the fruits

        - customCount():int - count the fruits without using size method (use a loop control statement + counter)

 */

public class Basket {
    private final List<String> content;

    public Basket() {
        this.content = new ArrayList<>();
    }

    public void add(String fruit) {
        if (fruit != null) {
            content.add(fruit.toUpperCase());
        }
    }

    public boolean find(String fruit) {
//        for (String basketFruit : content) {
//            if (basketFruit.equalsIgnoreCase(fruit)) {
//                return true;
//            }
//        }
//        return false;

        if (fruit != null) {
            return content.contains(fruit.toUpperCase());
        }
        return false;
    }

    public boolean remove(String fruit) {
//        for (String basketFruit : content) {
//            if (basketFruit.equalsIgnoreCase(fruit)) {
//                content.remove(basketFruit);
//                return true;
//            }
//        }
//
//        return false;

        if (find(fruit)) {
            return content.remove(fruit.toUpperCase());
        }
        return false;
    }

    public int position(String fruit) {
        if (find(fruit)) {
            return content.indexOf(fruit.toUpperCase());
        }
        return -1;
    }

    public int lastPosition(String fruit) {
        if (find(fruit)) {
            return content.lastIndexOf(fruit.toUpperCase());
        }
        return -1;
    }

    public List<Integer> allPositions(String fruit) {
        if (find(fruit)) {
            List<Integer> positions = new ArrayList<>();
            for (int i = 0; i < content.size(); i++) {
                if (content.get(i).equalsIgnoreCase(fruit)) {
                    positions.add(i);
                }
            }
            return positions;
        }

        return List.of();
    }

    public Set<String> distinct() {
        return new HashSet<>(content);
    }

    public int count() {
        return content.size();
    }

    public int countDistinct() {
        return distinct().size();
    }

    public List<String> getContent() {
        return new ArrayList<>(content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(content, basket.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "content=" + content +
                '}';
    }
}

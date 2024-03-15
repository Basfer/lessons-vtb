package com.bsf.lessons_vtb.lesson_02.fruits;

public class Fruits {
    public enum Fruit {
        APPLE("Яблоко", 250), ORANGE("Апельсин", 200), BANANA("Банан", 150), CHERRY("Вишня", 10);
        private String title;
        private int weight;

        Fruit(String title, int weight) {
            this.title = title;
            this.weight = weight;
        }

        public String getTitle() {
            return title;
        }

        public int getWeight() {
            return weight;
        }
    }
    public static void main(String[] args) {
        for (Fruit fruit: Fruit.values()) {
            System.out.println(fruit.getTitle() + ": средний вес " + fruit.getWeight() + " г.");
        }
    }
}

package lesson_1.hw;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private String name;
    List<T> list = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void addFruit(T t, int a) {
        for (int i = 0; i < a; i++) {
            list.add(t);
        }
    }

    public void addFruit(T t) {
        list.add(t);
    }

    public double getWeight() {
        double sum = 0.0f;
        for (T t : list) {
            sum += t.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void replaceToNewBox(Box<T> box) {
        for (T t : list) {
            box.addFruit(t);
        }
        list.clear();
    }
}


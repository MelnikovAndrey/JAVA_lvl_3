package lesson_1.hw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Старт ДЗ");

        ArrChanger<Integer> a1 = new ArrChanger<>(1,2,3,4,5);
        a1.changeValue(1,4);

        ArrChanger<Integer> a2 = new ArrChanger<>(1,2,3,4,5,6,7,8);
        a2.arrayToList();
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxA = new Box<>("Яблоки");
        boxA.addFruit(apple, 5);

        Box<Orange> boxO = new Box<>("Апельсины");
        boxO.addFruit(orange, 5);

        System.out.println("Вес яблок - " + boxA.getWeight());
        System.out.println("Вес апельсинов - " + boxO.getWeight());

        System.out.println("Равенство коробок по весу - " + boxA.compare(boxO));

        Box<Apple> boxA2 = new Box<>("Яблоки");
        boxA.replaceToNewBox(boxA2);
        System.out.println("Вес новой коробки - " + boxA2.getWeight());
        System.out.println("Вес старой коробки - " + boxA.getWeight());
    }


}

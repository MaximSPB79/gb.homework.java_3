package lesson_1.big_task;

public class BigTask {
    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox = new Box<>(orange);
        Box<Orange> orangeBox2 = new Box<>(orange);
        Box<Apple> appleBox = new Box<>(apple);

// добавляем фрукты в коробки, яблоки нельзя добавлять в коробку апельсинов равно и наоборот
        orangeBox.addingFruitsToBoxes(orange, 5); // добавляем апельсины в коробку
        appleBox.addingFruitsToBoxes(apple, 25); // добавляем яблоки в коробку
// информация о коробке
        orangeBox.printInfo();
        appleBox.printInfo();

// добавили еще 14 апельсинов
        orangeBox.addingFruitsToBoxes(orange, 14);
        orangeBox.printInfo();

// сравниваем коробку апельсинов и яблок
        System.out.println(orangeBox.compareTo(appleBox));

// создаем еще одну коробку с апельсинами
        orangeBox2.addingFruitsToBoxes(orange, 6);
        orangeBox2.printInfo();
        orangeBox.printInfo();

// пересыпаем апельсины в другую коробку
        orangeBox.sprinkleFruitFromTheBox(orangeBox2);

        orangeBox2.printInfo();
        orangeBox.printInfo();

    }
}

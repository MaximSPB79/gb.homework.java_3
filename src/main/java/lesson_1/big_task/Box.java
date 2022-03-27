package lesson_1.big_task;

import java.util.ArrayList;

public class Box<T> {

    Fruit fruit;
    private ArrayList<T> box = new ArrayList<>();
    private float weightBox;


    public Box(Fruit fruit) {
        this.fruit = fruit;

    }

    private float countingWeightBox() {
        return weightBox = this.fruit.getWeight() * box.size();
    }

    public void printInfo() {
        System.out.print("Количество " + this.fruit.getName() + " в коробке: ");
        System.out.println(box.size());
        System.out.print("Вес коробки: ");
        System.out.println(countingWeightBox() + " кг");
    }


    public void addingFruitsToBoxes(T t, int countFruits) {
        for (int i = 0; i < countFruits; i++) {
            box.add(t);
        }
    }

    public boolean compareTo(Box<?> box) {
        return this.weightBox - box.weightBox == 0;
    }

    public void sprinkleFruitFromTheBox(Box<T> fruit) {
        fruit.box.addAll(this.box);
        this.box.removeAll(this.box);
    }
}

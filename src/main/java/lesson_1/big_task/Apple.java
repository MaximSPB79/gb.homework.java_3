package lesson_1.big_task;

public class Apple extends Fruit {

    private float weight;
    private String name;

    public Apple() {

        this.weight = 1.0f;
        this.name = "яблок";

    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}

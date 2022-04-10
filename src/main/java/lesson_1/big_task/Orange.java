package lesson_1.big_task;

public class Orange extends Fruit {

    private float weight;
    private String name;

    public Orange() {
        weight = 1.5f;
        name = "апельсинов";
    }


    public float getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}

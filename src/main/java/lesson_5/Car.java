package lesson_5;

public class Car implements Runnable {

    private static int CARS_COUNT;

    static {
        CARS_COUNT = 0;
    }

    private Race race;
    private int speed;
    private String name;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public synchronized void run() {
        try {
            System.out.println(this.name + " готовится");
            try {
                Thread.sleep(500 + (int) (Math.random() * 800));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MainClass.cdlReady.countDown();
            System.out.println(this.name + " готов");
            MainClass.startBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
            if (i == 2 && MainClass.isWin()) {
                System.out.println(this.name + " WIN!!!");
                MainClass.setWin(false);
            }
        }
        MainClass.cdlFinish.countDown();
    }
}

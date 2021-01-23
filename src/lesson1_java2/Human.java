package lesson1_java2;

public class Human implements RaceParticipant {
    private String name;
    private int age;
    private int maxJump;
    private int maxRun;

    public Human(String name, int age, int maxJump, int maxRun) {
        this.name = name;
        this.age = age;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }


    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Человек побежал");
    }
}





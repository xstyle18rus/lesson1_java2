package lesson1_java2;

public class Main {

    public static void main(String[] args) {
        RaceParticipant[] raceParticipants = new RaceParticipant[]{
                new Human("Валера", 25, 2, 1000),
                new Human("Генадий", 55, 1, 300),
                new Cat("Кошка Мурка", 300, 4),
                new Cat("Кот васька", 200, 2),
                new Robot("Тотошка", 99999, 15),
                new Robot("Робокоп", 5000, 20)

        };
        Obstacles[] obstacles = new Obstacles[]{
                new Wall("Камень", 0, 1),
                new Wall("Камень", 0, 2),
                new RunningTrack("Дорога", 100, 0),
                new Wall("Камень", 0, 4),
                new RunningTrack("Дорога", 500, 0),
                new Wall("Камень", 0, 18),
                new RunningTrack("Дорога", 1500, 0),
        };

        for (RaceParticipant raceParticipant : raceParticipants) {
            for (Obstacles obstacles1 : obstacles) {
                if (obstacles1.getLength() == 0) {
                    if (raceParticipant.getMaxJump() >= obstacles1.detHeight()) {
                        System.out.println(raceParticipant.getName() + " преодолел препятствие " + obstacles1.getName());
                    } else {
                        System.out.println(raceParticipant.getName() + " не перепрыгнул, и сошел с дистанции");
                        break;

                    }
                }
                if (obstacles1.detHeight() == 0) {
                    if (raceParticipant.getMaxRun() >= obstacles1.getLength()) {
                        System.out.println(raceParticipant.getName() + " преодолел препятствие " + obstacles1.getName());
                    } else {
                        System.out.println(raceParticipant.getName() + " не пробежал, и сошел с дистанции");
                        break;
                    }

                }
            }
        }
    }
}






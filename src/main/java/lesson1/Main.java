package lesson1;

import lesson1.competitor.Cat;
import lesson1.competitor.Competitor;
import lesson1.competitor.Dog;
import lesson1.competitor.Human;
import lesson1.course.Cross;
import lesson1.course.Obstacle;
import lesson1.course.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
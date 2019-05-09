package lesson1;

import lesson1.competitor.*;
import lesson1.course.*;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Команда Игоря", new Dog("Серый"),new Dog("Тузик"), new Cat("Барсик"), new Human("Игорь"));
        Course course = new Course(new Cross(50), new Wall(2), new Water(15), new Cross(550));

        team.teamPresentation();
        course.doIt(team);
        team.showResults();

    }
}
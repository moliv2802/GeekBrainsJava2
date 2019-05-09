package lesson1.course;

import lesson1.competitor.Competitor;
import lesson1.competitor.Team;

public class Course {

 Obstacle obstacle[];

    public Course(Obstacle ... obstacle) {
        this.obstacle = obstacle;
    }

   public void doIt(Team team)
    {
        for ( Competitor n : team.players      ) {
            for (Obstacle o : obstacle) {
                o.doIt(n);
                if (!n.isOnDistance()) break;
            }
        }


    }

}




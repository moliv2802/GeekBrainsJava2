package lesson1.competitor;

public class Team {

    String teamName;

    public Competitor[] players;

    public Team(String teamName, Competitor... players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void teamPresentation()
    {
        System.out.println();
        System.out.println("Участники команды " + teamName + " готовы к старту");
        System.out.println();
        for (Competitor c : players) {
            c.info();
        }

        System.out.println();
    }




    public void showResults() {
        System.out.println();
        System.out.println("Участники команды " + teamName + " успешно прошедшие марафон");
        System.out.println();
        for (Competitor c : players) {
            if(c.isOnDistance())
                c.info();
        }
        System.out.println();
    }
}




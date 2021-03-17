package hackathon1;

import java.util.ArrayList;
import java.util.Random;

public class Team {

    public  ArrayList<Player> buildTeam(int defender, int midfielder, int fowarder) {
        ArrayList<Player> list = new ArrayList<Player>();
        list.add(new Player("Marc Stegen", Position.GK, 1));
        list.add(new Player("Dest", Position.DF, 2));
        list.add(new Player("Pique", Position.DF, 3));
        list.add(new Player("Ronald", Position.DF, 4));
        list.add(new Player("Busquet", Position.MF, 5));
        list.add(new Player("Griezman", Position.FW, 6));
        list.add(new Player("Pjanic", Position.MF, 7));
        list.add(new Player("Braithwaite", Position.FW, 8));
        list.add(new Player("Messi", Position.FW, 9));
        list.add(new Player("Dembele", Position.FW, 10));
        list.add(new Player("Puig", Position.FW, 11));
        list.add(new Player("Neto", Position.GK, 12));
        list.add(new Player("Lenglet", Position.DF, 13));
        list.add(new Player("Pedri", Position.MF, 14));
        list.add(new Player("Trincao", Position.FW, 15));
        list.add(new Player("Alba", Position.DF, 16));
        list.add(new Player("Fernandes", Position.MF, 17));
        list.add(new Player("Roberto", Position.DF, 18));
        list.add(new Player("DeJong", Position.MF, 19));
        ArrayList<Player> newList = new ArrayList<Player>();
        Random rd = new Random();
        int goalkeeper = 0;
        while (goalkeeper < 1) {
            int rdGoalkeeper = rd.nextInt(19);
            if (list.get(rdGoalkeeper).getPosition().equals(Position.GK)) {
                newList.add(list.get(rdGoalkeeper));
                goalkeeper++;
            }
        }
        int defenderNum = 0;
        while (defenderNum < defender) {
            int rdDefender = rd.nextInt(19);
            if (list.get(rdDefender).getPosition().equals(Position.DF) && newList.indexOf(list.get(rdDefender)) == -1) {
                newList.add(list.get(rdDefender));
                defenderNum++;
            }
        }
        int midfielderNum = 0;
        while (midfielderNum < midfielder) {
            int rdMidfielder = rd.nextInt(19);
            if (list.get(rdMidfielder).getPosition().equals(Position.MF)
                    && newList.indexOf(list.get(rdMidfielder)) == -1) {
                newList.add(list.get(rdMidfielder));
                midfielderNum++;
            }
        }
        int fowarderNum = 0;
        while (fowarderNum < fowarder) {
            int rdFowarder = rd.nextInt(19);
            if (list.get(rdFowarder).getPosition().equals(Position.FW) && newList.indexOf(list.get(rdFowarder)) == -1) {
                newList.add(list.get(rdFowarder));
                fowarderNum++;
            }
        }
        return newList;

    }
}

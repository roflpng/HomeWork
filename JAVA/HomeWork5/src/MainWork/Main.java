package MainWork;

import MainWork.Obstacles.Obstacle;
import MainWork.Obstacles.Running_track;
import MainWork.Obstacles.Wall;
import MainWork.Partisipants.Cat;
import MainWork.Partisipants.Participant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int random = 1 + (int) (Math.random()*5);
        int nparticipants = random;
        int nobstacles = random;
        System.out.println(random);
        Participant cat[] = new Cat[nparticipants];
        Obstacle jump[] = new Wall[nobstacles];
        Obstacle run[] = new Running_track[nobstacles];
        List<Participant> participants = new ArrayList<>();
        List<Obstacle> obstacles = new ArrayList<>();

        for (int i = 0; nparticipants>i; i++){
            int r = (int) (Math.random());
            participants.add(cat[i]= new Cat());
            cat[i].setmaxHeight(i+r);
            cat[i].setmaxLeight(i+r);
            cat[i].setNumber(i);
        }
        for (int i = 0; nobstacles>i; i++){
            obstacles.add(jump[i]=new Wall());
            obstacles.add(run[i]=new Running_track());
            jump[i].maxHeight(i);
            run[i].maxLeight(i);
        }
        for (int i = 0; participants.size()>i; i++){
            if (cat[i].check()) cat[i].jump(participants.get(i), obstacles.get(i));
            else participants.remove(i);
        }
        for (int i = 0; participants.size()>i; i++) {
            if (cat[i].check()) cat[i].run(participants.get(i), obstacles.get(i + 1));
            else participants.remove(i);
        }
    }
}

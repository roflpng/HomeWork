package MainWork.Partisipants;

import MainWork.Obstacles.Obstacle;

public class Participant {
    private int height;
    private int leight;
    private boolean status = true;
    private int number;
    public void setmaxHeight(int h){
        this.height = h;
    }
    public void setmaxLeight(int l){
        this.leight = l;
    }

    public void jump(Participant p , Obstacle o){
        int run;
        run = o.getHeight() - p.height;
        if(run<=0) System.out.println("Перестрибнув " + number);
        else System.out.println("Не перестрибнув " + number);
    }

    public void run(Participant p, Obstacle o){
        int jump;
        jump = o.getLeight() - p.leight;
        if(jump<=0) System.out.println("Перебіг " + number);
        else {
            System.out.println("Не перебіг. " + number + " Вибуває");
            status = false;
        }
    }
    public boolean check(){
        return status;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

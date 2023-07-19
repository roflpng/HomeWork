public class cat extends Animal {
    private int speed;
    private int swim;
    public cat(String vid, String name) {
        super(vid, name);
    }

    public void run(int speed){
        System.out.println(this.name +" Хазяїн наказав бігти " + this.speed);
        if (this.speed >= 200)this.speed = 200;
        else this.speed = speed;
        System.out.println("Aле він кіт і манав бігти, тому пробіг лише "+ this.speed +" метрів.\n");

    }
    public void swim(int swim){
        System.out.println(this.name +" Хазяїн наказав плести " + this.swim);
        if (this.swim <= 10)this.swim = 10;
        else this.swim = swim;
        System.out.print("Aле він кіт і боїться води, тому проплив лише "+ this.swim +" метрів.\n");
    }
}

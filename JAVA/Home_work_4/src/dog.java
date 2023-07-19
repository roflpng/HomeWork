public class dog extends Animal {
    private int speed;
    private int swim;
    public dog(String vid, String name) {
        super(vid, name);
    }

    public void run(int speed){
        this.speed = speed;
        System.out.println(this.name + " пробіг "+ this.speed +" метрів.");
    }
    public void swim(int swim){
        this.swim = swim;
        System.out.println(this.name + " проплив "+ this.swim +" метрів.\n");
    }
}

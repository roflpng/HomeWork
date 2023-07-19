package Work_5_0;

public class Circle extends Figure {
    private double pi = 3.1415;
    @Override
    public void calсulateArea(int heigh, int leight, int radius) {
        System.out.println("Площа круга дорівнє: "+ radius*radius*pi );
    }
}

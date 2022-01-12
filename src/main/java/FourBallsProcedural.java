import processing.core.PApplet;
public class FourBallsProcedural extends PApplet{
    private int i;
    private int ht;

    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural", args);
    }

    @Override
    public void settings() {
        size(300, 300);
    }

    @Override
    public void setup() {
        i = 0;
        ht = height / 5;
    }

    @Override
    public void draw() {
        drawEllipses();
        i++;
    }

    private void drawEllipses() {
        for (int j = 1; j < 5; j++) {
            ellipse(i * j, j * ht, 20, 20);
        }
    }
}


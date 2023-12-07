import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;

public class Main extends Canvas implements Runnable {

    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    public static String title = "fish!";

    private Fish fish;


    public void draw(Graphics g) {
        fish.draw(g);
    public Main() {
        fish = new fish();




        try {
            fish = ImageIO.read(getClass().getResource("fish.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
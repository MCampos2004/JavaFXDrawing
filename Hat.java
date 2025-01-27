package MainScene;

import javafx.scene.shape.Rectangle;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.transform.Rotate;
import java.util.Random;

public class Hat {

    public Node hatDetails() {

        Pane pane= new Pane();

        Random r = new Random();
        int red = r.nextInt(256);
        int green = r.nextInt(256);
        int blue = r.nextInt(256);

        Arc crown = new Arc(350,350,150,150,0,180);
        crown.setFill(Color.rgb(211,182,131));
        crown.setStroke(Color.BLACK);

        Rectangle band = new Rectangle(200,350,300,40);
        band.setFill(Color.rgb(red, green, blue));
        band.setStroke(Color.BLACK);

        Ellipse brim = new Ellipse(350,385, 250,75);
        brim.setFill(Color.rgb(211,182,131));
        brim.setStroke(Color.BLACK);

        Rectangle vivreCard = new Rectangle(350,325,55,47);
        vivreCard.setFill(Color.WHITESMOKE);
        vivreCard.setStroke(Color.BLACK);

        vivreCard.getTransforms().add(new Rotate(30, 50, 30));

        vivreCard.setX(415);
        vivreCard.setY(130);

        pane.getChildren().addAll(brim,crown,vivreCard,band);

        return pane;

    }


}

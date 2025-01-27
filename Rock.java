package MainScene;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Rock {

    public Node pillar() {

        Pane pane= new Pane();

        Ellipse rock = new Ellipse(350,650, 170,450);
        rock.setFill(Color.rgb(58,59,60));
        rock.setStroke(Color.BLACK);

        pane.getChildren().addAll(rock);

        return pane;
    }
}

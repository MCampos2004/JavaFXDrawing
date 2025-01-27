package MainScene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ThreeDaysTwoYears extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

        Text name = new Text(580, 680, "Miguel Campos");
        name.setFill(Color.WHITE);

        Pane credit = new Pane(name);

        Hat luffy = new Hat();
        Rock placement = new Rock();

        StackPane pane = new StackPane();
        pane.getChildren().addAll(placement.pillar(),luffy.hatDetails(),credit);

        Scene myScene = new Scene(pane,700,700);
        myScene.setFill(Color.rgb(0,51,102));

        primaryStage.setTitle("3D2Y");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

}

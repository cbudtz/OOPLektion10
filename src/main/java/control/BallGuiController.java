package control;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BallGuiController {
    public AnchorPane pane;
    ExecutorService pool = Executors.newCachedThreadPool();

    public void dropBall(ActionEvent actionEvent) {
        Circle circle = new Circle(100,10,10);
        pane.getChildren().addAll(circle);
        pool.execute(()->{
            double speed = Math.random() * 10;
            while (true) {
                try {
                    Thread.sleep(100);
                    Platform.runLater(()->circle.setCenterY(circle.getCenterY()+speed));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

package control;

import javafx.event.ActionEvent;
import javafx.scene.shape.Polyline;

public class GuiController {
    public Polyline polyLine;

    public void buttonClicked(ActionEvent actionEvent) {
        for (int i = 0; i < 40; i++) {
            polyLine.getPoints().addAll(i*5.0 , Math.random() * 480);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

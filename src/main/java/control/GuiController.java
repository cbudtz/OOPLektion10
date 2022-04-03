package control;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Polyline;

public class GuiController {
    @FXML
    public Polyline polyLine;
    @FXML
    public Label label;

    public void buttonClicked(ActionEvent actionEvent) {

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                polyLine.getPoints().addAll(i*5.0 , Math.random() * 480);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Platform.runLater(()->label.setText("Done Drawing"));
        }).start();

    }
}

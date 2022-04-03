module oop {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;

    opens control to javafx.fxml;

    exports control;

}
module oop {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;

    opens control to javafx.fxml;

    exports control;
    exports accounting;
    opens accounting to javafx.fxml;

}
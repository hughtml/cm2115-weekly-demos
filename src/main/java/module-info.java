module uk.ac.rgu {
    requires javafx.controls;
    requires javafx.fxml;

    opens uk.ac.rgu.topic2 to javafx.fxml;
    exports uk.ac.rgu.topic2;
}

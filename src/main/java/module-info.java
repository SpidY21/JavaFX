module com.example.javafx_testing1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javafx_testing1 to javafx.fxml;
    exports com.example.javafx_testing1;
}
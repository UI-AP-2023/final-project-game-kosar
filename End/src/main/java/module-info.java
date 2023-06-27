module com.example.end {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.end to javafx.fxml;
    exports com.example.end;
}
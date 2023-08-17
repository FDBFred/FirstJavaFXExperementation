module com.example.moverfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moverfx to javafx.fxml;
    exports com.example.moverfx;
}
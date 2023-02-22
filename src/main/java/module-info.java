module com.example.increase_decrease {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.increase_decrease to javafx.fxml;
    exports com.example.increase_decrease;
}
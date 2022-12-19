module com.example.gamestore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gamestore to javafx.fxml;
    exports com.example.gamestore;
}
module com.example.myfirstjfxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstjfxapp to javafx.fxml;
    exports com.example.myfirstjfxapp;
}
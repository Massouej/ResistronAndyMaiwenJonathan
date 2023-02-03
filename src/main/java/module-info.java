module com.example.andyjonathanmaiwenresibouton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.andyjonathanmaiwenresibouton to javafx.fxml;
    exports com.example.andyjonathanmaiwenresibouton;
}
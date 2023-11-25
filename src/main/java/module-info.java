module com.example.java_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens phase1 to javafx.fxml;
    exports phase1;
}

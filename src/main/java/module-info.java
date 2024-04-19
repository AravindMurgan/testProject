module com.test.testproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.test.testproject to javafx.fxml;
    exports com.test.testproject;
}
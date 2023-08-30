module com.example.onlinebankingbp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.onlinebankingbp to javafx.fxml;
    exports com.example.onlinebankingbp;
}
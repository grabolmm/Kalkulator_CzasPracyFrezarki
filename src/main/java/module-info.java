module code.kalkulator_czaspracyfrezarki {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens code.kalkulator_czaspracyfrezarki to javafx.fxml;
    exports code.kalkulator_czaspracyfrezarki;
}
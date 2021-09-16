package code.kalkulator_czaspracyfrezarki;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private ChoiceBox wyborMaterialu;


    ObservableList<String> listaMaterialow = FXCollections.observableArrayList("Stal", "Aluminium", "Żeliwo");
}
package code.kalkulator_czaspracyfrezarki;

import code.kalkulator_czaspracyfrezarki.Narzedzia.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {
    Narzedzie wybraneNarzedzie = new WybraneNarzedzie();
    Parametry parametry = new Parametry();
    ObliczeniaCzasu obliczeniaCzasu = new ObliczeniaCzasu();
    int material;
    double obliczoneObrotyWrzeciona = 0;
    double obliczonyPosuwNarzedzia = 0;
    int dlugoscObrysu;
    int glebokoscObrysu;

    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private TextArea textArea1;
    @FXML
    private TextField textField3;
    @FXML
    private TextField textField4;
    @FXML
    private Label label99;
    @FXML
    private Label label100;
    @FXML
    private TextField textField5;

    @FXML
    public void wyborStal(){
        textField1.setText("wybrano Stal");
        material = 1;
    }
    @FXML
    public void wyborAluminium(){
        textField1.setText("wybrano Aluminium");
        material = 2;
    }
    @FXML
    public void wyborZeliwo(){
        textField1.setText("wybrano Zeliwo");
        material = 3;
    }
    @FXML
    public void wyborG25(){
        wybraneNarzedzie = new Glowica25Hcf();
        textField2.setText("wybrano " + wybraneNarzedzie.wyswietlNazwe());
        if (material == 1){
            wybraneNarzedzie.parametryDlaStali();
        }else if (material == 2){
            wybraneNarzedzie.parametryDlaAluminium();
        }else if (material == 3){
            wybraneNarzedzie.parametryDlaZeliwa();
        }
        obliczeniaObrotów();
        obliczeniaPosuw();
        textArea1.setText(parametry.wyswietlParametry(wybraneNarzedzie.vc(), wybraneNarzedzie.d(),
                obliczoneObrotyWrzeciona, obliczonyPosuwNarzedzia, wybraneNarzedzie.ap(), wybraneNarzedzie.fz(), wybraneNarzedzie.z()));

    }
    @FXML
    public void wyborG40(){
        wybraneNarzedzie = new Glowica40Sdkt();
        textField2.setText("wybrano " + wybraneNarzedzie.wyswietlNazwe());
        if (material == 1){
            wybraneNarzedzie.parametryDlaStali();
        }else if (material == 2){
            wybraneNarzedzie.parametryDlaAluminium();
        }else if (material == 3){
            wybraneNarzedzie.parametryDlaZeliwa();
        }
        obliczeniaObrotów();
        obliczeniaPosuw();
        textArea1.setText(parametry.wyswietlParametry(wybraneNarzedzie.vc(), wybraneNarzedzie.d(),
                obliczoneObrotyWrzeciona, obliczonyPosuwNarzedzia, wybraneNarzedzie.ap(), wybraneNarzedzie.fz(), wybraneNarzedzie.z()));

    }
    @FXML
    public void wyborF16(){
        wybraneNarzedzie = new Frez16Vhm();
        textField2.setText("wybrano " + wybraneNarzedzie.wyswietlNazwe());
        if (material == 1){
            wybraneNarzedzie.parametryDlaStali();
        }else if (material == 2){
            wybraneNarzedzie.parametryDlaAluminium();
        }else if (material == 3){
            wybraneNarzedzie.parametryDlaZeliwa();
        }
        obliczeniaObrotów();
        obliczeniaPosuw();
        textArea1.setText(parametry.wyswietlParametry(wybraneNarzedzie.vc(), wybraneNarzedzie.d(),
                obliczoneObrotyWrzeciona, obliczonyPosuwNarzedzia, wybraneNarzedzie.ap(), wybraneNarzedzie.fz(), wybraneNarzedzie.z()));

    }
    public double obliczeniaObrotów(){
        return obliczoneObrotyWrzeciona = parametry.obliczObroty(wybraneNarzedzie.vc(), wybraneNarzedzie.d());
    }
    public double obliczeniaPosuw(){
        return obliczonyPosuwNarzedzia = parametry.obliczPosuw(wybraneNarzedzie.z(), wybraneNarzedzie.fz(), obliczoneObrotyWrzeciona);
    }
    @FXML
    public void dlugoscObrysu(){
        dlugoscObrysu = Integer.parseInt(textField3.getText());
        label99.setText(label99.getText() + textField3.getText() + " mm");
    }
    @FXML
    public void glebokoscObrysu(){
        glebokoscObrysu = Integer.parseInt(textField4.getText());
        label100.setText(label100.getText() + textField4.getText() + " mm");
    }
    @FXML
    public void obliczCzas(){
        double wynik1 = obliczeniaCzasu.czas(dlugoscObrysu,glebokoscObrysu, wybraneNarzedzie.ap(), obliczonyPosuwNarzedzia);
        System.out.println((int)wynik1);
        String wynik = String.valueOf((int)wynik1);
        textField5.setText(wynik + " min");

    }










}
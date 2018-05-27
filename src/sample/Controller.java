package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button Suma;
    @FXML
    private Button Resta;
    @FXML
    private Button Multiplicacion;
    @FXML
    private Button Division;

    @FXML
    private TextField Numero1;
    @FXML
    private TextField Numero2;
    @FXML
    private TextField Resultado;



    public void Suma(ActionEvent event){

        CharSequence cnum1 = Numero1.getCharacters();
        CharSequence cnum2 = Numero2.getCharacters();

        String snum1 = cnum1.toString();
        String snum2 = cnum2.toString();

        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);

        int resultado = num1 + num2;
        String sresultado = String.valueOf(resultado);

        // Show in VIEW
        Resultado.setText(sresultado);
    }

    public void Resta(ActionEvent event){

        CharSequence cnum1 = Numero1.getCharacters();
        CharSequence cnum2 = Numero2.getCharacters();

        String snum1 = cnum1.toString();
        String snum2 = cnum2.toString();

        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);

        int resultado = num1 - num2;
        String sresultado = String.valueOf(resultado);

        // Show in VIEW
        Resultado.setText(sresultado);
    }
    public void Multiplicacion(ActionEvent event){

        CharSequence cnum1 = Numero1.getCharacters();
        CharSequence cnum2 = Numero2.getCharacters();

        String snum1 = cnum1.toString();
        String snum2 = cnum2.toString();

        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);

        int resultado = num1 * num2;
        String sresultado = String.valueOf(resultado);

        // Show in VIEW
        Resultado.setText(sresultado);
    }
    public void Division(ActionEvent event){

        CharSequence cnum1 = Numero1.getCharacters();
        CharSequence cnum2 = Numero2.getCharacters();

        String snum1 = cnum1.toString();
        String snum2 = cnum2.toString();

        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);

        int resultado = num1 / num2;
        String sresultado = String.valueOf(resultado);

        // Show in VIEW
        Resultado.setText(sresultado);
    }



}

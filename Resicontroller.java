package com.example.andyjonathanmaiwenresibouton;

import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;


public class Resicontroller {

    // Setting the rectangle, they represent the rings of the resistance
    @FXML
    Rectangle couleuranneau1;
    @FXML
    Rectangle couleuranneau2;

    @FXML
    Rectangle couleuranneau3;
    @FXML
    Rectangle couleuranneau4;





    // Setting the label corresponding to values of the resistance

    @FXML
    Label labelring1;
    @FXML
    Label labelring2;
    @FXML
    Label labelring3;
    @FXML
    Label labelring4;

    @FXML Label labcolring1;

    @FXML Label labcolring2;

    @FXML Label labcolring3;

    @FXML Label labcolring4;




    @FXML
    TextField conversion;

    // Setting values, so the application can work even if the user has only 1 ring to change.
    @FXML
    public void initialize() {
        labelring1.setText("6");
        labelring2.setText("6");
        labelring3.setText("100");
        labelring4.setText("0.5%");
        conversion.setText("20"+" KΩ");

    }

    //Textfield requested for the result
    @FXML
    TextField result;

    @FXML
    TextField toleranceResult;
    //fnres = fonction resistance, it is calling for CalcuResi and taking from it calculResult in order to give a value to the variable res, also calling convertResult from it in order to prit K M or G for the conversion panel (it is an obligation to converte the result).
    @FXML
    public void fnres() {
        int Label1 = Integer.parseInt(labelring1.getText());
        int Label2 = Integer.parseInt(labelring2.getText());
        double Label3 = Double.parseDouble(labelring3.getText());

        Double res = CalculResi.calculResult(Label1, Label2, Label3);
        result.setText(String.valueOf(res));

        conversion.setText(CalculResi.convertResult(res));
    }



    // Buttons linked to the first ring
    @FXML
    Button button1ring1;


    @FXML
    public void onButton1ring1Action() {
        labelring1.setText("0");
        couleuranneau1.setFill(Color.BLACK);
        fnres();
        labcolring1.setText("Noir");
    }

    @FXML
    Button button2ring1;

    @FXML
    public void onButton2ring1Action() {
        labelring1.setText("1");
        couleuranneau1.setFill(Color.BROWN);
        fnres();
        labcolring1.setText("Brun");
    }

    @FXML
    Button button3ring1;

    @FXML
    public void onButton3ring1Action() {
        labelring1.setText("2");
        couleuranneau1.setFill(Color.RED);
        fnres();
        labcolring1.setText("Rouge");

    }

    @FXML
    Button button4ring1;

    @FXML
    public void onButton4ring1Action() {
        labelring1.setText("3");
        couleuranneau1.setFill(Color.ORANGE);
        fnres();
        labcolring1.setText("Orange");

    }

    @FXML
    Button button5ring1;

    @FXML
    public void onButton5ring1Action() {
        labelring1.setText("4");
        couleuranneau1.setFill(Color.YELLOW);
        fnres();
        labcolring1.setText("Jaune");

    }

    @FXML
    Button button6ring1;

    @FXML
    public void onButton6ring1Action() {
        labelring1.setText("5");
        couleuranneau1.setFill(Color.GREEN);
        fnres();
        labcolring1.setText("Vert");

    }

    @FXML
    Button button7ring1;

    @FXML
    public void onButton7ring1Action() {
        labelring1.setText("6");
        couleuranneau1.setFill(Color.BLUE);
        fnres();
        labcolring1.setText("Bleu");

    }

    @FXML
    Button button8ring1;

    @FXML
    public void onButton8ring1Action() {
        labelring1.setText("7");
        couleuranneau1.setFill(Color.PURPLE);
        fnres();
        labcolring1.setText("Violet");

    }

    @FXML
    Button button9ring1;

    @FXML
    public void onButton9ring1Action() {
        labelring1.setText("8");
        couleuranneau1.setFill(Color.GRAY);
        fnres();
        labcolring1.setText("Gris");

    }

    @FXML
    Button button10ring1;

    @FXML
    public void onButton10ring1Action() {
        labelring1.setText("9");
        couleuranneau1.setFill(Color.WHITE);
        fnres();
        labcolring1.setText("Blanc");

    }


    // Buttons linked to the second ring

    @FXML
    Button button1ring2;

    @FXML
    public void onButton1ring2Action() {
        labelring2.setText("0");
        couleuranneau2.setFill(Color.BLACK);
        fnres();
        labcolring2.setText("Noir");

    }

    @FXML
    Button button2ring2;

    @FXML
    public void onButton2ring2Action() {
        labelring2.setText("1");
        couleuranneau2.setFill(Color.BROWN);
        fnres();
        labcolring2.setText("Brun");
    }

    @FXML
    Button button3ring2;

    @FXML
    public void onButton3ring2Action() {
        labelring2.setText("2");
        couleuranneau2.setFill(Color.RED);
        fnres();
        labcolring2.setText("Rouge");

    }

    @FXML
    Button button4ring2;

    @FXML
    public void onButton4ring2Action() {
        labelring2.setText("3");
        couleuranneau2.setFill(Color.ORANGE);
        fnres();
        labcolring2.setText("Orange");

    }

    @FXML
    Button button5ring2;

    @FXML
    public void onButton5ring2Action() {
        labelring2.setText("4");
        couleuranneau2.setFill(Color.YELLOW);
        fnres();
        labcolring2.setText("Jaune");

    }

    @FXML
    Button button6ring2;

    @FXML
    public void onButton6ring2Action() {
        labelring2.setText("5");
        couleuranneau2.setFill(Color.GREEN);
        fnres();
        labcolring2.setText("Vert");

    }

    @FXML
    Button button7ring2;

    @FXML
    public void onButton7ring2Action() {
        labelring2.setText("6");
        couleuranneau2.setFill(Color.BLUE);
        fnres();
        labcolring2.setText("Bleu");

    }

    @FXML
    Button button8ring2;

    @FXML
    public void onButton8ring2Action() {
        labelring2.setText("7");
        couleuranneau2.setFill(Color.PURPLE);
        fnres();
        labcolring2.setText("Violet");

    }

    @FXML
    Button button9ring2;

    @FXML
    public void onButton9ring2Action() {
        labelring2.setText("8");
        couleuranneau2.setFill(Color.GRAY);
        fnres();
        labcolring2.setText("Gris");

    }

    @FXML
    Button button10ring2;

    @FXML
    public void onButton10ring2Action() {
        labelring2.setText("9");
        couleuranneau2.setFill(Color.WHITE);
        fnres();
        labcolring2.setText("Blanc");

    }

    // Buttons linked to the third ring
    @FXML
    Button button1ring3;

    @FXML
    public void onButton1ring3Action() {
        labelring3.setText("1");
        couleuranneau3.setFill(Color.BLACK);
        fnres();
        labcolring3.setText("Noir");
    }

    @FXML
    Button button2ring3;

    @FXML
    public void onButton2ring3Action() {
        labelring3.setText("10");
        couleuranneau3.setFill(Color.BROWN);
        fnres();
        labcolring3.setText("Brun");

    }

    @FXML
    Button button3ring3;

    @FXML
    public void onButton3ring3Action() {
        labelring3.setText("100");
        couleuranneau3.setFill(Color.RED);
        fnres();
        labcolring3.setText("Rouge");

    }

    @FXML
    Button button4ring3;

    @FXML
    public void onButton4ring3Action() {
        labelring3.setText("1000");
        couleuranneau3.setFill(Color.ORANGE);
        fnres();
        labcolring3.setText("Orange");

    }

    @FXML
    Button button5ring3;

    @FXML
    public void onButton5ring3Action() {
        labelring3.setText("10000");
        couleuranneau3.setFill(Color.YELLOW);
        fnres();
        labcolring3.setText("Jaune");

    }

    @FXML
    Button button6ring3;

    @FXML
    public void onButton6ring3Action() {
        labelring3.setText("100000");
        couleuranneau3.setFill(Color.GREEN);
        fnres();
        labcolring3.setText("Vert");

    }

    @FXML
    Button button7ring3;

    @FXML
    public void onButton7ring3Action() {
        labelring3.setText("1000000");
        couleuranneau3.setFill(Color.BLUE);
        fnres();
        labcolring3.setText("Bleu");

    }

    @FXML
    Button button8ring3;

    @FXML
    public void onButton8ring3Action() {
        labelring3.setText("10000000");
        couleuranneau3.setFill(Color.PURPLE);
        fnres();
        labcolring3.setText("Violet");

    }

    @FXML
    Button button9ring3;

    @FXML
    public void onButton9ring3Action() {
        labelring3.setText("100000000");
        couleuranneau3.setFill(Color.GRAY);
        fnres();
        labcolring3.setText("Gris");

    }

    @FXML
    Button button10ring3;

    @FXML
    public void onButton10ring3Action() {
        labelring3.setText("1000000000");
        couleuranneau3.setFill(Color.WHITE);
        fnres();
        labcolring3.setText("Blanc");

    }

    @FXML
    Button button11ring3;

    @FXML
    public void onButton11ring3Action() {
        labelring3.setText("0.1");
        couleuranneau3.setFill(Color.GOLD);
        fnres();
        labcolring3.setText("Or");

    }

    @FXML
    Button button12ring3;

    @FXML
    public void onButton12ring3Action() {
        labelring3.setText("0.01");
        couleuranneau3.setFill(Color.SILVER);
        fnres();
        labcolring3.setText("Silver");

    }

    //Buttons linked to the ring 4

    @FXML
    Button button1ring4;

    @FXML
    public void onButton1ring4Action() {
        labelring4.setText("1%");
        couleuranneau4.setFill(Color.BROWN);
        toleranceResult.setText("1");
        labcolring4.setText("Brun");



    }

    @FXML
    Button button2ring4;

    @FXML
    public void onButton2ring4Action() {
        labelring4.setText("2%");
        couleuranneau4.setFill(Color.RED);
        toleranceResult.setText("2");
        labcolring4.setText("Rouge");



    }

    @FXML
    Button button3ring4;

    @FXML
    public void onButton3ring4Action() {
        labelring4.setText("0.5%");
        couleuranneau4.setFill(Color.GREEN);
        toleranceResult.setText("0.5");
        labcolring4.setText("Vert");



    }

    @FXML
    Button button4ring4;

    @FXML
    public void onButton4ring4Action() {
        labelring4.setText("0.25%");
        couleuranneau4.setFill(Color.BLUE);
        toleranceResult.setText("0.25");
        labcolring4.setText("Bleu");



    }

    @FXML
    Button button5ring4;

    @FXML
    public void onButton5ring4Action() {
        labelring4.setText("0.10%");
        couleuranneau4.setFill(Color.PURPLE);
        toleranceResult.setText("0.10");
        labcolring4.setText("Violet");



    }

    @FXML
    Button button6ring4;

    @FXML
    public void onButton6ring4Action() {
        labelring4.setText("0.05%");
        couleuranneau4.setFill(Color.GRAY);
        toleranceResult.setText("0.05");
        labcolring4.setText("Gris");



    }

    @FXML
    Button button7ring4;

    @FXML
    public void onButton7ring4Action() {
        labelring4.setText("5%");
        couleuranneau4.setFill(Color.GOLD);
        toleranceResult.setText("5");
        labcolring4.setText("Or");



    }

    @FXML
    Button button8ring4;

    @FXML
    public void onButton8ring4Action() {
        labelring4.setText("10%");
        couleuranneau4.setFill(Color.SILVER);
        toleranceResult.setText("10");
        labcolring4.setText("Argent");



    }




}




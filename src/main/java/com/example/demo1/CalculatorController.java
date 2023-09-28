package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class CalculatorController {
        @FXML
        private Label result;
        private boolean add = false;
        private boolean minus = false;
        private boolean multiply = false;
        private boolean divide = false;
        private String num1;
        private String num2;


        public void setResult(String result){
            this.result.setText(this.result.getText()+result);
        }

        @FXML
        public void buttonNumber(ActionEvent event){
            Button button = (Button) event.getSource();
            setResult(button.getText());

        }

        @FXML
        public void clear(){
            result.setText("");

        }

        @FXML
        public void equal(){
            if (add){
                num2 = result.getText();
                clear();
                String finalresult = Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));
                setResult(finalresult);
                System.out.printf(num1);
                System.out.println(num2);
                add = false;
            }
            else if (minus){
                num2 = result.getText();
                clear();
                String finalresult = Integer.toString(Integer.parseInt(num1) - Integer.parseInt(num2));
                setResult(finalresult);
                System.out.printf(num1);
                System.out.println(num2);
                minus = false;
            }
            else if (multiply){
                num2 = result.getText();
                clear();
                String finalresult = Integer.toString(Integer.parseInt(num1) * Integer.parseInt(num2));
                setResult(finalresult);
                System.out.printf(num1);
                System.out.println(num2);
                multiply = false;
            }
            else if (divide){
                num2 = result.getText();
                clear();
                String finalresult = Integer.toString(Integer.parseInt(num1) / Integer.parseInt(num2));
                setResult(finalresult);
                System.out.printf(num1);
                System.out.println(num2);
                divide = false;
            }
        }

        @FXML
        public void plus(){
            add = true;
            num1 = result.getText();
            clear();
        }

        @FXML
        public void minus(){
            minus = true;
            num1 = result.getText();
            clear();
        }

        @FXML
        public void multiply(){
            multiply = true;
            num1 = result.getText();
            clear();
        }

        @FXML
        public void divide(){
            divide = true;
            num1 = result.getText();
            clear();
        }

        @FXML
        public void Number(){

        }


        @FXML
        public void Zero(){
            setResult("0");
        }
        @FXML
        public void One(){
            setResult("1");
        }


}
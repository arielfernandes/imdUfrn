package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculadoraController implements Initializable {
    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;

    String operacao = "";

    @FXML
    private TextField telaTextField;
    @FXML
    private Button seteButton;
    @FXML
    private Button quatroButton;
    @FXML
    private Button umButton;
    @FXML
    private Button zeroButton;
    @FXML
    private Button oitoButton;
    @FXML
    private Button cincoButton;
    @FXML
    private Button doisButton;
    @FXML
    private Button pontoButton;
    @FXML
    private Button noveButton;
    @FXML
    private Button seisButton;
    @FXML
    private Button tresButton;
    @FXML
    private Button subtracaoButton;
    @FXML
    private Button somaButton;
    @FXML
    private Button igualButton;
    @FXML
    private Button apagarButton;
    @FXML
    private Button divisaoButton;
    @FXML
    private Button multiplicacaoButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        umButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"1");
            }
        });
        doisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"2");
            }
        });
        tresButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"3");
            }
        });
        quatroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"4");
            }
        });
        cincoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"5");
            }
        });
        seisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"6");
            }
        });
        seteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"7");
            }
        });
        oitoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"8");
            }
        });
        noveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"9");
            }
        });
        zeroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText(telaTextField.getText()+"0");
            }
        });

        multiplicacaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "*";
            }
        });
        divisaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "/";
            }
        });
        somaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "+";
            }
        });
        subtracaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "-";
            }
        });

        apagarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                telaTextField.setText("");
                valor1 = 0;
                valor2 = 0;
                operacao = "";
            }
        });
        igualButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                valor2 = Double.parseDouble(telaTextField.getText());

                switch (operacao) {
                    case "+":
                        resultado = valor1 + valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "/":
                        resultado = valor1 / valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                }
                operacao = "";
                valor1 = 0;
                valor2 = 0;
            }
        });
    }
}

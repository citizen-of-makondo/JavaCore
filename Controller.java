package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    public int randomNumber;
    public int tryCount;

    @FXML
    private TextField textField;

    @FXML
    private Label labelField;

    @FXML
    private Button yesButton;

    @FXML
    private Button noButton;

    @FXML
    public void initialize() {
        tryCount = 0;
        randomNumber = (int) (Math.random() * 10);
    }


    @FXML
    void doAction() {
        if (tryCount < 3) {
            game();
            tryCount++;
        } else {
            labelField.setText("У вас закончились попытки. Правильный ответ " + randomNumber + " . \nХотите начать еще раз?");
            yesButton.setVisible(true);
            noButton.setVisible(true);
        }
    }

    private void game() {
        try {
            int number = Integer.parseInt(textField.getText());
            if (number == randomNumber) {
                labelField.setText("Вы выйграли! Хотите начать еще раз?");
                yesButton.setVisible(true);
                noButton.setVisible(true);
            } else if (number < randomNumber) {
                labelField.setText("Загаданное число больше");
                tryCount++;
            } else {
                labelField.setText("Загаданное число меньше");
                tryCount++;
            }
        } catch (NumberFormatException e) {
            labelField.setText("Введите целое число");
        }
    }


    @FXML
    void exitGame() {
        Stage stage = (Stage) noButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void restartGame() {
        initialize();
        textField.clear();
        labelField.setText("");
    }
}

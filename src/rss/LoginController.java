package rss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import sun.rmi.runtime.Log;

public class LoginController {

    @FXML
    private Image rssImage;
    @FXML
    private Label userNameTitle;
    @FXML
    private TextArea userNameText;

    @FXML
    private TextArea passwordText;

    @FXML
    private Button authButton;


    public void initialize()
    {
    }

    public void handleButtonAction(ActionEvent actionEvent) {
        System.out.print(actionEvent.toString() + "\n");
    }
}

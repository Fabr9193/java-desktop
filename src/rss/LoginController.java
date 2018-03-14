package rss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginController {
@FXML
private TextField userNameText;
@FXML
private PasswordField passwordText;

public void login(ActionEvent actionEvent) throws IOException {
    int result = sendLogin(userNameText.getText(), passwordText.getText());
    if (result == 0)
    {
        // go to home page
        Stage homeStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "src/rss/homeView.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
        AnchorPane root = loader.load(fxmlStream);

        Scene scene = new Scene(root);
        homeStage.setScene(scene);
        homeStage.show();
    }
    else {
        userNameText.clear();
        passwordText.clear();
    }
}

private int sendLogin (String username, String password) throws IOException {

    ConnectionHelper.setUpConnection(username, password);

    return 0;
}

}

package Talabat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class SignInPageController {
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Text errorMessage;
    private User user = new User();
    @FXML
    public void signIn(ActionEvent ae){
        try {
            user.signIn(email.getText(), password.getText());
            errorMessage.setOpacity(0);
            UserInformationPageController.setUser(user);
            switchTo(ae);
        }catch (EmailOrPasswordException emailOrPasswordException){
            errorMessage.setOpacity(1);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
    public void switchToSignUpPage(ActionEvent ae) throws IOException {
        Stage stage;
        stage = (Stage)((Node)ae.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene = new Scene(root, Color.LIGHTBLUE);
        stage.setScene(scene);
        stage.show();
    }
    public void switchTo(ActionEvent ae) throws IOException{
        Stage stage;
        stage = (Stage)((Node)ae.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("UserInformationPage.fxml"));
        Scene scene = new Scene(root, Color.LIGHTBLUE);
        stage.setScene(scene);
        stage.show();
    }
}
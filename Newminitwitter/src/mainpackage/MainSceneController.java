

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class MainSceneController implements Initializable{
    @FXML
    private BorderPane bp;
    @FXML
    private BorderPane mbp;
    @FXML
    private Button setting;
    @FXML
    private AnchorPane main;
    @FXML
    private AnchorPane slider;
    @FXML
    private BorderPane settings;
    @FXML
    private BorderPane notes;


    private String now="home";
    @FXML
    void home(MouseEvent event) {
        loadPage("home");
        
    }

    @FXML
    void menutoggle(MouseEvent event) {
        
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(slider);
        slide.setToX(0);
        slide.play();

        slider.setTranslateX(0);

        
    }

    @FXML
    void notes(MouseEvent event) {
        loadPage("notifications");
    }

    @FXML
    void setting(MouseEvent event) {
        loadPage("settings");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO Auto-generated method stub
        // slider.setTranslateX(-176);
        
    }
    private void loadPage(String page) {
        
        if(now == "home"){
            mbp.setVisible(false);           
        }else if(now == "settings"){
            settings.setVisible(false);
        }
        else if(now == "notifications"){
            notes.setVisible(false);
        }
        now = page;
        if(page == "settings"){
            settings.setVisible(true);
        }else if(page == "home"){
            mbp.setVisible(true);
        }
        else if(page == "notifications"){
            notes.setVisible(true);
        }
        // mbp.setCenter(root);
    }

}

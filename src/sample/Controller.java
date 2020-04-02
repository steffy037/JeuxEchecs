package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private GridPane gridPane;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        positionDepart();


    }


    public void positionDepart(){
        ImageView tourNoir = new ImageView(new Image("image/TN.gif"));
        ImageView cavalierNoir = new ImageView(new Image("image/CN.gif"));
        ImageView fouNoir = new ImageView(new Image("image/FN.gif"));
        ImageView roiNoir = new ImageView(new Image("image/DN.gif"));
        ImageView renneNoir = new ImageView(new Image("image/RN.gif"));
        ImageView fouNoir2 = new ImageView(new Image("image/FN.gif"));
        ImageView cavalierNoir2 = new ImageView(new Image("image/CN.gif"));
        ImageView tourNoir2 = new ImageView(new Image("image/TN.gif"));





        gridPane.add(tourNoir, 0, 0);
        gridPane.add(cavalierNoir, 1, 0);
        gridPane.add(fouNoir, 2, 0);
        gridPane.add(roiNoir, 3, 0);
        gridPane.add(renneNoir, 4, 0);
        gridPane.add(fouNoir2, 5, 0);
        gridPane.add(cavalierNoir2, 6, 0);
        gridPane.add(tourNoir2, 7, 0);


        ImageView tourBlanc = new ImageView(new Image("image/TB.gif"));
        ImageView cavalierBlanc = new ImageView(new Image("image/CB.gif"));
        ImageView fouBlanc = new ImageView(new Image("image/FB.gif"));
        ImageView roiBlanc = new ImageView(new Image("image/DB.gif"));
        ImageView renneBlanc = new ImageView(new Image("image/RB.gif"));
        ImageView fouBlanc2 = new ImageView(new Image("image/FB.gif"));
        ImageView cavalierBlanc2 = new ImageView(new Image("image/CB.gif"));
        ImageView tourBlanc2 = new ImageView(new Image("image/TB.gif"));

        gridPane.add(tourBlanc, 0, 7);
        gridPane.add(cavalierBlanc, 1, 7);
        gridPane.add(fouBlanc, 2, 7);
        gridPane.add(roiBlanc, 3, 7);
        gridPane.add(renneBlanc, 4, 7);
        gridPane.add(fouBlanc2, 5, 7);
        gridPane.add(cavalierBlanc2, 6, 7);
        gridPane.add(tourBlanc2, 7, 7);

        ImageView pionBlanc = new ImageView(new Image("image/PB.gif"));
        ImageView pionBlanc1 = new ImageView(new Image("image/PB.gif"));
        ImageView pionBlanc2 = new ImageView(new Image("image/PB.gif"));
        ImageView pionBlanc3 = new ImageView(new Image("image/PB.gif"));
        ImageView pionBlanc4 = new ImageView(new Image("image/PB.gif"));
        ImageView pionBlanc5 = new ImageView(new Image("image/PB.gif"));
        ImageView pionBlanc6 = new ImageView(new Image("image/PB.gif"));
        ImageView pionBlanc7 = new ImageView(new Image("image/PB.gif"));

        gridPane.add(pionBlanc, 0, 6);
        gridPane.add(pionBlanc1, 1, 6);
        gridPane.add(pionBlanc2, 2, 6);
        gridPane.add(pionBlanc3, 3, 6);
        gridPane.add(pionBlanc4, 4, 6);
        gridPane.add(pionBlanc5, 5, 6);
        gridPane.add(pionBlanc6, 6, 6);
        gridPane.add(pionBlanc7, 7, 6);

        ImageView pionNoir = new ImageView(new Image("image/PN.gif"));
        ImageView pionNoir1 = new ImageView(new Image("image/PN.gif"));
        ImageView pionNoir2 = new ImageView(new Image("image/PN.gif"));
        ImageView pionNoir3 = new ImageView(new Image("image/PN.gif"));
        ImageView pionNoir4 = new ImageView(new Image("image/PN.gif"));
        ImageView pionNoir5 = new ImageView(new Image("image/PN.gif"));
        ImageView pionNoir6 = new ImageView(new Image("image/PN.gif"));
        ImageView pionNoir7 = new ImageView(new Image("image/PN.gif"));

        gridPane.add(pionNoir, 0, 1);
        gridPane.add(pionNoir1, 1, 1);
        gridPane.add(pionNoir2, 2, 1);
        gridPane.add(pionNoir3, 3, 1);
        gridPane.add(pionNoir4, 4, 1);
        gridPane.add(pionNoir5, 5, 1);
        gridPane.add(pionNoir6, 6, 1);
        gridPane.add(pionNoir7, 7, 1);

    }
}

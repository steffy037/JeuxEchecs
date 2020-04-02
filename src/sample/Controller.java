package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Pane [][] panes;

    @FXML
    private GridPane gridPane;

    @FXML
    private Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8;

    @FXML
    private Pane pane9, pane10, pane11, pane12,pane13,pane14, pane15, pane16;

    @FXML
    private Pane pane17, pane18, pane19, pane20, pane21, pane22, pane23, pane24;

    @FXML
    private Pane pane25, pane26, pane27, pane28,pane29,pane30, pane31, pane32;

    @FXML
    private Pane pane33, pane34, pane35, pane36, pane37, pane38, pane39, pane40;

    @FXML
    private Pane pane41, pane42, pane43, pane44,pane45,pane46, pane47, pane48;

    @FXML
    private Pane pane49, pane50, pane51, pane52, pane53, pane54, pane55, pane56;

    @FXML
    private Pane pane57, pane58, pane59, pane60,pane61,pane62, pane63, pane64;


    ImageView tourNoir = new ImageView(new Image("image/TN.gif"));
    ImageView cavalierNoir = new ImageView(new Image("image/CN.gif"));
    ImageView fouNoir = new ImageView(new Image("image/FN.gif"));
    ImageView roiNoir = new ImageView(new Image("image/DN.gif"));
    ImageView renneNoir = new ImageView(new Image("image/RN.gif"));
    ImageView fouNoir2 = new ImageView(new Image("image/FN.gif"));
    ImageView cavalierNoir2 = new ImageView(new Image("image/CN.gif"));
    ImageView tourNoir2 = new ImageView(new Image("image/TN.gif"));

    ImageView tourBlanc = new ImageView(new Image("image/TB.gif"));
    ImageView cavalierBlanc = new ImageView(new Image("image/CB.gif"));
    ImageView fouBlanc = new ImageView(new Image("image/FB.gif"));
    ImageView roiBlanc = new ImageView(new Image("image/DB.gif"));
    ImageView renneBlanc = new ImageView(new Image("image/RB.gif"));
    ImageView fouBlanc2 = new ImageView(new Image("image/FB.gif"));
    ImageView cavalierBlanc2 = new ImageView(new Image("image/CB.gif"));
    ImageView tourBlanc2 = new ImageView(new Image("image/TB.gif"));

    ImageView pionBlanc = new ImageView(new Image("image/PB.gif"));
    ImageView pionBlanc1 = new ImageView(new Image("image/PB.gif"));
    ImageView pionBlanc2 = new ImageView(new Image("image/PB.gif"));
    ImageView pionBlanc3 = new ImageView(new Image("image/PB.gif"));
    ImageView pionBlanc4 = new ImageView(new Image("image/PB.gif"));
    ImageView pionBlanc5 = new ImageView(new Image("image/PB.gif"));
    ImageView pionBlanc6 = new ImageView(new Image("image/PB.gif"));
    ImageView pionBlanc7 = new ImageView(new Image("image/PB.gif"));

    ImageView pionNoir = new ImageView(new Image("image/PN.gif"));
    ImageView pionNoir1 = new ImageView(new Image("image/PN.gif"));
    ImageView pionNoir2 = new ImageView(new Image("image/PN.gif"));
    ImageView pionNoir3 = new ImageView(new Image("image/PN.gif"));
    ImageView pionNoir4 = new ImageView(new Image("image/PN.gif"));
    ImageView pionNoir5 = new ImageView(new Image("image/PN.gif"));
    ImageView pionNoir6 = new ImageView(new Image("image/PN.gif"));
    ImageView pionNoir7 = new ImageView(new Image("image/PN.gif"));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        panes = new Pane[8][8];

        Pane [] ligne0 = {pane1,pane2,pane3,pane4,pane5, pane6, pane7,pane8};
        Pane [] ligne1 = {pane9,pane10,pane11,pane12,pane13, pane14, pane15,pane16};
        Pane [] ligne2 = {pane17,pane18,pane19,pane20,pane21, pane22, pane23,pane24};
        Pane [] ligne3 = {pane25,pane26,pane27,pane28,pane29, pane30, pane31,pane32};
        Pane [] ligne4 = {pane33,pane34,pane35,pane36,pane37, pane38, pane39,pane40};
        Pane [] ligne5 = {pane41,pane42,pane43,pane44,pane45, pane46, pane47,pane48};
        Pane [] ligne6 = {pane49,pane50,pane51,pane52,pane53, pane54, pane55,pane56};
        Pane [] ligne7 = {pane57,pane58,pane59,pane60,pane61, pane62, pane63,pane64};

        panes[0] = ligne0;
        panes[1] = ligne1;
        panes[2] = ligne2;
        panes[3] = ligne3;
        panes[4] = ligne4;
        panes[5] = ligne5;
        panes[6] = ligne6;
        panes[7] = ligne7;


        positionDepart();


    }


    public void paneClic(MouseEvent event){

        Pane paneClic = (Pane)event.getSource();
        for(int i = 0; i < panes.length; i++)
        {
            for(int j = 0; j < panes.length; j++)
            {
                if(panes[i][j]==paneClic){
                    System.out.print("x : " + i + " y : " + j);
                }
            }
        }

    }



    public void positionDepart(){

        pane1.getChildren().add(tourNoir);
        pane2.getChildren().add(cavalierNoir);
        pane3.getChildren().add(fouNoir);
        pane4.getChildren().add(roiNoir);
        pane5.getChildren().add(renneNoir);
        pane6.getChildren().add(fouNoir2);
        pane7.getChildren().add(cavalierNoir2);
        pane8.getChildren().add(tourNoir2);

        pane9.getChildren().add(pionNoir);
        pane10.getChildren().add(pionNoir1);
        pane11.getChildren().add(pionNoir2);
        pane12.getChildren().add(pionNoir3);
        pane13.getChildren().add(pionNoir4);
        pane14.getChildren().add(pionNoir5);
        pane15.getChildren().add(pionNoir6);
        pane16.getChildren().add(pionNoir7);

        pane49.getChildren().add(pionBlanc);
        pane50.getChildren().add(pionBlanc1);
        pane51.getChildren().add(pionBlanc2);
        pane52.getChildren().add(pionBlanc3);
        pane53.getChildren().add(pionBlanc4);
        pane54.getChildren().add(pionBlanc5);
        pane55.getChildren().add(pionBlanc6);
        pane56.getChildren().add(pionBlanc7);

        pane57.getChildren().add(tourBlanc);
        pane58.getChildren().add(cavalierBlanc);
        pane59.getChildren().add(fouBlanc);
        pane60.getChildren().add(roiBlanc);
        pane61.getChildren().add(renneBlanc);
        pane62.getChildren().add(fouBlanc2);
        pane63.getChildren().add(cavalierBlanc2);
        pane64.getChildren().add(tourBlanc2);



    }
}

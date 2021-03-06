package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import Controller.Gui;

public class Route {

    public final Pane root;
    public Label lblX, lblY, lblFirstCoordinates, lblObstakels, lblObBeg, lblObEnd, lblX2, lblX3, lblY2, lblY3, lblDatabaseIP, lblGridSize;
    public TextField txtX, txtY, txtObX1, txtObX2, txtObY1, txtObY2, txtDatabaseIP, txtGridSizeX, txtGridSizeY, txtPort;
    public Button btnDrive, btnAddObstacle, btnGridUpdate, btnClearDatabase, btnAdvanced;

    public Route(){
        root = new Pane();
        Gui.setScene(root, "BoeBot Terminal RouteController View", 600, 900);

        lblX = new Label("X Coordinate: ");
        lblY = new Label("Y Coordinate: ");
        lblFirstCoordinates = new Label("Fill in the coordinates where you want to go to.");
        txtX = new TextField();
        txtY = new TextField();
        btnDrive = new Button("Upload all coordinates");
        btnAdvanced = new Button("Manual Obstacles");

        lblFirstCoordinates.relocate(80, 0);
        lblX.relocate(0, 20);
        lblY.relocate(0, 50);
        txtX.relocate(80, 20);
        txtY.relocate(80, 50);

        lblObstakels = new Label("Fill in the list of obstacles on the grid (Optional)");
        txtObX1 = new TextField();
        txtObY1 = new TextField();
        txtObX2 = new TextField();
        txtObY2 = new TextField();
        lblObBeg = new Label("X and Y Coordinate of the obstacle's beginning");
        lblObEnd = new Label("X and Y Coordinate of the obstacle's ending");
        btnAddObstacle = new Button("Add obstacle to list");

        lblObstakels.relocate(80, 140);
        lblObBeg.relocate(80, 170);
        txtObX1.relocate(80, 200);
        txtObY1.relocate(80, 230);
        lblObEnd.relocate(80, 260);
        txtObX2.relocate(80, 290);
        txtObY2.relocate(80, 320);
        btnAddObstacle.relocate(80, 350);
        btnAdvanced.relocate(150, 350);

        lblX2 = new Label("X Coordinate: ");
        lblX3 = new Label("X Coordinate: ");
        lblY2 = new Label("Y Coordinate: ");
        lblY3 = new Label("Y Coordinate: ");

        lblX2.relocate(0, 200);
        lblY2.relocate(0, 230);
        lblX3.relocate(0, 290);
        lblY3.relocate(0, 320);

        txtDatabaseIP = new TextField("localhost");
        txtDatabaseIP.relocate(120, 500);
        txtPort = new TextField("3306");
        txtPort.relocate(270, 500);
        lblDatabaseIP = new Label("Database IP and port: ");
        lblDatabaseIP.relocate(0, 500);

        lblGridSize = new Label("Fill in the grid size here");
        txtGridSizeX = new TextField("7");
        txtGridSizeY = new TextField("5");
        txtGridSizeX.setPromptText("X");
        txtGridSizeY.setPromptText("Y");
        btnGridUpdate = new Button("Update Grid Size");
        btnClearDatabase = new Button("Clear last cycle");

        lblGridSize.relocate(0, 530);
        txtGridSizeX.relocate(0, 560);
        txtGridSizeY.relocate(0, 590);
        btnGridUpdate.relocate(0, 620);

        btnDrive.relocate(100, 680);
        btnClearDatabase.relocate(0, 680);

        root.getChildren().addAll(lblFirstCoordinates, lblX, lblY, txtX, txtY);
        root.getChildren().addAll(lblObstakels, lblObBeg, txtObX1, txtObY1, lblObEnd, txtObX2, txtObY2, btnAddObstacle, lblX2, lblY2, lblX3, lblY3, btnDrive);
        root.getChildren().addAll(lblDatabaseIP, txtDatabaseIP, lblGridSize, txtGridSizeX, txtGridSizeY, btnGridUpdate, btnClearDatabase, txtPort);
    }

    public int getX(){
        try {
            return Integer.parseInt(this.txtX.getText());
        }catch(Exception ex){
            txtX.clear();
            return -1;
        }
    }

    public int getY(){
        try {
            return Integer.parseInt(this.txtY.getText());
        }catch(Exception ex){
            txtX.clear();
            return -1;
        }
    }
}

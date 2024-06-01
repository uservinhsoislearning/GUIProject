package hust.soict.dsai.javafx;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;
    private Color color = Color.BLACK;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(),
                event.getY(), 4, color);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void penRadioButtonPressed(ActionEvent event) {
        color = Color.BLACK;
    }

    @FXML
    void eraserRadioButtonPressed(ActionEvent event) {
        color = Color.WHITE;
    }
}

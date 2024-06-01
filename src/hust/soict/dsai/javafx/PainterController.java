package hust.soict.dsai.javafx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;

    @FXML
    private clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    private drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX()),
                event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
}

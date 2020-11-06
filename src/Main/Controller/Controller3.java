package Main.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller3
{
    @FXML
    private TextField tit,fname,lname;
    @FXML
    private Label lout;

    public void submit()
    {
        lout.setText(tit.getText()+" "+fname.getText()+" "+lname.getText());
    }
}

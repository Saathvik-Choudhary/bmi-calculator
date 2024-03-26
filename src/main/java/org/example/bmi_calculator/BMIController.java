package org.example.bmi_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import java.util.Objects;

public class BMIController {

    @FXML
    private TextField WeightInput;
    @FXML
    private TextField HeightInput;

    @FXML
    private ChoiceBox<String> WeightUnits;

    @FXML
    private ChoiceBox<String> HeightUnits;

    @FXML
    private TextField Output;


    @FXML
    protected void onCalculateButtonClick() {

        try {
            BMIController ob = new BMIController();

            float h = Float.parseFloat(this.getValue(HeightInput));
            float w = Float.parseFloat(this.getValue(WeightInput));

            String wu = WeightUnits.getValue();
            String hu = HeightUnits.getValue();

            System.out.println(wu);
            w = ob.adjustWeight(w, wu);
            h = ob.adjustHeight(h, hu);

            Output.setText(ob.CalculateingBMI(h, w));
        }
        catch (Exception e1)
        {
            Output.setText("Invalid Input");
        }
    }


    @FXML
    private final String getValue(TextField a)
    {
        String value= a.getText();

        return(value);
    }


    private final float adjustWeight(float w,String wu)
    {
        if(Objects.equals(wu, "g"))
        {
            return (w/1000);
        }
        return(w);

    }

    private final float adjustHeight(float h,String hu)
    {
        if(Objects.equals(hu, "in"))
        {
            return (h*2.54f);
        }
        return(h);
    }


    private final String CalculateingBMI(float h,float w)
    {
        return(Float.toString((10000*w)/(h*h)));
    }

}
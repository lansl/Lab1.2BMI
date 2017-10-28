package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private EditText editTextWeight, editTextHeight;
    private TextView title;
    private ImageView imageResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        title = (TextView)findViewById(R.id.title);
        imageResult = (ImageView) findViewById(R.id.imageResult);
    }

    public void calculate_BMI(View view){
        int weight ;
        double height;
        double bmi;

        weight = Integer.parseInt(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());
        bmi = weight/ Math.pow(height,2);

        title.setText(getString(R.string.string1) + String.format(" %.2f.", bmi) + getString(R.string.string2));


    }

    public void clearAll(View c){
        TextView clearWeight, clearHeight;

        clearWeight = (TextView)findViewById(R.id.editTextWeight);
        clearWeight.setText(" ");

        clearHeight = (TextView)findViewById(R.id.editTextHeight);
        clearHeight.setText(" ");
    }
}

package prashi.digi.lowandhighcomparator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int low = 1;
    int high = 20;
    int randomNumber = 0;
    public void generateRandomNumber() {
        Random r = new Random();
        randomNumber = r.nextInt(high-low) + low;
    }
    public void guessOnCllick(View view) {
        EditText numberString = (EditText) findViewById(R.id.editTextNumber);
        int number = Integer.parseInt(numberString.getText().toString());
        String message;
        if (number < randomNumber) {
            message = "Higher";
        }
        else if (number > randomNumber) {
            message = "Lower";
        }
        else {
            message = "Yuo got it!";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}
package prashi.digi.lowandhighcomparator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    static int low = 1;
    static int high = 20;
    static int randomNumber = 0;
    public void guessOnCllick(View view) {
        EditText numberString = (EditText) findViewById(R.id.editTextNumber);
        int number = Integer.parseInt(numberString.getText().toString());
        if (number < randomNumber) {
            Toast.makeText(this, "It is too low", Toast.LENGTH_SHORT).show();
        }
        else if (number > randomNumber) {
            Toast.makeText(this, "It is too high", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "That its", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random r = new Random();
        randomNumber = r.nextInt(high-low) + low;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
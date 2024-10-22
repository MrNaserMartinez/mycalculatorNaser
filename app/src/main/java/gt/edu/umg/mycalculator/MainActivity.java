package gt.edu.umg.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCredits, btnCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar botones
        btnCredits = findViewById(R.id.btnCredits);
        btnCalculator = findViewById(R.id.btnCalculator);

        //iniciar activity de creditos
       btnCredits.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, CreditosActivity.class);
               startActivity(intent);
           }
       });

       //iniciar activity de calculadora
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                Intent intent = new Intent(MainActivity.this, CalculadoraActivity.class);
                startActivity(intent);
            }
        });
    }
}
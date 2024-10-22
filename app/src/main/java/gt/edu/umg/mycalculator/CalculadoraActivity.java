package gt.edu.umg.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_calculadora);

        Button btnRegresarcalcu = findViewById(R.id.btnRegresarcalcu);

        //configuar el boton de regresar
        btnRegresarcalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadoraActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

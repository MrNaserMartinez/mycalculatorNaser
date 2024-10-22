package gt.edu.umg.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreditosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        Button btnRegresar = findViewById(R.id.btnRegresar);

        //configurar boton para regresar
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreditosActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}


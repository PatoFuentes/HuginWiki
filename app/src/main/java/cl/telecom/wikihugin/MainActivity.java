package cl.telecom.wikihugin;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonP = findViewById(R.id.buttonP);
        Button ButtonBN = findViewById(R.id.buttonBN);
        Button ButtonPt = findViewById(R.id.buttonPt);
        Button ButtonM = findViewById(R.id.buttonM);
        Button ButtonLl = findViewById(R.id.buttonLl);
        Button ButtonTB = findViewById(R.id.buttonTB);
        Button ButtonAs = findViewById(R.id.buttonAs);
        Button armasButton = findViewById(R.id.armasButton);
        armasButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ArmasActivity.class);
            startActivity(intent);
        });
        ButtonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiomasActivity("Planicies");
            }
        });
        ButtonBN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiomasActivity("Bosque Oscuro");
            }
        });
        ButtonPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiomasActivity("Pantano");
            }
        });
        ButtonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiomasActivity("Montaña");
            }
        });
        ButtonLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiomasActivity("Llanuras");
            }
        });
        ButtonTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiomasActivity("Tierras Brumosas");
            }
        });
        ButtonAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiomasActivity("Ashland");
            }
        });
    }

    private void openBiomasActivity(String bioma) {
        Intent intent = new Intent(MainActivity.this, ActivityBiomas.class);
        intent.putExtra("BIOMA", bioma);
        startActivity(intent);
    }
}
package com.hfad.beeradvisor;
//Angel negron
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFindBeer = (Button) findViewById(R.id.find_beer);
        TextView tvBrands = (TextView) findViewById(R.id.brands);
        Spinner spinnerBeerColors = (Spinner) findViewById(R.id.beer_color);

        btnFindBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color = spinnerBeerColors.getSelectedItem().toString();
                //tvBrands.setText(String.format("Beer color is %s", color));
                tvBrands.setText(getBeers(color));
            }
        });
    }
        public String getBeers(String color)
        {
            if(color.equals("Light"))
                return "Jail Pale Ale\nLager Lite";
            else if (color.equals("Amber"))
                return "Jack Amber\n RedMoose";
            else if (color.equals("Brown Bear Beer"))
                return "Brown Bear Beer\nBock Brownie";
            else
                return "Gout Stout\nDark Daniel";
        }

    }
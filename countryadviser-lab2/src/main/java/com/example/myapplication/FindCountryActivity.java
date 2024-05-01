package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class FindCountryActivity extends AppCompatActivity {
    private CountryExpert expert = new CountryExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_country);
    }

    public void onClickFindCity(View view) {
        TextView anthem = (TextView) findViewById(R.id.anthem);
        Spinner country = (Spinner) findViewById(R.id.country);
        String countryTitle = String.valueOf(country.getSelectedItem());
        anthem.setText(expert.getAnthem(countryTitle));
        ImageView anthemImage = (ImageView) findViewById(R.id.countryAnthemImage);
        anthemImage.setImageResource(getResources().getIdentifier(countryTitle.toLowerCase(), "drawable", getPackageName()));
    }
}
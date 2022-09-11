package com.example.covid_a_fluch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GOVERNMENT_AID extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.government_aid);
    }
    public void AGREE(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.businessinsider.in/science/news/one-chart-shows-how-well-covid-19-vaccines-protect-you-against-the-delta-variant/articleshow/85465849.cms"));
        startActivity(browserIntent);
    }
}

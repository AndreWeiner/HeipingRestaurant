package com.example.android.heipingrestaurant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.type;
import static com.example.android.heipingrestaurant.R.string.phone;

public class MainActivity extends AppCompatActivity {

    Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
            "mailto", "info@weinwirtschaft-heiping.de", null));
    Intent shareIntent = new Intent(Intent.ACTION_SEND);
    Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+4961515016070"));
    Intent mapsIntent = new Intent(Intent.ACTION_VIEW);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendEmail(View view) {
        startActivity(sendIntent);
    }

    public void makeCall(View view) {
        startActivity(callIntent);
    }

    public void shareContent(View view) {
        shareIntent.setType("text/plain");
        startActivity(Intent.createChooser(shareIntent, "I am eating here: Heiping restaurant!"));
    }

    public void findMaps(View view) {
        mapsIntent.setData(Uri.parse("google.streetview:cbll=49.8613493,8.6526918"));
        startActivity(mapsIntent);

    }
}

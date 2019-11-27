package sdu.cs.apisit.testzoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Zoo extends AppCompatActivity {
    ImageView hippo,ele,call,go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo);

       hippo = findViewById(R.id.imv_hippo);
        ele= findViewById(R.id.imv_elephant);
        call= findViewById(R.id.imv_call);
        go = findViewById(R.id.imv_go);

 final Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.216298, 101.056642('สวนสัตว์เปิดเขาเขียว')");
        ele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eleIntent = new Intent(Intent.ACTION_VIEW,location );
                eleIntent.setPackage("com.google.android.apps.maps");
                startActivity(eleIntent);

            }
        });
        hippo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent hippoIntent =  new Intent(Intent.ACTION_VIEW);
                hippoIntent.setData(Uri.parse("https://youtu.be/41ZU6J5-GsE"));
                startActivity(hippoIntent);
            }
        });

    }
}

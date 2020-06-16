package com.example.e_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DisplayPdfActivity extends AppCompatActivity implements View.OnClickListener {

    String url;
    DatabaseHelper myDb;
    Button fav_python, fav_c, fav_html, fav_ccc, fav_android;
    Boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pdf);
        myDb= new DatabaseHelper(this);

        findViewById(R.id.python).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayPdfActivity.this,pdf_format.class);
                url = "https://drive.google.com/file/d/1pUibxzdoVDeyQFxtTKHVzXiKbmpK_jKl/view?usp=sharing";
                intent.putExtra("url",url);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });
        findViewById(R.id.cpp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayPdfActivity.this,pdf_format.class);
                url = "https://drive.google.com/file/d/1eoE2R4zUBbKZW90PTlQB8ndwtkVPGW7k/view?usp=sharing";
                intent.putExtra("url",url);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);

            }
        });
        findViewById(R.id.ccc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayPdfActivity.this,pdf_format.class);
                url = "https://drive.google.com/file/d/1floLMwaz3OhBkna8o2_kTDMyQD5aIoEK/view?usp=sharing";
                intent.putExtra("url",url);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });
        findViewById(R.id.html).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayPdfActivity.this,pdf_format.class);
                url = "https://drive.google.com/file/d/1PM54W7iamRFY7x2qzrtmubZkyR6TjwU9/view?usp=sharing";
                intent.putExtra("url",url);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });
        findViewById(R.id.Android).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayPdfActivity.this,pdf_format.class);
                url = "https://drive.google.com/file/d/1FX9P59UyPGcmtwylj_9DYNIOdkN37nCe/view?usp=sharing";
                intent.putExtra("url",url);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });

        fav_android = findViewById(R.id.fav_android);
        fav_c = findViewById(R.id.fav_c);
        fav_ccc = findViewById(R.id.fav_ccc);
        fav_html = findViewById(R.id.fav_html);
        fav_python = findViewById(R.id.fav_python);

        fav_python.setOnClickListener(this);
        fav_html.setOnClickListener(this);
        fav_ccc.setOnClickListener(this);
        fav_c.setOnClickListener(this);
        fav_android.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Cursor res =  myDb.getAllData();
        switch (v.getId()){
            case R.id.fav_android:
                while (res.moveToNext())
                {
                    if("Android".equals(res.getString(1)))
                    {
                        flag = false;

                    }
                }
                if (flag){
                    myDb.insertData("Android" , "https://drive.google.com/file/d/1FX9P59UyPGcmtwylj_9DYNIOdkN37nCe/view?usp=sharing");
                    Toast.makeText(this, "Added to favourite", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "The pdf is already saved to favourite", Toast.LENGTH_SHORT).show();
                    flag = true;
                }

                break;
            case R.id.fav_c:
                while (res.moveToNext())
                {
                    if("C".equals(res.getString(1)))
                    {
                        flag = false;
                    }

                }
                if (flag){
                    myDb.insertData("C" , "https://drive.google.com/file/d/1eoE2R4zUBbKZW90PTlQB8ndwtkVPGW7k/view?usp=sharing");
                    Toast.makeText(this, "Added to favourite", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "The pdf is already saved to favourite", Toast.LENGTH_SHORT).show();
                    flag = true;
                }
                break;
            case R.id.fav_ccc:
                while (res.moveToNext())
                {
                    if("CCC".equals(res.getString(1)))
                    {
                        flag = false;
                    }
                }
                if (flag){
                    myDb.insertData("CCC" , "https://drive.google.com/file/d/1floLMwaz3OhBkna8o2_kTDMyQD5aIoEK/view?usp=sharing");
                    Toast.makeText(this, "Added to favourite", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "The pdf is already saved to favourite", Toast.LENGTH_SHORT).show();
                    flag = true;
                }
                break;
            case R.id.fav_html:
                while (res.moveToNext())
                {
                    if("HTML".equals(res.getString(1)))
                    {
                        flag = false;

                    }
                }
                if (flag){
                    myDb.insertData("HTML" , "https://drive.google.com/file/d/1PM54W7iamRFY7x2qzrtmubZkyR6TjwU9/view?usp=sharing");
                    Toast.makeText(this, "Added to favourite", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "The pdf is already saved to favourite", Toast.LENGTH_SHORT).show();
                    flag = true;
                }
                break;
            case R.id.fav_python:
                while (res.moveToNext())
                {
                    if("Python".equals(res.getString(1)))
                    {
                        flag = false;
                    }
                }
                if (flag){
                    myDb.insertData("Python" , "https://drive.google.com/file/d/1pUibxzdoVDeyQFxtTKHVzXiKbmpK_jKl/view?usp=sharing");
                    Toast.makeText(this, "Added to favourite", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "The pdf is already saved to favourite", Toast.LENGTH_SHORT).show();
                    flag = true;
                }

                break;
        }
    }
}

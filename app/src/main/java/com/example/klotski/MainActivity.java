package com.example.klotski;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.percent.PercentFrameLayout;
import android.support.percent.PercentLayoutHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSelect(View view) {
        Intent intent = new Intent(this, SelectActivity.class);
        startActivity(intent);
    }

    public void toReset(View view) {
        SharedPreferences settings = getSharedPreferences("step", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        editor.apply();
        Toast.makeText(getApplicationContext(), "重置成功", Toast.LENGTH_SHORT).show();
    }

    public void toExit(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}

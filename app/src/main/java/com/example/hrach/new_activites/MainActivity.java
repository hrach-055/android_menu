package com.example.hrach.new_activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity{

    private Button forward;
    private EditText txt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forward = (Button) findViewById(R.id.btnActFirst);
        txt = (EditText) findViewById(R.id.name);

        final Intent intent = new Intent(this, SecondActivity.class);
       forward.setOnClickListener(new View.OnClickListener(){
                                      public  void onClick(View v)
                                      {
                                          switch (v.getId()) {
                                              case R.id.btnActFirst:

                                                  intent.putExtra("name", txt.getText().toString());
                                                  startActivity(intent);
                                                  break;
                                              default:
                                                  break;
                                          }
                                      }

                                   }
        );

    }
    public void goNewView(View v){
        switch (v.getId()) {
            case R.id.btnActFirst:
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("name", txt.getText().toString());
                startActivity(intent);
              break;
            default:
                break;
        }
    }
}

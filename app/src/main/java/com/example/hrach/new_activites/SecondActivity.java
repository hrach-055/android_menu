package com.example.hrach.new_activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hrach on 3/9/16.
 */
public class SecondActivity  extends Activity{
    private Button back;
    private TextView txt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        back = (Button) findViewById(R.id.back_button);
        txt = (TextView) findViewById(R.id.nametxt);
        String txtName = getIntent().getStringExtra("name");
        txt.setText(txt.getText().toString() + " " + txtName);


    }
    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

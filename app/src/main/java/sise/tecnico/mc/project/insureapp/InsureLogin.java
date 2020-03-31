package sise.tecnico.mc.project.insureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InsureLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insure_login);

        Button insureLoginButton = (Button) findViewById(R.id.btn_login);
         insureLoginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(InsureLogin.this, InsureMenu.class);
                startActivity(intent);            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        resultView.setText("");
        // create separate AsynkTasks that behave differently for each request in different app
        new WSCallTask(resultView).execute();

    }


    }


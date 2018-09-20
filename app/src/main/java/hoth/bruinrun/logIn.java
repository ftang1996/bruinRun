package hoth.bruinrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static hoth.bruinrun.R.layout.activity_main;

public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public void goToMain(View view) {
        Intent MainPage = new Intent(logIn.this , MainActivity.class);
        startActivity(MainPage);
    }
}

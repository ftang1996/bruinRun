package hoth.bruinrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

import static hoth.bruinrun.R.id.imageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToLogin(View view) {
        Intent LoginPage = new Intent(MainActivity.this , logIn.class);
        startActivity(LoginPage);
    }
    public void goToSearch(View view) {
        Intent SearchPage = new Intent(MainActivity.this , searchList.class);
        startActivity(SearchPage);
    }
    public void goToLogin(View view) {
        Intent LoginPage = new Intent(MainActivity.this , logIn.class);
        startActivity(LoginPage);
    }
    public void goToSearch(View view) {
        Intent SearchPage = new Intent(MainActivity.this , searchList.class);
        startActivity(SearchPage);
    }
}

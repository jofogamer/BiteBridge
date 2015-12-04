package jofo.com.bitebridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cha_layout);
    }
    public void nextBite(View view){
        Intent press_taco = new Intent(this, Lasagna.class);
        startActivity(press_taco);
    }
    public void buyThis (View view){
        Intent buyNow = new Intent(this, BuyingActivity.class);
        startActivity(buyNow);
    }
}

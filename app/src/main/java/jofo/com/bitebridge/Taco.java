package jofo.com.bitebridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Taco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taco_layout);
    }
    public void nextBite(View view){
        Intent press_taco = new Intent(this, ChaActivity.class);
        startActivity(press_taco);
    }
    public void buyThis (View view){
        Intent buyNow = new Intent(this, BuyingActivity.class);
        startActivity(buyNow);
    }
}

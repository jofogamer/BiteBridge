package jofo.com.bitebridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lasagna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lasagna_layout);
    }
    public void buyThis (View view){
        Intent buyNow = new Intent(this, BuyingActivity.class);
        startActivity(buyNow);
    }
}

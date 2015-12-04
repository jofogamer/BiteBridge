package jofo.com.bitebridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class BITE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bite_layout_new);
    }
    public boolean onTouchEvent(MotionEvent event) {

        Intent x = new Intent(this, Taco.class);
        startActivity(x);
        return super.onTouchEvent(event);

    }
}

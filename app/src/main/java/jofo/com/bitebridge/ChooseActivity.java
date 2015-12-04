package jofo.com.bitebridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_layout);
    }
    public void studentLogin(View view) {
        Button useMe = (Button) findViewById(R.id.stuButton);
        String inUse = useMe.getText().toString();
        if (inUse.matches("Student")) {
            Intent x = new Intent(this, StudentActivity.class);
            startActivity(x);
        }
    }

}

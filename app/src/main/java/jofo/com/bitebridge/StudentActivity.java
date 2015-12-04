package jofo.com.bitebridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StudentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_layout);
    }

    public void enterBridge (View view){
        EditText email = (EditText) findViewById(R.id.check_email);
        String emailCheck = email.getText().toString();
        EditText password = (EditText) findViewById(R.id.passWord);
        String passwordCheck = password.getText().toString();
        if(emailCheck.matches("Team Bites") ){
            if( passwordCheck.matches("hungry")){
                Intent intent = new Intent(this, BITE.class);
                startActivity(intent);
            }
            else{
                password.setError("Wrong");
            }
        }
        else{
            email.setError("Invalid Login");

        }
    }

}

package android.vm.findart;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.*;

/**
 * Created by dilomede on 25/01/17.
 */

public class MainActivity extends Activity{

    public static final String USERNAME_KEY = "username";

    TextView welcomeTv;
    Button changeTextBtn;
    EditText changeTextEdit;
    Activity activity = this;
    String username;

    View.OnClickListener changeTxtBtnListener = new View.OnClickListener(){
        public void onClick(View view){
        username = changeTextEdit.getText().toString();


            //welcomeTv.setText("ciao");
           // welcomeTv.setText(changeTextEdit.getText());
            Intent intent = new Intent(activity, Second_Activity.class);
            intent.putExtra(USERNAME_KEY, username);
            intent.putExtra("age", 18);
            startActivity(intent);
        }
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
        welcomeTv = (TextView) findViewById(R.id.welcome_tv);
        changeTextBtn = (Button) findViewById(R.id.change_text_btn);
        changeTextEdit = (EditText) findViewById(R.id.change_text_edit);
        changeTextBtn.setOnClickListener(changeTxtBtnListener);
    }
}

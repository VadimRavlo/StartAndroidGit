package ua.com.wadyan.p0171dynamiclayout2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText editText;
    Button btnCreate;
    Button btnClear;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.llMain);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
        editText = (EditText) findViewById(R.id.etName);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCreate:
                LinearLayout.LayoutParams newBtnParams = new LinearLayout.LayoutParams(wrapContent, wrapContent);
                switch (rgGravity.getCheckedRadioButtonId()){
                    case R.id.rbLeft:
                        newBtnParams.gravity = Gravity.LEFT;
                        break;
                    case R.id.rbCenter:
                        newBtnParams.gravity = Gravity.CENTER;
                        break;
                    case R.id.rbRight:
                        newBtnParams.gravity = Gravity.RIGHT;
                        break;
                }
                Button btnNew = new Button(this);
                btnNew.setText(editText.getText().toString());
                llMain.addView(btnNew, newBtnParams);
                break;
            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(this, "All remove", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

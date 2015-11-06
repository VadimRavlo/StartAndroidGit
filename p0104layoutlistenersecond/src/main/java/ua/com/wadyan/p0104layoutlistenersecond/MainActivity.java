package ua.com.wadyan.p0104layoutlistenersecond;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.tvOut);
    }
    public void onClickListener(View v){
        switch (v.getId()){
            case R.id.btnOk:
                tvOut.setText("Натиснута кнопочела OK");
                break;
            case R.id.btnCancel:
                tvOut.setText("Натиснута кнопочела Cancel");
        }
    }
}

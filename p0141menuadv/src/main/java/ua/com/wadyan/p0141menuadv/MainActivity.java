package ua.com.wadyan.p0141menuadv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Wad";
    TextView tv;
    CheckBox chbExtMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        chbExtMenu = (CheckBox) findViewById(R.id.chbExtMenu);
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        Log.d(TAG, "Створення меню");
        menu.add(0, 1, 0, "add");
        menu.add(0, 2, 0, "edit");
        menu.add(0, 3, 3, "delete");
        menu.add(1, 4, 1, "copy");
        menu.add(1, 5, 2, "paste");
        menu.add(1, 6, 4, "exit");
        menu.add(1, 6, 4, "fuck");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.d(TAG, "Підготовка меню");
        menu.setGroupVisible(1, chbExtMenu.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, "Опції вибору");
        StringBuilder sb = new StringBuilder();
        sb.append("ItemMenu");
        sb.append("\r\n groupId: " + String.valueOf(item.getGroupId()));
        sb.append("\r\n itemId: " + String.valueOf(item.getItemId()));
        sb.append("\r\n order: " + String.valueOf(item.getOrder()));
        sb.append("\r\n title: " + String.valueOf(item.getTitle()));
        tv.setText(sb.toString());
        return super.onOptionsItemSelected(item);
    }
}

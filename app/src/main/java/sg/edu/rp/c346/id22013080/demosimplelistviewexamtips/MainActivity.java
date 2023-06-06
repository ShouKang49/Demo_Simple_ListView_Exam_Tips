package sg.edu.rp.c346.id22013080.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView IvExamTips;

    String[] arrTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IvExamTips = findViewById(R.id.listViewExamTips);

        arrTips = new String[5];
        arrTips[0] = "Don't just read the code, code it as much as possible during each practical session";
        arrTips[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        arrTips[2] = "Prepare your template source code for each topic";
        arrTips[3] = "Create a few empty Android projects to speed up your coding during the exam";
        arrTips[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrTips);

        IvExamTips.setAdapter(adapter);
    }
}

package christian.columna.com.bigproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;

public class addSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_semester);

        //get the spinner from the xml.
        Spinner yrDrop = findViewById(R.id.yrDrop);
        //create a list of items for the spinner.
 String[] yearLevels = new String[]{"1st Year", "2nd Year", "3rd Year", "4th Year", "Fifth Year", "Sixth Year", "Seventh Year", "Eighth Year"};


        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, yearLevels);
//set the spinners adapter to the previously created one.
        yrDrop.setAdapter(yearAdapter);


        //get the spinner from the xml.
        Spinner semDrop = findViewById(R.id.semDrop);
        //create a list of items for the spinner.
        String[] sem = new String[]{"1st Semester", "2nd Semester", "3rd Semester"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> semAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, sem);
//set the spinners adapter to the previously created one.
        semDrop.setAdapter(semAdapter);

        Button one1 = (Button)findViewById(R.id.one1);
        Button two1 = (Button)findViewById(R.id.two1);
        Button three1 = (Button)findViewById(R.id.three1);
        Button one2 = (Button)findViewById(R.id.one2);
        Button two2 = (Button)findViewById(R.id.two2);
        Button three2 = (Button)findViewById(R.id.three2);
        Button one3 = (Button)findViewById(R.id.one3);
        Button two3 = (Button)findViewById(R.id.two3);
        Button three3 = (Button)findViewById(R.id.three3);
        Button one4 = (Button)findViewById(R.id.one4);
        Button two4 = (Button)findViewById(R.id.two4);
        Button three4 = (Button)findViewById(R.id.three4);

        TextView year1 = (TextView)findViewById(R.id.year1);
        TextView year2 = (TextView)findViewById(R.id.year2);
        TextView year3 = (TextView)findViewById(R.id.year3);
        TextView year4 = (TextView)findViewById(R.id.year4);

        Button course1 = (Button)findViewById(R.id.course1);
        Button course2 = (Button)findViewById(R.id.course2);
        Button course3 = (Button)findViewById(R.id.course3);
        Button course4 = (Button)findViewById(R.id.course4);
        Button course5 = (Button)findViewById(R.id.course5);
        Button course6 = (Button)findViewById(R.id.course6);
        Button course7 = (Button)findViewById(R.id.course7);
        Button course8 = (Button)findViewById(R.id.course8);
        Button course9 = (Button)findViewById(R.id.course9);
        Button course10 = (Button)findViewById(R.id.course10);
        EditText numOfCInp = (EditText)findViewById(R.id.numOfCInp);
        Button addSemButton = (Button)findViewById(R.id.addSemButton);
        addSemButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent addSemButton = new Intent(getApplicationContext(),viewSemesters.class);
                startActivity(addSemButton);
            }
        });
    }
}

package christian.columna.com.bigproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;

public class input2ndGrade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2nd_grade);
        //create a list of items for the spinner.
        String[] fContents = new String[]{"Quiz", "Seatwork", "Homework", "Activity", "Preliminary Exam", "Project", "Final Exam", "Attendance"};

        //get the spinner from the xml.
        Spinner fContent1 = findViewById(R.id.fContent1);
        Spinner fContent2 = findViewById(R.id.fContent2);
        Spinner fContent3 = findViewById(R.id.fContent3);
        Spinner fContent4 = findViewById(R.id.fContent4);
        Spinner fContent5 = findViewById(R.id.fContent5);
        Spinner fContent6 = findViewById(R.id.fContent6);
        Spinner fContent7 = findViewById(R.id.fContent7);
        Spinner fContent8 = findViewById(R.id.fContent8);
        Spinner fContent9 = findViewById(R.id.fContent9);
        Spinner fContent10 = findViewById(R.id.fContent10);



        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.

        ArrayAdapter<String> fContentAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, fContents);
//set the spinners adapter to the previously created one.
        fContent1.setAdapter(fContentAdapter);
        fContent2.setAdapter(fContentAdapter);
        fContent3.setAdapter(fContentAdapter);
        fContent4.setAdapter(fContentAdapter);
        fContent5.setAdapter(fContentAdapter);
        fContent6.setAdapter(fContentAdapter);
        fContent7.setAdapter(fContentAdapter);
        fContent8.setAdapter(fContentAdapter);
        fContent9.setAdapter(fContentAdapter);
        fContent10.setAdapter(fContentAdapter);


        EditText fContentInp1 = (EditText)findViewById(R.id.fContentInp1);
        EditText fContentInp2 = (EditText)findViewById(R.id.fContentInp2);
        EditText fContentInp3 = (EditText)findViewById(R.id.fContentInp3);
        EditText fContentInp4 = (EditText)findViewById(R.id.fContentInp4);
        EditText fContentInp5 = (EditText)findViewById(R.id.fContentInp5);
        EditText fContentInp6 = (EditText)findViewById(R.id.fContentInp6);
        EditText fContentInp7 = (EditText)findViewById(R.id.fContentInp7);
        EditText fContentInp8 = (EditText)findViewById(R.id.fContentInp8);
        EditText fContentInp9 = (EditText)findViewById(R.id.fContentInp9);
        EditText fContentInp10 = (EditText)findViewById(R.id.fContentInp10);



        Button fCompSemGr = (Button)findViewById(R.id.fCompSemGr);
        fCompSemGr.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent fCompSemGr = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(fCompSemGr);
            }

        });



    }
}

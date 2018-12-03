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

public class inputGrade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_grade);

        int pquiztotal = 0;
        int pseattotal = 0;
        int phometotal = 0;
        int pacttotal = 0;
        int pprojtotal = 0;
        int pprelimtotal = 0;
        int pfinaltotal = 0;
        int patttotal = 0;


        String[] pContents = new String[]{"Quiz", "Seatwork", "Homework", "Activity",  "Project", "Preliminary Exam", "Final Exam", "Attendance"};

        //get the spinner from the xml.
        Spinner pContent1 = findViewById(R.id.pContent1);
        Spinner pContent2 = findViewById(R.id.pContent2);
        Spinner pContent3 = findViewById(R.id.pContent3);
        Spinner pContent4 = findViewById(R.id.pContent4);
        Spinner pContent5 = findViewById(R.id.pContent5);
        Spinner pContent6 = findViewById(R.id.pContent6);
        Spinner pContent7 = findViewById(R.id.pContent7);
        Spinner pContent8 = findViewById(R.id.pContent8);
        Spinner pContent9 = findViewById(R.id.pContent9);
        Spinner pContent10 = findViewById(R.id.pContent10);



        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.

        ArrayAdapter<String> pContentAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, pContents);
//set the spinners adapter to the previously created one.
        pContent1.setAdapter(pContentAdapter);
        pContent2.setAdapter(pContentAdapter);
        pContent3.setAdapter(pContentAdapter);
        pContent4.setAdapter(pContentAdapter);
        pContent5.setAdapter(pContentAdapter);
        pContent6.setAdapter(pContentAdapter);
        pContent7.setAdapter(pContentAdapter);
        pContent8.setAdapter(pContentAdapter);
        pContent9.setAdapter(pContentAdapter);
        pContent10.setAdapter(pContentAdapter);

        EditText pContentInp1 = (EditText)findViewById(R.id.pContentInp1);
        EditText pContentInp2 = (EditText)findViewById(R.id.pContentInp2);
        EditText pContentInp3 = (EditText)findViewById(R.id.pContentInp3);
        EditText pContentInp4 = (EditText)findViewById(R.id.pContentInp4);
        EditText pContentInp5 = (EditText)findViewById(R.id.pContentInp5);
        EditText pContentInp6 = (EditText)findViewById(R.id.pContentInp6);
        EditText pContentInp7 = (EditText)findViewById(R.id.pContentInp7);
        EditText pContentInp8 = (EditText)findViewById(R.id.pContentInp8);
        EditText pContentInp9 = (EditText)findViewById(R.id.pContentInp9);
        EditText pContentInp10 = (EditText)findViewById(R.id.pContentInp10);




        Button pCompSemGr = (Button)findViewById(R.id.pCompSemGr);
        pCompSemGr.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){

                Intent pCompSemGr = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(pCompSemGr);
            }

        });
    }
}

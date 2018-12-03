package christian.columna.com.bigproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class viewCourses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_courses);


        Button course1 = (Button)findViewById(R.id.course1);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course1 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course1);
            }
        });


        Button course2 = (Button)findViewById(R.id.course2);
        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course2 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course2);
            }
        });


        Button course3 = (Button)findViewById(R.id.course3);
        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course3 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course3);
            }
        });


        Button course4 = (Button)findViewById(R.id.course4);
        course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course4 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course4);
            }
        });


        Button course5 = (Button)findViewById(R.id.course5);
        course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course5 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course5);
            }
        });


        Button course6 = (Button)findViewById(R.id.course6);
        course6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course6 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course6);
            }
        });


        Button course7 = (Button)findViewById(R.id.course7);
        course7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course7 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course7);
            }
        });


        Button course8 = (Button)findViewById(R.id.course8);
        course8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course8 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course8);
            }
        });


        Button course9 = (Button)findViewById(R.id.course9);
        course9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course9 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course9);
            }
        });

        Button course10 = (Button)findViewById(R.id.course10);
        course10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course10 = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(course10);
            }
        });


        Button logOutButt1 = (Button)findViewById(R.id.logOutButt1);
        logOutButt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logOutButt1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(logOutButt1);
            }
        });
    }

}

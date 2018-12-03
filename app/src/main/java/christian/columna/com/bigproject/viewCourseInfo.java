package christian.columna.com.bigproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class viewCourseInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_course_info);

        Button editButton = (Button)findViewById(R.id.editButton);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent editButton = new Intent(getApplicationContext(),addCourse.class);
                startActivity(editButton);
            }

        });

        Button inputGradesButt = (Button)findViewById(R.id.inputGradesButt);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent inputGradesButt = new Intent(getApplicationContext(),inputGrade.class);
                startActivity(inputGradesButt);
            }

        });
    }
}

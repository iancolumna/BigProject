package christian.columna.com.bigproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class addCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);

        Button editCourseButt = (Button)findViewById(R.id.editCourseButt);
        editCourseButt.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent editCourseButt = new Intent(getApplicationContext(),viewCourseInfo.class);
                startActivity(editCourseButt);
            }

        });
    }
}

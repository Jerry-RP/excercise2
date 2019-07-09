package sg.edu.rp.c346.excercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Employee> employeeList;

    CustomAdapter ca;
    ListView employeeLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        employeeLV =findViewById(R.id.listViewMovie);
        employeeList =new ArrayList<Employee>();
        employeeList.add(new Employee("John","Software Technical Leader",3400));
        employeeList.add(new Employee("May","Programmer",2200));


        ca=new CustomAdapter(this,R.layout.row, employeeList);


        employeeLV.setAdapter(ca);
    }
}

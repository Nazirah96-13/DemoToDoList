package sg.edu.rp.c346.id17032457.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
 //Declare
    ListView TodoList;
    ArrayList<ToDoItem>alList;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TodoList = findViewById(R.id.ListTodo);



        //Create Arraylist
        alList = new ArrayList<>();
        //Calendar
        Calendar date = Calendar.getInstance();
        date.set(2020,0,1);

        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 2);


        // Create an object

        alList.add(new ToDoItem("Go for movie",date));
        alList.add(new ToDoItem("Go for haircut",date1));

        //ArrayAdapter<ToDoItem>(this,android.R.layout.simple_list_item_1,alList);
        adapter = new CustomAdapter(this, R.layout.row, alList);
        TodoList.setAdapter(adapter);

    }
}

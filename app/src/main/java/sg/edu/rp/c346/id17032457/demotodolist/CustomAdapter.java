package sg.edu.rp.c346.id17032457.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id17032457.demotodolist.R;
import sg.edu.rp.c346.id17032457.demotodolist.ToDoItem;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> personalList;

    //Exercise C
    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        //super - calling the parent
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        personalList = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        // Obtain the Android Version information based on the position
        tvTitle.setText(personalList.get(position).getTitle());

        //tvVersion.setText(currentVersion.getCalendar());
        tvDate.setText(personalList.get(position).toString());

        return rowView;
    }
}
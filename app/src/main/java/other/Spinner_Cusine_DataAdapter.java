package other; /**
 * Created by Wolf Soft on 2/1/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import e.wolfsoft1.home_activity_flight_booking.R;

import java.util.ArrayList;


public class Spinner_Cusine_DataAdapter extends ArrayAdapter<ItemData1> {
    int groupid;
    Context context;
    ArrayList<ItemData1> list;
    LayoutInflater inflater;

    public Spinner_Cusine_DataAdapter(Context context, int groupid, int id, ArrayList<ItemData1>
            list) {
        super(context, id, list);
        this.list = list;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.groupid = groupid;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        View itemView = inflater.inflate(groupid, parent, false);
        TextView textView = (TextView) itemView.findViewById(R.id.data);
        textView.setText(list.get(position).getText());

//        if (position == 0) {
//
//            imageView.setVisibility(View.VISIBLE);
//        }else {
//
//            imageView.setVisibility(View.GONE);
//        }


        return itemView;
    }

    public View getDropDownView(int position, View convertView, ViewGroup
            parent) {
        return getView(position, convertView, parent);

    }
}

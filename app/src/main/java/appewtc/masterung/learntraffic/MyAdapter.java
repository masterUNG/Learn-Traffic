package appewtc.masterung.learntraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 4/3/16 AD.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context context;
    private String[] titleStrings, descriptionStrings;
    private int[] iconInts;

    public MyAdapter(Context context, String[] titleStrings, String[] descriptionStrings, int[] iconInts) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.descriptionStrings = descriptionStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //For TextView
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        TextView descripTextView = (TextView) view1.findViewById(R.id.textView3);
        descripTextView.setText(descriptionStrings[i]);

        //For Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);


        return view1;
    }
}   // Main Class

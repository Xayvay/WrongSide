package x.wrongside;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by X on 12/30/2015.
 */
public class SquareAdapter extends BaseAdapter {
    private Context mContext;
    DisplayMetrics metrics = new DisplayMetrics();


    public SquareAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(MainActivity.displayHeight/7,MainActivity.displayHeight/7));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.squareblue, R.drawable.squareblue,R.drawable.squareblue,
            R.drawable.squareblue, R.drawable.squareblue,R.drawable.squareblue,
            R.drawable.squareblue, R.drawable.squareblue,R.drawable.squareblue,
            R.drawable.squarered, R.drawable.squarered,R.drawable.squarered,
            R.drawable.squarered, R.drawable.squarered,R.drawable.squarered,
            R.drawable.squarered, R.drawable.squarered,R.drawable.squarered,


    };
}
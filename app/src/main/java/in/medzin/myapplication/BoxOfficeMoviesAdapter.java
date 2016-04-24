package in.medzin.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by root on 24/4/16.
 */
public class BoxOfficeMoviesAdapter extends ArrayAdapter<BoxOfficeMovie> {

    public BoxOfficeMoviesAdapter(Context context, ArrayList<BoxOfficeMovie> aMovies)
    {
        super(context,0,aMovies);
    }

    @Override
    public View getView (int position, View convertView , ViewGroup parent) {

        return null;
    }
}

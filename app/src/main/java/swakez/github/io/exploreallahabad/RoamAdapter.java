package swakez.github.io.exploreallahabad;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by swati on 14/04/2017.
 */

public class RoamAdapter extends RecyclerView.Adapter<RoamAdapter.ViewHolder> {

    private ArrayList<DataModel> dataSet;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextViewUpper;
        public TextView mTextViewLower;


        public ViewHolder(View view) {
            super(view);
            this.mTextViewUpper = (TextView)itemView.findViewById(R.id.text_view_upper);
            this.mTextViewLower = (TextView)itemView.findViewById(R.id.text_view_lower);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RoamAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }


    @Override
    public RoamAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RoamAdapter.ViewHolder holder, int position) {

        TextView textViewUpper = holder.mTextViewUpper;
        TextView textViewLower = holder.mTextViewLower;


        textViewUpper.setText(dataSet.get(position).getName());
        textViewLower.setText(dataSet.get(position).getPlace());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}

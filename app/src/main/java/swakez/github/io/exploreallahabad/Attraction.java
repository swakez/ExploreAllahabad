package swakez.github.io.exploreallahabad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by swati on 05/04/2017.
 */

public class Attraction extends Fragment{


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static RecyclerView.Adapter adapter;

    private  StaggeredGridLayoutManager mStaggeredGridLayoutManager;

    private static ArrayList<DataModel> data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.default_layout,container,false);

  /*      mRecyclerView = (RecyclerView)getActivity().findViewById(R.id.my_recycler_view);

//        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        //mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(3,1);

       // final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
      //  layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        if (mStaggeredGridLayoutManager == null)
            Log.e("Attraction","value null"+mStaggeredGridLayoutManager);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataModel>();
        for (int i = 0 ; i <= 20 ; i++ ){
            data.add(new DataModel(("Name " + i),("Place " + i)));
        }

        adapter = new RoamAdapter(data);
        mRecyclerView.setAdapter(adapter);
        return view;  */
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView = (RecyclerView)getActivity().findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        //LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
       // mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,1);

        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);

        data = new ArrayList<DataModel>();
        for (int i = 0 ; i <= 20 ; i++ ){
            data.add(new DataModel(("Name " + i),("Place " + i)));
        }

        adapter = new RoamAdapter(data);
        mRecyclerView.setAdapter(adapter);

    }
}

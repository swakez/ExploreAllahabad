package swakez.github.io.exploreallahabad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by swati on 02/05/2017.
 */

public class Dine extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static RecyclerView.Adapter adapter;

    private static ArrayList<DataModel> data;

    public Dine(){}
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.default_layout, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);
        rv.setHasFixedSize(true);
        //  MyAdapter adapter = new MyAdapter(new String[]{"test one", "test two", "test three", "test four", "test five" , "test six" , "test seven"});

        ArrayList<DataModel> data = new ArrayList<DataModel>();

        data.add(new DataModel("Aryan's","4"));
        data.add(new DataModel("McD","4"));
        data.add(new DataModel("Sagar Ratna","4.0"));
        data.add(new DataModel("Tamarind Tree","4.0"));
        data.add(new DataModel("Bikanerwala","4.0"));
        data.add(new DataModel("El Chico","4.0"));
        data.add(new DataModel("KFC","4.0"));
        data.add(new DataModel("Hotstuff","4.0"));
        data.add(new DataModel("Celebrations","4.0"));
        data.add(new DataModel("Subway","4.0"));

       RecyclerView.Adapter adapter;
        adapter = new RoamAdapter(data);

        mRecyclerView.setAdapter(adapter);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
/*
    private void setView(){
        mRecyclerView = (RecyclerView)getActivity().findViewById(R.id.my_recycler_view);
        //mRecyclerView.setHasFixedSize(true);

        //    StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new SlideInUpAnimator());

        //TODO fetch data from firebase
        data = new ArrayList<DataModel>();

        data.add(new DataModel("Aryan's","4"));
        data.add(new DataModel("McD","4"));
        data.add(new DataModel("Sagar Ratna","4.0"));
        data.add(new DataModel("Tamarind Tree","4.0"));
        data.add(new DataModel("Bikanerwala","4.0"));
        data.add(new DataModel("El Chico","4.0"));
        data.add(new DataModel("KFC","4.0"));
        data.add(new DataModel("Hotstuff","4.0"));
        data.add(new DataModel("Celebrations","4.0"));
        data.add(new DataModel("Subway","4.0"));

        adapter = new RoamAdapter(data);
        mRecyclerView.setAdapter(adapter);
    } */
}


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
 * Created by swati on 05/04/2017.
 */

public class Attraction extends Fragment {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    private static ArrayList<DataModel> data1;

    public Attraction() {

    }

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

        data.add(new DataModel("Triveni Sangam", "Daraganj"));
        data.add(new DataModel("All Saints Cathedral", "Civil Lines"));
        data.add(new DataModel("Allahabad Fort", "Fort road"));
        data.add(new DataModel("Anand Bhawan", "Near Balson Chauraha"));
        data.add(new DataModel("Jawahar Planatorium", "Tagore Town"));
        data.add(new DataModel("Khurso bagh", "Lukarganj"));
        data.add(new DataModel("Thornhill Mayne Memorial", "Chandra Shekhar Azad Park"));
        data.add(new DataModel("Minto Park", "Allahabad Fort"));
        data.add(new DataModel("New Yamuna Bridge", "Mutthiganj"));
        data.add(new DataModel("Allahabad Museum", "Kamla Nehru Road"));
        RecyclerView.Adapter adapter;
        adapter = new RoamAdapter(data);

        mRecyclerView.setAdapter(adapter);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }
/*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setView();
    }

    private void setView(){
        mRecyclerView = (RecyclerView)getActivity().findViewById(R.id.my_recycler_view);
        //mRecyclerView.setHasFixedSize(true);

        //    StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        //TODO fetch data from firebase
        data = new ArrayList<DataModel>();

        data.add(new DataModel("Triveni Sangam","Daraganj"));
        data.add(new DataModel("All Saints Cathedral","Civil Lines"));
        data.add(new DataModel("Allahabad Fort","Fort road"));
        data.add(new DataModel("Anand Bhawan","Near Balson Chauraha"));
        data.add(new DataModel("Jawahar Planatorium","Tagore Town"));
        data.add(new DataModel("Khurso bagh","Lukarganj"));
        data.add(new DataModel("Thornhill Mayne Memorial","Chandra Shekhar Azad Park"));
        data.add(new DataModel("Minto Park","Allahabad Fort"));
        data.add(new DataModel("New Yamuna Bridge","Mutthiganj"));
        data.add(new DataModel("Allahabad Museum","Kamla Nehru Road"));

        adapter = new RoamAdapter(data);
        mRecyclerView.setAdapter(adapter);
    } */
}

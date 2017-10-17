package com.example.todofragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ebbi on 17/10/2017.
 */

public class TodoListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_todo_list, container, false);

        RecyclerView todoRecyclerView = (RecyclerView) view.findViewById(R.id.todo_recycler_view);
        todoRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;

    }


    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

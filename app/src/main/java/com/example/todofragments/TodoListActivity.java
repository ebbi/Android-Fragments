package com.example.todofragments;

import android.support.v4.app.Fragment;

/**
 * Created by Ebbi on 17/10/2017.
 */

public class TodoListActivity extends SingleTodoFragmentActivity {

    @Override
    protected Fragment createFragment() {

        return new TodoListFragment();
    }

}

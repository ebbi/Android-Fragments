package com.example.todofragments;

import android.support.v4.app.Fragment;

public class TodoActivity extends SingleTodoFragmentActivity {

    @Override
    protected Fragment createFragment() {

        return new TodoFragment();
    }
}

/*
The following code is common to every activity hence it is abstracted to an
Abstract class SingleTodoFragmentActivity for sharing this common code

public class TodoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_todo_fragment);
        setContentView(R.layout.activity_todo_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            fragment = new TodoFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
*/
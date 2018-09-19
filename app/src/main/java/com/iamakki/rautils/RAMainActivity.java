package com.iamakki.rautils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.iamakki.ra_utils.RAUtils;
import com.iamakki.rautils.adapter.SudentAdapter;
import com.iamakki.rautils.models.Student;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Ra main activity.
 */
public class RAMainActivity extends AppCompatActivity implements View.OnClickListener  {

    private RecyclerView mRecyclerView;
    private SudentAdapter mStudentAdapter;
    private List<Student> mList;
    private Button mButton_remove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = new ArrayList<>();
        mList.add(new Student("Akshay", 31));
        mList.add(new Student("Rajendra", 35));
        mList.add(new Student("Chetan", 25));
        mList.add(new Student("Shweta", 36));
        mList.add(new Student("Payal", 37));
        mList.add(new Student("Apra", 38));


        mStudentAdapter = new SudentAdapter(mList, this);
        mRecyclerView = findViewById(R.id.list);
        mButton_remove = findViewById(R.id.remove_b);
        mButton_remove.setOnClickListener(this);
        mRecyclerView.setAdapter(mStudentAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public void onClick(View v) {
        Student student = new Student();
        student.select("name", student.getClass()).rContatins("end");

        RAUtils.remove(mList, student);
//        RAUtils.sort(mList,"name",RaUtils.ASENDING);
        mRecyclerView.getAdapter().notifyDataSetChanged();

    }
}

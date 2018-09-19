package com.iamakki.rautils.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iamakki.rautils.R;
import com.iamakki.rautils.models.Student;

import java.util.List;


/**
 * Created by gwl on 18/12/17.
 */
public class SudentAdapter extends RecyclerView.Adapter<SudentAdapter.StudentView> {
    private List<Student>  mList;
    private Context mContext;

    /**
     * Instantiates a new Sudent adapter.
     *
     * @param list    the list
     * @param context the context
     */
    public SudentAdapter(List<Student> list, Context context) {
        mList = list;
        mContext = context;
    }

    @Override
    public StudentView onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.student_adapter,null);


        return new StudentView(view);
    }

    @Override
    public void onBindViewHolder(StudentView holder, int position) {

        holder.mTextView_name.setText(mList.get(position).getName());
        holder.mTextView_age.setText(""+mList.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    /**
     * The type Student view.
     */
    public class StudentView extends RecyclerView.ViewHolder {
        private TextView mTextView_name;
        private TextView mTextView_age;

        /**
         * Instantiates a new Student view.
         *
         * @param itemView the item view
         */
        public StudentView(View itemView) {
            super(itemView);
            mTextView_name = itemView.findViewById(R.id.name_tv);
            mTextView_age  =itemView.findViewById(R.id.age_tv);
        }
    }
}

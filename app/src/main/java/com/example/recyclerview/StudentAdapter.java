package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private Context context;
    private List<Student> students;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StudentViewHolder(LayoutInflater.from(context).inflate(R.layout.row_student, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, final int position) {

        holder.setData(students.get(position));

        holder.studentRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, StudentActivity.class);
                intent.putExtra("name", students.get(position).getName());
                intent.putExtra("stdNo", students.get(position).getStdNo());
                intent.putExtra("level", students.get(position).getLevel());
                intent.putExtra("avg", students.get(position).getAvg() + "%");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTextView, stdNoTextView, levelTextView, avgTextView;
        private LinearLayout studentRow;

        StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name);
            stdNoTextView = itemView.findViewById(R.id.std_no);
            levelTextView = itemView.findViewById(R.id.level);
            avgTextView = itemView.findViewById(R.id.avg);
            studentRow = itemView.findViewById(R.id.student_row);
        }

        void setData(Student student) {
            nameTextView.setText(student.getName());
            stdNoTextView.setText(student.getStdNo());
            levelTextView.setText("level" + student.getLevel());
            avgTextView.setText("avg: " + student.getAvg() + "%");
        }
    }
}

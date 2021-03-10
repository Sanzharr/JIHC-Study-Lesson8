    package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
    TextView tv_solution1, tv_solution2, tv_solution3, tv_solution4;
    RadioButton rb_s1_answer1, rb_s1_answer2;
    RadioButton rb_s2_answer1, rb_s2_answer2;
    RadioButton rb_s3_answer1, rb_s3_answer2;
    RadioButton rb_s4_answer1, rb_s4_answer2;
    Button btn_check;

    String [] solutions = {"0", "1+1=?", "2+2=?", "4+4=?", "10+10=?"};
    String [][] variant = {
            {"0", "0"},
            {"2", "3"},
            {"6", "4"},
            {"9", "8"},
            {"20", "30"},
    };
    String [] answers = {"2", "4", "8", "20"};


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_solution1 = findViewById(R.id.tv_solution1);
        tv_solution2 = findViewById(R.id.tv_solution2);
        tv_solution3 = findViewById(R.id.tv_solution3);
        tv_solution4 = findViewById(R.id.tv_solution4);

        rb_s1_answer1 = findViewById(R.id.rb_s1_answer1);
        rb_s1_answer2 = findViewById(R.id.rb_s1_answer2);

        rb_s2_answer1 = findViewById(R.id.rb_s2_answer1);
        rb_s2_answer2 = findViewById(R.id.rb_s2_answer2);

        rb_s3_answer1 = findViewById(R.id.rb_s3_answer1);
        rb_s3_answer2 = findViewById(R.id.rb_s3_answer2);

        rb_s4_answer1 = findViewById(R.id.rb_s4_answer1);
        rb_s4_answer2 = findViewById(R.id.rb_s4_answer2);

        btn_check = findViewById(R.id.btn_check);
        suraktarJinau();

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                test(tv_solution1, rb_s1_answer1, rb_s1_answer2, 1);
                test(tv_solution2, rb_s2_answer1, rb_s2_answer2, 2);
                test(tv_solution3, rb_s3_answer1, rb_s3_answer2, 3);
                test(tv_solution4, rb_s4_answer1, rb_s4_answer2, 4);


            }
        });

    }
    public void test(TextView tv_solution, RadioButton rb1, RadioButton rb2, int index){
        if (rb1.isChecked() &&
                rb1.getText().toString().equals(answers[index])){
            tv_solution.setText(solutions[index]+"\ntrue");
            tv_solution.setTextColor(getResources().getColor(R.color.teal_200));

        }else if(rb2.isChecked() &&
                rb2.getText().toString().equals(answers[index])){
            tv_solution.setText(solutions[index]+"\ntrue");
            tv_solution.setTextColor(getResources().getColor(R.color.teal_200));

        }else{
            tv_solution.setText(solutions[index]+"\nfalse");
            tv_solution.setTextColor(getResources().getColor(R.color.purple_500));
        }
    }
    public void suraktarJinau(){
        tv_solution1.setText(solutions[0]);
        rb_s1_answer1.setText(variant[1][0]);
        rb_s1_answer2.setText(variant[1][1]);

        tv_solution2.setText(solutions[2]);
        rb_s2_answer1.setText(variant[2][0]);
        rb_s2_answer2.setText(variant[2][1]);

        tv_solution3.setText(solutions[3]);
        rb_s3_answer1.setText(variant[3][0]);
        rb_s3_answer2.setText(variant[3][1]);

        tv_solution4.setText(solutions[4]);
        rb_s4_answer1.setText(variant[4][0]);
        rb_s4_answer2.setText(variant[4][1]);
    }
}
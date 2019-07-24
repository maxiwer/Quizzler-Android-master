package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // 1 - declaring variables
    Button mTrueButton, mFalseButton;
    TextView mQuestionTextView;
    int arrayIndex;

    // Database of questions
    private TrueFalse[] mQuestionsDB = new TrueFalse[] {
            new TrueFalse(R.string.question_1, true),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, false),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
            new TrueFalse(R.string.question_13,true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 - findViewById() & 3 - casting to required type
        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);

        //Setting text to main TextView from array of questions
        mQuestionTextView.setText(mQuestionsDB[arrayIndex].getQuiestionID());

        //implementing Toast
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "True", Toast.LENGTH_SHORT).show();
                updateQuestion();
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "False", Toast.LENGTH_SHORT).show();
                updateQuestion();
            }
        });
    }

    //new unique method for updating questions after each tap
    private void updateQuestion(){
        arrayIndex = (arrayIndex + 1) % mQuestionsDB.length;
        mQuestionTextView.setText(mQuestionsDB[arrayIndex].getQuiestionID());
    }
}

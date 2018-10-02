package com.macicame.acacio.muvaqumicaapp.grade10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.macicame.acacio.muvaqumicaapp.Controller;
import com.macicame.acacio.muvaqumicaapp.R;

public class Grade10Level2Activity extends AppCompatActivity {

    Controller controller = new Controller();

    private TextView mQuestionView;  //current question to answer
    private Button mButtonChoice1; // multiple choice 1 for mQuestionView
    private Button mButtonChoice2; // multiple choice 2 for mQuestionView
    private Button mButtonChoice3; // multiple choice 3 for mQuestionView
    private Button mButtonChoice4; // multiple choice 4 for mQuestionView

    private String mAnswer;  // correct answer for question in mQuestionView
    private int mScore = 0;  // current total score
    //    Intent intent = getIntent();
//    int mScore = intent.getIntExtra("score", 0);
    private int mQuestionNumber = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10_level2);

        // setup screen for the first question with four alternative to answer
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);

        controller.grade10Level2Questions(getApplicationContext());
        updateQuestion();
    }

    private void updateQuestion(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber<controller.getLength() ){
            // set the text for new question,
            // and new 4 alternative to answer on four buttons
            mQuestionView.setText(controller.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(controller.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(controller.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(controller.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(controller.getChoice(mQuestionNumber,4));
            mAnswer = controller.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            Toast.makeText(Grade10Level2Activity.this, "Nivel 2 Completo!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Grade10Level2Activity.this, Grade10Level2ScoreActivity.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
        }
    }


    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText().equals(mAnswer)){
            mScore = mScore + 1;
            Toast.makeText(Grade10Level2Activity.this, "Opção correcta!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(Grade10Level2Activity.this, "Opss, opção Errada!", Toast.LENGTH_SHORT).show();
        // once user answer the question, we move on to the next one, if any
        updateQuestion();
    }
}

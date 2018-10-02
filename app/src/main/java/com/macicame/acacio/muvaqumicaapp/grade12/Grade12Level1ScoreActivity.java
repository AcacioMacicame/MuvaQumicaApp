package com.macicame.acacio.muvaqumicaapp.grade12;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.macicame.acacio.muvaqumicaapp.R;

public class Grade12Level1ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade12_level1_score);

        TextView txtGoodScore = (TextView)findViewById(R.id.goodScore);
        TextView txtBadScore = (TextView)findViewById(R.id.badScore);
        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);
        Button btnRepeat = (Button)findViewById(R.id.button);
        Button btnNext = (Button)findViewById(R.id.next);

        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("Sua pontuação: " + score);

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("Pontuação alta: "+highscore);
        else
        {
            txtHighScore.setText("Nova pontuação: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }

        if(score >= 2){
            txtGoodScore.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.VISIBLE);
        }
        else {
            txtBadScore.setVisibility(View.VISIBLE);
            btnRepeat.setVisibility(View.VISIBLE);
        }
    }

    public void onRepeatClick(View view) {
        Intent intent = new Intent(Grade12Level1ScoreActivity.this, Grade12Level1Activity.class);
        startActivity(intent);
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(Grade12Level1ScoreActivity.this, Grade12Level2Activity.class);
        startActivity(intent);
    }
}

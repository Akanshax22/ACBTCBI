package com.example.quizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int correctAnswers = 0;

    private TextView questionTextView;
    private RadioButton option1;
    private RadioButton option2;
    private RadioButton option3;
    private RadioButton option4;
    private RadioGroup optionsGroup;
    private Button nextButton;
    private TextView timerTextView;
    private CountDownTimer countDownTimer;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionTextView = findViewById(R.id.question_text);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        optionsGroup = findViewById(R.id.options_group);
        nextButton = findViewById(R.id.next_button);
        timerTextView = findViewById(R.id.timer_text);
        resultTextView = findViewById(R.id.result_text);  // Add a TextView in the layout for displaying the result

        String language = getIntent().getStringExtra("language");
        String difficulty = getIntent().getStringExtra("difficulty");

        questions = QuestionBank.getQuestions(language, difficulty);
        displayQuestion(currentQuestionIndex);

        nextButton.setOnClickListener(v -> {
            checkAnswer();
            if (currentQuestionIndex < questions.size() - 1) {
                currentQuestionIndex++;
                displayQuestion(currentQuestionIndex);
            } else {
                // Handle end of quiz
                displayResult();
            }
        });
    }

    private void displayQuestion(int questionIndex) {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        Question question = questions.get(questionIndex);
        questionTextView.setText(question.getQuestionText());
        option1.setText(question.getOptions()[0]);
        option2.setText(question.getOptions()[1]);
        option3.setText(question.getOptions()[2]);
        option4.setText(question.getOptions()[3]);
        optionsGroup.clearCheck();

        startTimer(question.getTimeLimit());
    }

    private void startTimer(int seconds) {
        countDownTimer = new CountDownTimer(seconds * 1000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                timerTextView.setText("Time: " + millisUntilFinished / 1000 + "s");
            }

            @Override
            public void onFinish() {
                timerTextView.setText("Time's up!");
                // Automatically move to the next question or handle as needed
                if (currentQuestionIndex < questions.size() - 1) {
                    checkAnswer();
                    currentQuestionIndex++;
                    displayQuestion(currentQuestionIndex);
                } else {
                    // Handle end of quiz
                    displayResult();
                }
            }
        }.start();
    }

    private void checkAnswer() {
        int selectedOption = optionsGroup.getCheckedRadioButtonId();
        if (selectedOption != -1) {
            RadioButton selectedRadioButton = findViewById(selectedOption);
            int answerIndex = optionsGroup.indexOfChild(selectedRadioButton);
            if (questions.get(currentQuestionIndex).getCorrectAnswerIndex() == answerIndex) {
                correctAnswers++;
            }
        }
    }

    private void displayResult() {
        Toast.makeText(this, "Quiz Completed! You scored: " + correctAnswers + "/" + questions.size(), Toast.LENGTH_LONG).show();
        resultTextView.setText("Quiz Completed! You scored: " + correctAnswers + "/" + questions.size());
        resultTextView.setTextColor(Color.GREEN);
    }
}

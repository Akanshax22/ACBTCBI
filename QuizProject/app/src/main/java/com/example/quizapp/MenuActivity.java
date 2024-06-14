package com.example.quizapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton buttonC = findViewById(R.id.imageButton);
        ImageButton buttonCpp = findViewById(R.id.imageButton2);
        ImageButton buttonJava = findViewById(R.id.imageButton3);
        ImageButton buttonPython = findViewById(R.id.imageButton4);

        buttonC.setOnClickListener(v -> showDifficultyDialog("C"));
        buttonCpp.setOnClickListener(v -> showDifficultyDialog("C++"));
        buttonJava.setOnClickListener(v -> showDifficultyDialog("Java"));
        buttonPython.setOnClickListener(v -> showDifficultyDialog("Python"));
    }

    private void showDifficultyDialog(String language) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_difficulty_level, null);
        builder.setView(dialogView);

        AlertDialog dialog = builder.create();

        dialogView.findViewById(R.id.button_easy).setOnClickListener(v -> {
            dialog.dismiss();
            startQuizActivity(language, "Easy");
        });

        dialogView.findViewById(R.id.button_medium).setOnClickListener(v -> {
            dialog.dismiss();
            startQuizActivity(language, "Medium");
        });

        dialogView.findViewById(R.id.button_hard).setOnClickListener(v -> {
            dialog.dismiss();
            startQuizActivity(language, "Hard");
        });

        dialog.show();
    }

    private void startQuizActivity(String language, String difficulty) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("language", language);
        intent.putExtra("difficulty", difficulty);
        startActivity(intent);
    }
}

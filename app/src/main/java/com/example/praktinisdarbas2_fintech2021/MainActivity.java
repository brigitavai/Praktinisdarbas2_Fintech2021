package com.example.praktinisdarbas2_fintech2021;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static com.example.praktinisdarbas2_fintech2021.utils.ElementsCalculator.getCharsCount;
import static com.example.praktinisdarbas2_fintech2021.utils.ElementsCalculator.getCharsCount2;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;
    EditText edUserInput;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvOutput = findViewById(R.id.tvOutput);

        ArrayList<String> selectionOptionsList = new ArrayList<>();
        selectionOptionsList.add(getResources().getString(R.string.CharSelection));
        selectionOptionsList.add(getResources().getString(R.string.WordSelection));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<> (this, android.R.layout.simple_spinner_item, selectionOptionsList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvOutput = findViewById(R.id.tvOutput);

        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();

        String resValue = getResources().getString(R.string.CharSelection);
        Toast.makeText(this,String.valueOf(resValue), Toast.LENGTH_SHORT).show();

        if (selection.equalsIgnoreCase(resValue)) {
            int count = getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }

        String[] userInputText2 = edUserInput.getText().toString().split(" ");
        String resValue2 = getResources().getString(R.string.WordSelection);
        Toast.makeText(this,String.valueOf(resValue2), Toast.LENGTH_SHORT).show();

        if (selection.equalsIgnoreCase(resValue2)) {
            int count2 = getCharsCount2(userInputText2);
            tvOutput.setText(String.valueOf(count2));
        }

    }


}

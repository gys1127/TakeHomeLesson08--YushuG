package com.android.geostudyguide;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView questionText;
    private Button trueButton;
    private Button falseButton;
    private Button cheatButton;
    private boolean answer;

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public TextView getQuestionText() {
        return questionText;
    }

    public void setQuestionText(TextView questionText) {
        this.questionText = questionText;
    }

    public Button getTrueButton() {
        return trueButton;
    }

    public void setTrueButton(Button trueButton) {
        this.trueButton = trueButton;
    }

    public Button getFalseButton() {
        return falseButton;
    }

    public void setFalseButton(Button falseButton) {
        this.falseButton = falseButton;
    }

    public Button getCheatButton() {
        return cheatButton;
    }

    public void setCheatButton(Button cheatButton) {
        this.cheatButton = cheatButton;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);
        questionText = (TextView) itemView.findViewById(R.id.question_text);

        trueButton = (Button) itemView.findViewById(R.id.true_button);
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getAnswerToastMessageId(true), Toast.LENGTH_SHORT).show();
            }
        });

        falseButton = (Button) itemView.findViewById(R.id.false_button);
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getAnswerToastMessageId(false), Toast.LENGTH_SHORT).show();
            }
        });

        cheatButton = (Button) itemView.findViewById(R.id.cheat_button);
        cheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "The answer is " + String.valueOf(answer), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getAnswerToastMessageId(boolean userAnswer) {
        if (userAnswer == answer) {
            return "Correct!";
        } else {
            return "Incorrect...";
        }
    }
}

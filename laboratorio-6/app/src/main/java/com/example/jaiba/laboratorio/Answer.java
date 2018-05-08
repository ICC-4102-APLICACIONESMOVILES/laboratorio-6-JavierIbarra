package com.example.jaiba.laboratorio;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by jaiba on 10-04-2018.
 */

@Entity(foreignKeys = @ForeignKey(entity = Question.class, parentColumns = "id", childColumns = "questionId", onDelete = CASCADE),tableName = "answers")
public class Answer {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "questionId")
    private int questionId;

    @ColumnInfo(name = "textAnswer")
    private  String textAnswer;

    public  Answer(){

    }

    @Ignore
    public Answer( String textAnswer,final int questionId){
        this.questionId=questionId;
        this.textAnswer=textAnswer;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
}

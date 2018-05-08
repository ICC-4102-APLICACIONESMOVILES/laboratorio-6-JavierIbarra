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
@Entity(foreignKeys = @ForeignKey (entity = Form.class, parentColumns = "id", childColumns = "formId", onDelete = CASCADE),tableName = "questions")
public class Question {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "formId")
    private int formId;

    @ColumnInfo(name = "tipo")
    private String tipo;

    @ColumnInfo(name = "textQuestion")
    private  String textQuestion;

    public Question(){
    }

    @Ignore
    public Question( final int formId, String tipo,String textQuestion){
        this.formId=formId;
        this.textQuestion=textQuestion;
        this.tipo=tipo;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) { this.textQuestion = textQuestion; }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }
}

package com.example.jaiba.laboratorio;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by jaiba on 10-04-2018.
 */
@Dao
public interface QuestionDao {
    @Query("SELECT * FROM questions")
    List<Question> getAllQuestion();

    @Query("SELECT * FROM questions WHERE formId = :formulario")
    List<Question> QuestionForm(int formulario);

    @Insert
    void insertQuestion(Question... questions);

    @Delete
    void deleteQuestion(Question question);
}

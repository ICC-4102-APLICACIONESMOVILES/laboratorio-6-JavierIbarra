package com.example.jaiba.laboratorio;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by jaiba on 08-04-2018.
 */
@Database(entities = {Form.class, Answer.class, Question.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract FormDao formDao();
    public abstract AnswerDao answerDao();
    public abstract QuestionDao questionDao();
}


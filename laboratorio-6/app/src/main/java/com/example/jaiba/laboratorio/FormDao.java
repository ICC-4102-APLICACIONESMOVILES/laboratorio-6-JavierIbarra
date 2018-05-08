package com.example.jaiba.laboratorio;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by jaiba on 08-04-2018.
 */
@Dao
public interface FormDao {

    @Query("SELECT * FROM forms")
    List<Form> getAll();

    @Insert
    void insertForm(Form... forms);

    @Delete
    void deleteForm(Form form);
}

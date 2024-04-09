package com.example.aula2an;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao

public interface FuncionarioDao {
    @Query("SELECT * FROM Funcionario")
    List<Funcionario> getFuncionario();
    @Query("SELECT * FROM Funcionario WHERE re=:reFuncionario")
    Funcionario buscarPeloRe(int reFuncionario);
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Funcionario funcionario);
     @Delete
    void delete(Funcionario funcionario);
     @Update
    void update(Funcionario funcionario);

}

package com.example.aula2an;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatabaseActivity extends AppCompatActivity {


    private EditText editTextRe;
    private EditText editTextNome;
    private EditText editTextDatadeAdm;
    private EditText editTextSalario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        editTextRe = findViewById(R.id.editTextRE);
        editTextNome = findViewById(R.id.editTextNome);
        editTextDatadeAdm = findViewById(R.id.editTextDataAdmissao);
        editTextSalario = findViewById(R.id.editTextSalario);

    }

    private void limpar(){
        editTextRe.getText().clear();
        editTextNome.getText().clear();
        editTextDatadeAdm.getText().clear();
        editTextSalario.getText().clear();
    }

    public void cadastrar(View view){
        AppDatabase db = AppDatabase.getInstance(this);
        FuncionarioDao dao = db.funcionarioDao();
        int RE = Integer.parseInt(editTextRe.getText().toString());
        String nome = editTextNome.getText().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date dataAdmissao;
        try {
            dataAdmissao = dateFormat.parse(editTextDatadeAdm.getText().toString());
        } catch (ParseException r ) {
            dataAdmissao = new Date();
        }
        double salario = Double.parseDouble(editTextSalario.getText().toString());
        Funcionario f = new Funcionario(RE, nome, dataAdmissao, salario);
        dao.insert(f);
        limpar();

    }
}
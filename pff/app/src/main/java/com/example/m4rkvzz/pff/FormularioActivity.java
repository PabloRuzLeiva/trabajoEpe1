/**
 Copyright [2017] [IPCHILE - REAL NO FAKE]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.example.m4rkvzz.pff;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    public EditText nombre,apellido,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        nombre=(EditText)findViewById(R.id.nombrex);
        apellido=(EditText)findViewById(R.id.apellidox);
        email=(EditText)findViewById(R.id.emailx);

    }

    public void cambiarVentana(View v){
        if (nombre.getText().toString().equals("")) {
            Toast.makeText(this, "Ingrese Nombre", Toast.LENGTH_SHORT).show();
        }else {
            if (apellido.getText().toString().equals("")) {
                Toast.makeText(this, "Ingrese Apellido", Toast.LENGTH_SHORT).show();
            } else {
                if (email.getText().toString().equals("")) {
                    Toast.makeText(this, "Ingrese Email", Toast.LENGTH_SHORT).show();
                } else {
                    Intent ListSong = new Intent(getApplicationContext(), MainActivity.class);
                    ListSong.putExtra("nombre", nombre.getText().toString());
                    ListSong.putExtra("apellido", apellido.getText().toString());
                    ListSong.putExtra("email", email.getText().toString());
                    startActivity(ListSong);
                }
            }
        }
    }

}

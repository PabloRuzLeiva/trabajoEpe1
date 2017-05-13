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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public EditText var_epr1,var_epe1,var_epr2,var_epe2,var_eva1,var_eva2,var_eva3,var_eva4,var_resul;
    public TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        title = (TextView)findViewById(R.id.title);
        var_epr1=(EditText)findViewById(R.id.fl_epr1);
        var_epe1=(EditText)findViewById(R.id.fl_epe1);
        var_epr2=(EditText)findViewById(R.id.fl_epr2);
        var_epe2=(EditText)findViewById(R.id.fl_epe2);
        var_eva1=(EditText)findViewById(R.id.fl_eva1);
        var_eva2=(EditText)findViewById(R.id.fl_eva2);
        var_eva3=(EditText)findViewById(R.id.fl_eva3);
        var_eva4=(EditText)findViewById(R.id.fl_eva4);
        var_resul=(EditText)findViewById(R.id.fl_prom);

        title.setText("Bienvenido "+ bundle.getString("nombre")+ " " + bundle.getString("apellido") + " Ingrese sus notas ");
    }

    public void sumar(View v){

        if(var_epr1.getText().toString().equals(""))
        {
            Toast.makeText(this, "Ingresar EPR1", Toast.LENGTH_SHORT).show();
        }
        else
            {
           if((var_epr1.getText().toString().length() == 2 && Integer.parseInt(var_epr1.getText().toString()) > 71) || (var_epr1.getText().toString().length() == 1 && Integer.parseInt(var_epr1.getText().toString()) > 7))
           {
                Toast.makeText(this, "EPR1 NO VÁLIDA", Toast.LENGTH_SHORT).show();
           }
           else
           {
                if(var_epe1.getText().toString().equals("")) {
                    Toast.makeText(this, "Ingresar EPE1", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if((var_epe1.getText().toString().length() == 2 && Integer.parseInt(var_epe1.getText().toString()) > 70) || (var_epe1.getText().toString().length() == 1 && Integer.parseInt(var_epe1.getText().toString()) > 7))
                    {
                        Toast.makeText(this, "EPE1 NO VÁLIDA", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if (var_epr2.getText().toString().equals(""))
                        {
                            Toast.makeText(this, "Ingresar EPR2", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            if ((var_epr2.getText().toString().length() == 2 && Integer.parseInt(var_epr2.getText().toString()) > 70) || (var_epr2.getText().toString().length() == 1 && Integer.parseInt(var_epr2.getText().toString()) > 7))
                            {
                                Toast.makeText(this, "EPR2 NO VÁLIDA", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                if (var_epe2.getText().toString().equals(""))
                                {
                                    Toast.makeText(this, "Ingresar EPE2", Toast.LENGTH_SHORT).show();
                                }
                                else
                                {
                                    if ((var_epe2.getText().toString().length() == 2 && Integer.parseInt(var_epe2.getText().toString()) > 70) || (var_epe2.getText().toString().length() == 1 && Integer.parseInt(var_epe2.getText().toString()) > 7))
                                    {
                                        Toast.makeText(this, "EPE2 NO VÁLIDA", Toast.LENGTH_SHORT).show();
                                    }
                                    else
                                    {
                                        if (var_eva1.getText().toString().equals(""))
                                        {
                                            Toast.makeText(this, "Ingresar EVA1", Toast.LENGTH_SHORT).show();
                                        }
                                        else
                                        {
                                            if (var_eva2.getText().toString().equals(""))
                                            {
                                                Toast.makeText(this, "Ingresar EVA2", Toast.LENGTH_SHORT).show();
                                            }
                                            else
                                            {
                                                if (var_eva3.getText().toString().equals(""))
                                                {
                                                    Toast.makeText(this, "Ingresar EVA3", Toast.LENGTH_SHORT).show();
                                                }
                                                else
                                                {
                                                    if (var_eva4.getText().toString().equals(""))
                                                    {
                                                        Toast.makeText(this, "Ingresar EVA4", Toast.LENGTH_SHORT).show();
                                                    }
                                                    else
                                                    {
                                                        int n_epr1 = Integer.parseInt(var_epr1.getText().toString());
                                                        int n_epe1 = Integer.parseInt(var_epe1.getText().toString());
                                                        int n_epr2 = Integer.parseInt(var_epr2.getText().toString());
                                                        int n_epe2 = Integer.parseInt(var_epe2.getText().toString());

                                                        int eva1 = Integer.parseInt(var_eva1.getText().toString());
                                                        int eva2 = Integer.parseInt(var_eva2.getText().toString());
                                                        int eva3 = Integer.parseInt(var_eva3.getText().toString());
                                                        int eva4 = Integer.parseInt(var_eva4.getText().toString());

                                                        double valorepr1 = ((n_epr1 * 0.10));
                                                        double valorepe1 = ((n_epe1 * 0.15));
                                                        double valorepr2 = ((n_epr2 * 0.20));
                                                        double valorepe2 = ((n_epe2 * 0.25));

                                                        double evas = ((eva1 + eva2 + eva3 + eva4) / 4) * 0.3;

                                                        double eps = valorepr1 + valorepe1 + valorepr2 + valorepe2;

                                                        double resul = (evas + eps);
                                                        String promedioNota = Double.toString(resul);

                                                        var_resul.setText(promedioNota);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void cambiarVentana(View v){
        Intent ListSong = new Intent(getApplicationContext(), FormularioActivity.class);
        startActivity(ListSong);
    }
}


















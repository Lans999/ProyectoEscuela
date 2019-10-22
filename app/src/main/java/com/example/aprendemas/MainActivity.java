package com.example.aprendemas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn_Abecedario,btn_Vocales,btn_Numeros;
    private static ImageView imgView;
    private int Current_imgage;
    private int Current_imgage2;
    int[] images={R.drawable.abecedario,R.drawable.abc_english,R.drawable.abcse};
    int[] images2={R.drawable.numeros,R.drawable.numbers,R.drawable.numerose};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Abecedario = (Button) findViewById(R.id.btn_Abecedario);
        btn_Numeros = (Button)findViewById(R.id.btn_Numeros);
        buttonclick();

    }
    public void buttonclick(){
        imgView=(ImageView)findViewById(R.id.imageView3);
        btn_Abecedario=(Button)findViewById(R.id.btn_Abecedario);
        btn_Numeros=(Button)findViewById(R.id.btn_Numeros);

        btn_Abecedario.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Current_imgage++;
                        Current_imgage=Current_imgage % images.length;
                        imgView.setImageResource(images[Current_imgage]);                    }
                }
        );
       btn_Numeros.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Current_imgage2++;
                        Current_imgage2=Current_imgage2 % images2.length;
                        imgView.setImageResource(images2[Current_imgage2]);                    }
                }
        );

    }
}

package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Display; // Display donde se muestran los resultados
    private  boolean primer_Btn = true; //saber si es la primera vez que se presionan botones
    private float num_1 = 0f, num_2 = 0f, result = 0f; // para guardar los numeros y el resultado a operar
    private char operator = ' '; //operador que vamos a usar


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_Display = findViewById(R.id.tv_Display); //id del Display
    }
    //Boton AC que va a borrar numeros y operador
    public void btn_AC(View view){
        tv_Display.setText("");
        primer_Btn = true;
        num_1 = 0;
        num_2 = 0;
        operator = ' ';
    }
    //Boton C que solo va a borrar el numero actual
    public void btn_Clear(View view){
        tv_Display.setText("0");//mostramos en display un 0
        primer_Btn = true; //cambiamos el estado, ya que no hay numero
    }
    //bton con el numero 9
    public void btn_Nueve(View view){
        if (primer_Btn){ // en caso de que display está vacio
            tv_Display.setText("9");//mostramos en display
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '9'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 8
    public void btn_Ocho(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("8");//mostramos en display
            primer_Btn = false;//cambiamos el estado, ya no está vacio
        } else {//si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '8'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 7
    public void btn_Siete(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("7");//mostramos en display
            primer_Btn = false;//cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '7'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 6
    public void btn_Seis(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("6"); //mostramos en display
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '6'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 5
    public void btn_Cinco(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("5"); //mostramos en display
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '5'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 4
    public void btn_Cuatro(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("4"); //mostramos en display
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '4'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 3
    public void btn_Tres(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("3"); //mostramos en display
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '3'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 2
    public void btn_Dos(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("2"); //mostramos en display
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '2'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 1
    public void btn_Uno(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("1"); //mostramos en display
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '1'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //bton con el numero 0
    public void btn_Cero(View view){
        if (!primer_Btn ){//solo es posible presionar el 0 si ya existen numeros antes
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '0'; //concatenando numero
            tv_Display.setText(aux); //mostramos en display
        }
    }
    //boton con el punto decimal
    public void btn_Dot(View view){
        if (primer_Btn){// en caso de que display está vacio
            tv_Display.setText("0."); //van a seguir numeros despues del punto
            primer_Btn = false; //cambiamos el estado, ya no está vacio
        } else { //si ya tiene numeros
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            aux += '.';//concatenando numeros despues del punto
            tv_Display.setText(aux);//mostramos en display
        }
    }
    //boton suma
    public void btn_Suma(View view){
        if (!primer_Btn){ //solo es valido cuando ya se tiene un numero
            String aux;
            aux = tv_Display.getText().toString(); //obtenemos los numeros en display
            num_1 = Float.parseFloat(aux); //convertimos el numero a un float
            operator = '+'; //definimos el operador
            primer_Btn = true; // cambiamos el estado para guardar el siguiente numero
        }
    }

    public void btn_Resta(View view){
        if (!primer_Btn){//solo es valido cuando ya se tiene un numero
            String aux;
            aux = tv_Display.getText().toString();  //obtenemos los numeros en display
            num_1 = Float.parseFloat(aux); //guardamso el valor en num1
            operator = '-'; //definimos el operador
            primer_Btn = true; // cambiamos el estado para guardar el siguiente numero
        }else{ // si es presionado antes de un digito, el numero va a ser negativo
            tv_Display.setText("-"); //definimos el operador
            primer_Btn = false; //el numero es negativo, asi que el signo ya cuenta
            // como que no es el primer boton
        }
    }

    public void btn_Division(View view){
        if (!primer_Btn) {//solo es valido cuando ya se tiene un numero
            String aux;
            aux = tv_Display.getText().toString();  //obtenemos los numeros en display
            num_1 = Float.parseFloat(aux); //guardamso el valor en num1
            operator = '/'; //definimos el operador
            primer_Btn = true; // cambiamos el estado para guardar el siguiente numero
        }
    }

    public void btn_Multiplicacion(View view){
        if (!primer_Btn) {//solo es valido cuando ya se tiene un numero
            String aux;
            aux = tv_Display.getText().toString();  //obtenemos los numeros en display
            num_1 = Float.parseFloat(aux); //guardamso el valor en num1
            operator = '*'; //definimos el operador
            primer_Btn = true; // cambiamos el estado para guardar el siguiente numero
        }
    }
    //boton raiz
    public void btn_Raiz(View view){
        if (primer_Btn){ //tiene que ser el primer numero, y solo uno
            tv_Display.setText("√"); //mostramos que se presiono correctamente
            operator = '√'; //definimos el operador
        }
    }

    public void btn_Igual(View view){
        if (!primer_Btn){
            String aux;
            aux = tv_Display.getText().toString();  //obtenemos el numero en display
            num_2 = Float.parseFloat(aux);
            switch (operator){
                case ' ': // si presionamos el boton igual por error, sin un operador definido
                    if (num_1 == 0){ //el valor se guarda en num2, por ello hay que hacer el cambio
                        num_1 = num_2;
                        num_2 = 0;
                        result = num_1;
                        return;
                    }
                    break;
                case '√': //hacemos la raiz del numero
                    if (num_2<0){ //no es posible raiz de numeros negativos(img)
                        tv_Display.setText("Math Error"); //mostrams error en display
                        return;
                    }else //en caso de no ser negativo entonces es posible la raiz
                        result = (float) Math.sqrt(num_2);
                    break;
                case '+': //hacemos la suma de numeros
                    result = num_1 + num_2;
                    break;
                case '-': //hacemos la resta de numeros
                    result = num_1 - num_2;
                    break;
                case '*': //hacemos la multiplicacion de numeros
                    result = num_1 * num_2;
                    break;
                case '/': //hacemos la division de numeros
                    if(num_2 == 0){ //numero 2 no puede ser 0 porque no es posible
                        tv_Display.setText("Math Error"); //mostrams error en display
                        return;
                    }
                    else //en caso de num2!=0 entonces si es posible la division
                        result = num_1 / num_2;
                    break;
            }
            int result_Int; // para comparar y no dar el resultado en .0 si no hay decimales
            result_Int = (int) result; //convertimos el resultado a int
            //comparamos si el numero se va a mostrar como un entero o con punto decimal
            if ((result -  (float) result_Int ) != 0)  //si es diferente de 0, entonces tiene decimales
                aux = String.valueOf(result); // convertimos el resultado a String
            else // si es igual a 0 entonces vamos a mostrarlo sin punto decimal
                aux = String.valueOf(result_Int); // convertimos el resultado a String

            tv_Display.setText(aux); //mostramos el valor en display

            //limpiamos valores
            result = 0f;
            num_1 = 0f;
            num_2 = 0f;
            primer_Btn = true;  // cambiamos el estado para guardar nuevos numeros
        }
    }
}
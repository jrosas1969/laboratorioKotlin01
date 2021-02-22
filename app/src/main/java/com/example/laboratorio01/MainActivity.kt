package com.example.laboratorio01


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnProcesar.setOnClickListener {
            val edad=edtEdad.text.toString()
            val edadint: Int? = edad.toInt()
            var mensajeEdad="Usted es menor de edad"
            if(edad.isEmpty()){
                this.mensaje2("Debe ingresar su edad")
                return@setOnClickListener
            }else{
                if (edadint != null) {
                    if(edadint > 17){
                        mensajeEdad="Usted es mayor de edad"
                    }
                }
            }

            tvResultado.text = "$mensajeEdad"
        }

    }
    fun Context.mensaje2(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }
}
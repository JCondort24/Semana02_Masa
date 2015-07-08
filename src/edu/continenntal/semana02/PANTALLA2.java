package edu.continenntal.semana02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PANTALLA2 extends Activity implements android.view.View.OnClickListener {

	//declaracion en java  estamos declarando
	//los objetos  q vamos a utilizar
	
	EditText txtTalla;
	EditText txtPeso;
	Button btnProcesar;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla2);
		
		//estamos asignando el valor a los objetos 
		//declaracion de objetos 
		txtTalla = (EditText)findViewById (R.id.inputTalla);
		txtPeso = (EditText)findViewById (R.id.inputPeso);
		btnProcesar = (Button )findViewById (R.id.btnproce);
		
		
		btnProcesar.setOnClickListener(this);
		//lo q hace es buscar findViewById
		
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla2, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		//agregamos un evento para elvoton
		
		//si le a echo click añll boton procesar
		if (v == btnProcesar){
			
			double talla =Double.parseDouble(txtTalla.getText().toString());
			double peso = Double.parseDouble(txtPeso.getText().toString());
			
			//calculamos elindice de masa coorporal
			//double imc = peso /  (talla*talla);
			//Math.pow es para eñlvar al cuadrado
			
			double imc = peso / (Math.pow(talla, 2));
			
			Toast.makeText(this, "el resultado es: "  + imc, 
					Toast.LENGTH_SHORT).show();
			
			
		
			if (imc < 18.5) {
			Toast.makeText(PANTALLA2.this,
			"Tu IMC es " + imc + "\n" + "Infrapeso",
			Toast.LENGTH_SHORT).show();
			} else {
			if (imc < 24.9) {
			Toast.makeText(
					PANTALLA2.this,
			"Tu IMC es " + imc + "\n"
			+ "Normal",
			Toast.LENGTH_SHORT).show();
			} else {
			if (imc < 29.9) {
			Toast.makeText(
					PANTALLA2.this,
			"Tu IMC es " + imc + "\n"
			+ "Sobrepeso",
			Toast.LENGTH_SHORT).show();

			} else {
			if (imc > 30) {
			Toast.makeText(
					PANTALLA2.this,
			"Tu IMC es " + imc + "\n"
			+ "Obeso",
			Toast.LENGTH_SHORT).show();

			}
			}
			}
			}
			}
	}
}



		
		
		

	
	

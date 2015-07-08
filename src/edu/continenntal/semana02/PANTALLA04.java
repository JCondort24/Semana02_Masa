package edu.continenntal.semana02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PANTALLA04 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla04);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla04, menu);
		return true;
	}

}

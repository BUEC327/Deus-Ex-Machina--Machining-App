package com.example.deusexmachina;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Material extends Activity {
	Button steel, aluminum, abs, hdpe;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_material);
		
		steel =(Button) findViewById(R.id.steel);
		aluminum =(Button) findViewById(R.id.aluminum);
		abs = (Button) findViewById(R.id.abs);
		hdpe = (Button) findViewById(R.id.hdpe);
		
		steel.setOnClickListener(listener);
		aluminum.setOnClickListener(listener);
		abs.setOnClickListener(listener);
		hdpe.setOnClickListener(listener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.material, menu);
		return true;
	}

	private OnClickListener listener = new OnClickListener() {
		public void onClick(View v){
			int select = v.getId(); 
			
			//set intent
			Intent intent = new Intent(getBaseContext(), Endmill.class);
			//set name depending on which button gets picked
			if (select == R.id.steel){
				//do steel calc
				MainActivity.matl = 1;
			} else if (select == R.id.aluminum){
				//DO ALUMINUM
				MainActivity.matl = 2;
			} else if (select == R.id.abs){
				//do abs
				MainActivity.matl = 3;
			} else if (select == R.id.hdpe){
				//do hdpe
				MainActivity.matl = 4;
			}
			startActivity(intent);
		}
	};
}

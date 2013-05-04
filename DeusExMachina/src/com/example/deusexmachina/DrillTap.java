package com.example.deusexmachina;

import java.util.ArrayList;
import android.widget.TextView;
import android.widget.EditText;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.Menu;	

public class DrillTap extends Activity {
	Button quarter, ten, eight, six;
	TextView text;
	
	@Override //Cutting things out up to here worked!
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drill_tap); //Cutting things to here works
		
		quarter = (Button) findViewById(R.id.quarter);//Commenting this and under out crashes. Error must be in line above.
		ten = (Button) findViewById(R.id.ten);
		eight = (Button) findViewById(R.id.eight);
		six = (Button) findViewById(R.id.six);
		
		quarter.setOnClickListener(listener);
		ten.setOnClickListener(listener);
		eight.setOnClickListener(listener);
		six.setOnClickListener(listener);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drill_tap, menu);
		return true;
	}
	
	private OnClickListener listener = new OnClickListener() {
		public void onClick(View v){
			int select = v.getId(); 
			
			text = (TextView) findViewById(R.id.drilltapval);
			//set name depending on which button gets picked
			if (select == R.id.quarter){
				 text.setText("7");
			}
			if (select == R.id.ten){
				text.setText("21");
			}
			if (select == R.id.eight){
				text.setText("29");
			}
			if (select == R.id.ten){
				text.setText("36");
			}
		}
	};
	
	
}

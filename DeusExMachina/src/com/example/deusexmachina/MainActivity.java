package com.example.deusexmachina;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static int matl;
	public static double d;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//initializes buttons
		Button fs = (Button) findViewById(R.id.feedspeed);
		Button ftd = (Button) findViewById(R.id.decimalcalc);
		Button dt = (Button) findViewById(R.id.drilltap);
		//initializes listener
		fs.setOnClickListener(listener);
		ftd.setOnClickListener(listener);
		dt.setOnClickListener(listener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//listener figures out which button got pressed and calls
	//corresponding activity
	private OnClickListener listener = new OnClickListener() {
		public void onClick(View v){
			int select = v.getId(); 
			//set name depending on which button gets picked
			if (select == R.id.feedspeed){
				  Intent intent = new Intent(getBaseContext(), Material.class);
				  startActivity(intent);
				  
			}
			if (select == R.id.decimalcalc){
				Intent intent = new Intent(getBaseContext(), FractionToDecimal.class);
				startActivity(intent);
				
			}
			if (select == R.id.drilltap){
				Intent intent = new Intent(getBaseContext(), DrillTap.class);
				startActivity(intent);
				
			}
		}
	};
	
};

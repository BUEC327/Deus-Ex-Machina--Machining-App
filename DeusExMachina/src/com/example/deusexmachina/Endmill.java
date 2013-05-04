package com.example.deusexmachina;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class Endmill extends Activity {
	
	EditText num, denom;
	Bundle extras;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_endmill);
		
		num =(EditText) findViewById(R.id.num);
		denom =(EditText) findViewById(R.id.den);
		
		//make button
		Button other = (Button) findViewById(R.id.button);
		//set listener for button
		other.setOnClickListener(buttonListener);
		
		//find textbox
		TextView text = (TextView) findViewById(R.id.fracTitle);

		//get extras (matl) from previous activity (material)
		//int extra = getIntent().getIntExtra("matl", -1);
		
		//text.setText("HIIIII");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.endmill, menu);
		return true;
	}

	private OnClickListener buttonListener = new OnClickListener() {
		public void onClick(View v){
			//int select = v.getId(); 
			
			//set variables
			int temp = Integer.parseInt(num.getText().toString());
			int temp2 = Integer.parseInt(denom.getText().toString());
			MainActivity.d = (double)temp/(double)temp2;
			
			//feed speeds
			Intent intent = new Intent(getBaseContext(), FeedSpeed.class);
			startActivity(intent);
			
		}
	};
	
}

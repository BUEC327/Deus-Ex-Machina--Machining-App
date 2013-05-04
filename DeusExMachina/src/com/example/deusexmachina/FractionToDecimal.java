package com.example.deusexmachina;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FractionToDecimal extends Activity {
	EditText num, denom;
	TextView dec;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fraction_to_decimal);
		
		num =(EditText) findViewById(R.id.num);
		denom =(EditText) findViewById(R.id.den);
		
		Button other = (Button) findViewById(R.id.button);
		
		other.setOnClickListener(buttonListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fraction_to_decimal, menu);
		return true;
	}
	
	public void setText(double x){
		//set the TextView (dec) to the number clacluated in listener
		TextView text = (TextView) findViewById(R.id.dec);
		text.setText(Double.toString(x));
	}
	
	private OnClickListener buttonListener = new OnClickListener() {
		
		public void onClick(View v){
			int select = v.getId(); 
			//set name depending on which button gets picked
			//check for invalid values
			
			String strNum = num.getText().toString();
			String strDenom = denom.getText().toString();
			if ( strNum == "" || strNum == null){
				//rien a faire
				dec.setText("Not valid");
			} else if ( (strDenom == "") || (strDenom == null) ){
				//nothing
				dec.setText("Not valid");
			} else {
				int temp = Integer.parseInt(strNum);
				int temp2 = Integer.parseInt(strDenom);
				
				if (temp2 == 0){
					//nothing to do!
					dec.setText("Not valid");
				} else {
					setText((double)temp/(double)temp2);
				}
			}
		}
	};
}

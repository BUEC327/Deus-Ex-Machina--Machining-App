package com.example.deusexmachina;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class FeedSpeed extends Activity {
	Button go;
	EditText feed, speed;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed_speed);
		
		go = (Button) findViewById(R.id.go);

		go.setOnClickListener(l);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feed_speed, menu);
		return true;
	}
	
	private OnClickListener l = new OnClickListener() {
		public void onClick(View v){
			int select = v.getId();
		
			
			//MATERIAL CODES
			//1 = steel
			//2 = al
			//3 = abs
			//4 = hdpe
			
			//DIAMETER
			//double d
			
			//set up listener
			feed =(EditText) findViewById(R.id.feedText);
			speed =(EditText) findViewById(R.id.speedText);
			
			
			
			//figure out which value is being called
			if (feed.getText().length() == 0){
				if (speed.getText().length() == 0){
					//RESET TEXT FIELD
				} else {
					//DO fEED CALC
					double x = feed( MainActivity.d, Integer.parseInt(speed.getText().toString()) );
					//rewrite hint text of feed
					feed.setHint(Double.toString(x));
					
				} 
			} else if (speed.getText().length() == 0){
				if (feed.getText().length() == 0){
					//RESET??
				} else {
					//DO FEED CALC
					double x = speed( MainActivity.d, Integer.parseInt(feed.getText().toString()) );
					//Integer y = x.intValue();
					//rewrite hint text of feed
					speed.setHint(Double.toString(x));
					
				}
			} 
		}
	};
	
	//speed
	public static double speed(double d, int sfm)//RPM
	{
				
		double rmp=(3.82*(double)sfm)/d;

		return rmp;
	}
	
	//feed
	public static double feed(double d, int rpm)//SFM
	{
				
		double sfm=(double)rpm*d/3.82;

		return sfm;
	}
	
    public void onClick(View v) {
		//clear previous field entries
		TextView text = (TextView) findViewById(R.id.feedText);
		TextView text2 = (TextView) findViewById(R.id.speedText);
		
		text.setText("");
		text2.setText("");
    } 
};

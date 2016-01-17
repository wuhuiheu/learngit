package com.example.learngit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	
	//算1+...+100中奇数的和
	private int add1To100(){
		int result = 0;
		for(int i = 1; i <= 100; i += 2){
			result += i;
		}
		return result;
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ljh", "1+..+100:" + add1To100());
        
    }
}

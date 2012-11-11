package com.example.playground;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    // Called when the user clicks the Send button
    public void sendMessage(View view){
    	// Create an intent, an intent is an object that provides runtime binding between separate components (such as two activities).
    	// 					Intent(context theContext, class whereTheIntentshouldBeDelivered)
    	// Activity is a subclass of context hence why 
    	// Intents can carry collections of various data types as key value pairs called extras
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	
    	// You can use putExtra(name, value) to 
    	intent.putExtra(EXTRA_MESSAGE, message);
    }
}
package com.example.asynctask;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Attendance extends Activity implements OnClickListener {
	
	TextView email,pass;
	EditText em,psw;
	Button st,fac;
	String st_email,st_pass,fac_email,fac_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance);
        email=(TextView)findViewById(R.id.textView_email);
        pass=(TextView)findViewById(R.id.textView_pass);
        st=(Button)findViewById(R.id.button_st);
        fac=(Button)findViewById(R.id.button_fac);
        em=(EditText)findViewById(R.id.editText_email);
        psw=(EditText)findViewById(R.id.editText_pass);
        
        st.setOnClickListener(this);
        fac.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.async_task, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button_st:
			st_email=em.getText().toString();
			st_pass=psw.getText().toString();
			Toast.makeText(this, st_email+st_pass, Toast.LENGTH_LONG).show();
			break;
		case R.id.button_fac:
			fac_email=em.getText().toString();
			fac_pass=psw.getText().toString();
			Toast.makeText(this, fac_email+fac_pass, Toast.LENGTH_LONG).show();
			break;
		}
	}
}

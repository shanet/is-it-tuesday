package com.S201.tuesday;

import java.util.Calendar;

import com.S201.tuesday.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class main extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    setLabel();
  }

  @Override
  protected void onStart() {
    super.onStart();
    setLabel();
  }

  @Override
  protected void onResume() {
    super.onResume();
    setLabel();
  }

  private void setLabel() {
    Calendar cal = Calendar.getInstance();
    TextView textView = (TextView) findViewById(R.id.label);

    if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
      textView.setText(R.string.yes);
    } else {
      textView.setText(R.string.no);
    }
  }
}
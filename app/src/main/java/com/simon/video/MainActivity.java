package com.simon.video;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.simon.video.R;

public class MainActivity extends FragmentActivity {
	private Context mContext;
	private View layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = MainActivity.this;
	}

	public void clickButton(View view) {

		Intent intent = new Intent(mContext, MediaRecorderActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
	}
}

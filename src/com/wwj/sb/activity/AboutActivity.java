package com.wwj.sb.activity;

import android.os.Bundle;

public class AboutActivity extends SettingActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.menu_about_layout);
		super.setTopTitle(getResources().getString(R.string.about_title));
	}
}

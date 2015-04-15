package nghicv.com.testanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.animationdemo.R;

public class AnimationDemo extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		Button btnAnimationView = (Button) findViewById(R.id.animationView);
		Button btnAnimationFragment = (Button) findViewById(R.id.animationFragment);
		Button btnAnimationListView = (Button) findViewById(R.id.animationListView);
		btnAnimationView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AnimationDemo.this,
						AnimationView.class);
				startActivity(intent);
			}
		});
		btnAnimationFragment.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(AnimationDemo.this,
						AnimationFragment.class);
				startActivity(intent1);
				Log.d("Dung", "learning");
			}
		});
		btnAnimationListView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AnimationDemo.this,
						AnimationListView.class);
				startActivity(intent);
			}
		});
	}
}

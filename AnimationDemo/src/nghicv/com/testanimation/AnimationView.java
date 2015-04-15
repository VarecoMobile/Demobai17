package nghicv.com.testanimation;

import nghicv.com.animation.MyAnimation;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.animationdemo.R;

public class AnimationView extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_animation_view);
		Button btnStart=(Button)findViewById(R.id.btnStart);
		final TextView tv=(TextView)findViewById(R.id.tv);
		btnStart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv.startAnimation(new MyAnimation());
			}
		});
	}
}

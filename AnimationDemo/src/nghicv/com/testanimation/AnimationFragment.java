package nghicv.com.testanimation;

import nghicv.com.fragment.MyFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.animationdemo.R;

public class AnimationFragment extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_fragment_animation);
		FrameLayout layoutContent = (FrameLayout) findViewById(R.id.content);
		Button btnStartFragmentAnimation = (Button) findViewById(R.id.btnStartFragmentAnimation);
		btnStartFragmentAnimation.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentManager fm = getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				if (fm.getFragments() != null) {
					ft.detach((Fragment) fm.getFragments().get(
							fm.getFragments().size() - 1));
				}
				MyFragment fragment = new MyFragment();
				ft.setCustomAnimations(R.anim.fragment_animation, R.id.content);
				ft.add(R.id.content, fragment);
				ft.addToBackStack("fragment");
				ft.commit();

			}
		});
	}

}

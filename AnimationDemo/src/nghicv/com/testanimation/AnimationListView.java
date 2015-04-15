package nghicv.com.testanimation;

import nghicv.com.adapter.CustomAdapter;

import com.example.animationdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AnimationListView extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_listview_animation);
		String arr[]={"Android Learning","Android Learning","Android Learning","Android Learning",
				"Android Learning","Android Learning","Android Learning","Android Learning",
				"Android Learning","Android Learning","Android Learning","Android Learning",
				"Android Learning","Android Learning","Android Learning","Android Learning",
				"Android Learning","Android Learning","Android Learning","Android Learning",
				"Android Learning","Android Learning","Android Learning","Android Learning"};
		
		ListView lvAnimation=(ListView)findViewById(R.id.lvAnimation);
		//ArrayAdapter<String> adapter=new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1,arr);
		CustomAdapter adapter=new CustomAdapter(getBaseContext(), R.layout.layout_item, arr);
		lvAnimation.setAdapter(adapter);
	}

}

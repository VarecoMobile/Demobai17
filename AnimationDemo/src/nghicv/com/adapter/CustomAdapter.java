package nghicv.com.adapter;

import com.example.animationdemo.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String>{
	private Context context;
	private int idLayout;
	private String [] list;
	public CustomAdapter(Context context, int resource, String[] objects) {
		super(context, resource, objects);
		this.context=context;
		this.idLayout=resource;
		this.list=objects;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view=convertView;
		if(view==null){
			view=LayoutInflater.from(context).inflate(R.layout.layout_item, null);
			TextView tv=(TextView)view.findViewById(R.id.tv);
			tv.setText(list[position]);
		}
		view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.alpha_translate_animation));
		return view;
	}
	
	
	
	
}

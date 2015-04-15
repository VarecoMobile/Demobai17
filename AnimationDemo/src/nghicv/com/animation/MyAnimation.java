package nghicv.com.animation;

import android.graphics.Matrix;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public class MyAnimation extends Animation{
	private float centerX; 
	private float centerY;
	private int width;
	private int height;
	@Override
	public void initialize(int width, int height, int parentWidth,
			int parentHeight) {
		// TODO Auto-generated method stub
		super.initialize(width, height, parentWidth, parentHeight);
		setDuration(2500);
		setFillAfter(true);
		setInterpolator(new LinearInterpolator());
		centerX=width/2.0f;
		centerY=height/2.0f;
		this.width=width;
		this.height=height;
	}

	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		// TODO Auto-generated method stub
		super.applyTransformation(interpolatedTime, t);
		Matrix matrix1=new Matrix();
		matrix1.setScale(interpolatedTime, interpolatedTime);
		Log.d("NghiCV", interpolatedTime+"");
		Matrix matrix2=new Matrix();
		matrix2.setTranslate(-(width)*interpolatedTime, 0);
		Matrix m=t.getMatrix();
		m.setConcat(matrix1,matrix2);
		
		
	}
	
	

}

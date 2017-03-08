package com.example.wxq.wxqutilslibrary.activity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

/**
 * 闪屏页
 * 
 * @author Kevin
 * 
 */
public class CommonSplashActivity extends BaseActivity {

	RelativeLayout rlRoot;

	@Override
	  public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_splash);

		//rlRoot = (RelativeLayout) findViewById(R.id.rl_root);

		startAnim();

		//LibUtils.doSomething();
		//rlRoot.setBackgroundResource(R.drawable.newscenter_press);
	}

	@Override
	public void widgetClick(View v) {

	}

	/**
	 * 开启动画
	 */
	private void startAnim() {

		// 动画集合
		AnimationSet set = new AnimationSet(false);

		// 旋转动画
		RotateAnimation rotate = new RotateAnimation(0, 360,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		rotate.setDuration(1000);// 动画时间
		rotate.setFillAfter(true);// 保持动画状态

		// 缩放动画
		ScaleAnimation scale = new ScaleAnimation(0, 1, 0, 1,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		scale.setDuration(1000);// 动画时间
		scale.setFillAfter(true);// 保持动画状态

		// 渐变动画
		AlphaAnimation alpha = new AlphaAnimation(0, 1);
		alpha.setDuration(2000);// 动画时间
		alpha.setFillAfter(true);// 保持动画状态

		set.addAnimation(rotate);
		set.addAnimation(scale);
		set.addAnimation(alpha);

		// 设置动画监听
		set.setAnimationListener(new AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}

			// 动画执行结束
			@Override
			public void onAnimationEnd(Animation animation) {
				jumpNextPage();
			}
		});

		rlRoot.startAnimation(set);
	}

	/**
	 * 跳转下一个页面
	 */
	private void jumpNextPage() {
		// 判断之前有没有显示过新手引导
//		boolean userGuide = PrefUtils.getBoolean(this, "is_user_guide_showed",
//				false);
//
//		if (!userGuide) {
//			// 跳转到新手引导页
//			startActivity(new Intent(CommonSplashActivity.this, GuideActivity.class));
//		} else {
//			startActivity(new Intent(CommonSplashActivity.this, MainActivity.class));
//		}

		finish();
	}

}

package com.example.viewstutorial.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomViews extends View {
    private  static final int SQUARE_SIZE = 100;
    private Rect myrectsquare;
    private Paint mypaintsquare;


    public CustomViews(Context context) {
        super(context);
        init(null);
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set){
        myrectsquare = new Rect();
        mypaintsquare = new Paint(Paint.ANTI_ALIAS_FLAG );
        mypaintsquare.setColor(Color.GREEN);

    }
    public  void swapcolor(){
        mypaintsquare.setColor(mypaintsquare.getColor()==Color.GREEN ? Color.RED:Color.GREEN);
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        myrectsquare.left=50;
        myrectsquare.top=50;
        myrectsquare.right=myrectsquare.left+SQUARE_SIZE;
        myrectsquare.bottom = myrectsquare.top+10+SQUARE_SIZE;




        canvas.drawRect(myrectsquare,mypaintsquare);
    }
}

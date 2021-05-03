package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView ;
    Button mButtonTop;
    Button mButtonBottom;
    static int mDestiniProgress=0;
    static int mTopButtonTapCount=0;
    static int mBottomButtonTapCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView=(TextView) findViewById(R.id.storyTextView);
        mButtonTop= (Button) findViewById(R.id.buttonTop);
        mButtonBottom=(Button)findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(mDestiniProgress==0 && mTopButtonTapCount==0){
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }else if(mDestiniProgress==1 && mTopButtonTapCount==1){
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }else if(mDestiniProgress==1 && mBottomButtonTapCount==1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }else /*if(mDestiniProgress==2 && mTopButtonTapCount==2 && mBottomButtonTapCount==1)*/{
                    Toast.makeText(getApplicationContext(), "Last level reached !", Toast.LENGTH_SHORT).show();
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
                mDestiniProgress++;
                mTopButtonTapCount++;
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(mDestiniProgress==0 && mBottomButtonTapCount==0){
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                }else if(mDestiniProgress==1 && mTopButtonTapCount==1){
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }else if(mDestiniProgress==1 && mTopButtonTapCount==0){
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }else /*if(mDestiniProgress==2 && mBottomButtonTapCount==2)*/{
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

                mDestiniProgress++;
                mBottomButtonTapCount++;
            }
        });

    }
//                Toast.makeText(getApplicationContext(), "Top Button tapped !", Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(),"Bottom button tapped !",Toast.LENGTH_SHORT).show();

}

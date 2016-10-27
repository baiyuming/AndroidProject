package pub.weber.bym.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox eatBox;
    private CheckBox sleepBox;
    private CheckBox codeBox;
    private TextView textView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatBox = (CheckBox) findViewById(R.id.eatId);
        sleepBox = (CheckBox) findViewById(R.id.sleepId);
        codeBox = (CheckBox) findViewById(R.id.codeId);
        textView = (TextView) findViewById(R.id.textView);

        /*CheckBoxListener checkBoxListener = new CheckBoxListener();
        eatBox.setOnClickListener(checkBoxListener);
        sleepBox.setOnClickListener(checkBoxListener);
        codeBox.setOnClickListener(checkBoxListener);
        textView.setOnClickListener(checkBoxListener);*/

        CheckBoxListener checkBoxListener = new CheckBoxListener();
        eatBox.setOnCheckedChangeListener(checkBoxListener);
        sleepBox.setOnCheckedChangeListener(checkBoxListener);
        codeBox.setOnCheckedChangeListener(checkBoxListener);
    }

    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton buttonView , boolean isChecked){
            if(buttonView.getId() == R.id.eatId){
                System.out.println("chifan");
            }else if(buttonView.getId() == R.id.sleepId){
                System.out.println("shuijiao");
            }else if(buttonView.getId() == R.id.codeId){
                System.out.println("code");
            }

            if(isChecked){
                System.out.println("checked ====");
            }else{
                System.out.println("unChecked !!!!");
            }
        }
    }


    /*class CheckBoxListener implements View.OnClickListener{
        @Override
        public void onClick(View v){

            count ++;
            textView.setText(count + "");

            //System.out.println(v.getId());

            CheckBox checkBox = (CheckBox) v;

            if(v.getId() == R.id.eatId){
                System.out.println("吃饭");
            }else if (v.getId() == R.id.sleepId){
                System.out.println("睡觉");
            }else if(v.getId() == R.id.codeId){
                System.out.println("code");
            }

            if(checkBox.isChecked()){
                System.out.println("Checked!!!!!!!!!!!!!!");
            }else {
                System.out.println("UnChecked!!!!!!!!!");
            }
        }
    }*/
}

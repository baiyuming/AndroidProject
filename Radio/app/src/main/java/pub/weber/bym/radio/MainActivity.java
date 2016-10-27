package pub.weber.bym.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton maleButton;
    private RadioButton femaleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioId);
        maleButton = (RadioButton) findViewById(R.id.maleId);
        femaleButton = (RadioButton) findViewById(R.id.femaleId);

        RadioGroupListener radioGroupListener = new RadioGroupListener();
        radioGroup.setOnCheckedChangeListener(radioGroupListener);

        // 第二种监听器
        RadioButtonListener radioButtonListener = new RadioButtonListener();
        maleButton.setOnCheckedChangeListener(radioButtonListener);
    }

    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(RadioGroup group,int checkedId){
            if (checkedId == maleButton.getId()){
                System.out.println("====男人=====");
            }else if (checkedId == femaleButton.getId()){
                System.out.println("****女人*****");
            }
        }
    }

    // 第二种监听器

    class RadioButtonListener implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton buttonView ,boolean isChecked){
            System.out.println("isChecked ++++++ ------>>>>>" + isChecked);
        }
    }

}

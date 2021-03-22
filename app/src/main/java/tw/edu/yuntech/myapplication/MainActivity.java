package tw.edu.yuntech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    CheckBox C1;
    CheckBox C2;
    CheckBox C3;
    TextView T1;
    TextView T2;
    RadioGroup RA1;
    RadioGroup RA2;
    RadioButton RB1;
    RadioButton RB2;
    RadioButton RB3;
    RadioButton RB4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C1=findViewById(R.id.C1);
        C2=findViewById(R.id.C2);
        C3=findViewById(R.id.C3);
        T1=findViewById(R.id.T1);
        T2=findViewById(R.id.T2);
        RA1=findViewById(R.id.RA1);
        RA2=findViewById(R.id.RA2);
        RB1=findViewById(R.id.RB1);
        RB2=findViewById(R.id.RB2);
        RB3=findViewById(R.id.RB3);
        RB4=findViewById(R.id.RB4);

        RA1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (RB1.isChecked()){
                    T2.setText("蘋果果汁");
                    RA2.clearCheck();
                }
                if (RB2.isChecked()){
                    T2.setText("ＬＥＭＯＮ果汁");
                    RA2.clearCheck();
                }
            }
        });
        RA2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String S1=T2.getText().toString();
                if (RB3.isChecked()){
                    T2.setText(S1+"+milk");
                }
                if (RB4.isChecked()){
                    T2.setText(S1+"+ice");
                }

            }
        });

        C1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str;
                if (C1.isChecked()){
                    str="荔枝鮮果汁";
                    T1.setText(str + " milk");
                }
            }
        });
        C2.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str;
                if (C2.isChecked()){
                    str="荔枝鮮果汁";
                    T1.setText(str + " ice");
                }
            }
        });
        C3.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str;
                if (C3.isChecked()){
                    str="荔枝鮮果汁";
                    T1.setText(str + " water");
                }
            }
        });
        String str;
        str="荔枝鮮果汁";
        if(C1.isChecked()){
            T1.setText(str + " milk");
        }
        if(C2.isChecked()){
            T1.setText(str + " ice");
        }
        if(C3.isChecked()){
            T1.setText(str + " water");
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }
}
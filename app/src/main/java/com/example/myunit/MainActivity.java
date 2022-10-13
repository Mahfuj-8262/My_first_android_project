package com.example.myunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spMain,spFrom, spTo;
    EditText input,output;

    int pos0, pos1, pos2;

    ArrayAdapter<CharSequence> adp1;
    ArrayAdapter<CharSequence> adp2;
    ArrayAdapter<CharSequence> adp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        spMain= (Spinner) findViewById(R.id.DD);
        spFrom= (Spinner) findViewById(R.id.DDfrom);
        spTo= (Spinner) findViewById(R.id.DDto);
        input= (EditText) findViewById(R.id.input);
        output= (EditText) findViewById(R.id.output);

        adp1 = ArrayAdapter.createFromResource(this,R.array.DDmain, android.R.layout.simple_spinner_item);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMain.setAdapter(adp1);

        adp2 = ArrayAdapter.createFromResource(this,R.array.DDfromLength, android.R.layout.simple_spinner_item);
        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFrom.setAdapter(adp2);

        adp3 = ArrayAdapter.createFromResource(this,R.array.DDtoLenth, android.R.layout.simple_spinner_item);
        adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTo.setAdapter(adp3);

        output.setKeyListener(null);


        spMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                pos0=i;
                String mainItem = spMain.getSelectedItem().toString();
                setFromDD(mainItem);
                setToDD(mainItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(pos0!=2) {
                    String vals = input.getText().toString();
                    Double val=0.0,res;
                    if(!TextUtils.isEmpty(vals)) {
                        val = Double.parseDouble(vals);
                    }
                    else {
                        val = 0.0;
                    }
                    res = val * changeOutput(pos0,pos1,pos2);
                    output.setText(""+res);
                }
                else {
                    if(pos1!=pos2) {
                        if(pos1==0) {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==1) {
                                res = val + 273.0;
                            }
                            else if(pos2==2) {
                                res = val*9.0/5.0+32.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                        else if(pos1==1) {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==0) {
                                res = val - 273.0;
                            }
                            else if(pos2==2) {
                                res = (val - 273.0)*9.0/5.0+32.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                        else {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==0) {
                                res = (val-32)*5.0/9.0;
                            }
                            else if(pos2==1){
                                res = (val - 32)*5.0/9.0+273.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                    }
                    else {
                        String vals = input.getText().toString();
                        Double val=0.0,res;
                        if(!TextUtils.isEmpty(vals)) {
                            val = Double.parseDouble(vals);
                        }
                        else {
                            val = 0.0;
                        }
                        res=val;
                        output.setText(""+res);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        spFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                pos1 = i;

                if(pos0!=2) {
                    String vals = input.getText().toString();
                    Double val=0.0,res;
                    if(!TextUtils.isEmpty(vals)) {
                        val = Double.parseDouble(vals);
                    }
                    else {
                        val = 0.0;
                    }
                    res = val * changeOutput(pos0,pos1,pos2);
                    output.setText(""+res);
                }
                else {
                    if(pos1!=pos2) {
                        if(pos1==0) {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==1) {
                                res = val + 273.0;
                            }
                            else if(pos2==2) {
                                res = val*9.0/5.0+32.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                        else if(pos1==1) {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==0) {
                                res = val - 273.0;
                            }
                            else if(pos2==2) {
                                res = (val - 273.0)*9.0/5.0+32.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                        else {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==0) {
                                res = (val-32)*5.0/9.0;
                            }
                            else if(pos2==1){
                                res = (val - 32)*5.0/9.0+273.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                    }
                    else {
                        String vals = input.getText().toString();
                        Double val=0.0,res;
                        if(!TextUtils.isEmpty(vals)) {
                            val = Double.parseDouble(vals);
                        }
                        else {
                            val = 0.0;
                        }
                        res=val;
                        output.setText(""+res);
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                pos2 = i;

                if(pos0!=2) {
                    String vals = input.getText().toString();
                    Double val=0.0,res;
                    if(!TextUtils.isEmpty(vals)) {
                        val = Double.parseDouble(vals);
                    }
                    else {
                        val = 0.0;
                    }
                    res = val * changeOutput(pos0,pos1,pos2);
                    output.setText(""+res);
                }
                else {
                    if(pos1!=pos2) {
                        if(pos1==0) {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==1) {
                                res = val + 273.0;
                            }
                            else if(pos2==2) {
                                res = val*9.0/5.0+32.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                        else if(pos1==1) {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==0) {
                                res = val - 273.0;
                            }
                            else if(pos2==2) {
                                res = (val - 273.0)*9.0/5.0+32.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                        else {
                            String vals = input.getText().toString();
                            Double val=0.0,res;
                            if(!TextUtils.isEmpty(vals)) {
                                val = Double.parseDouble(vals);
                            }
                            else {
                                val = 0.0;
                            }

                            if(pos2==0) {
                                res = (val-32)*5.0/9.0;
                            }
                            else if(pos2==1){
                                res = (val - 32)*5.0/9.0+273.0;
                            }
                            else {
                                res=val;
                            }
                            output.setText(""+res);
                        }
                    }
                    else {
                        String vals = input.getText().toString();
                        Double val=0.0,res;
                        if(!TextUtils.isEmpty(vals)) {
                            val = Double.parseDouble(vals);
                        }
                        else {
                            val = 0.0;
                        }
                        res=val;
                        output.setText(""+res);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void setFromDD(String s){
        if(s.equals("Length")) {
            adp2 = ArrayAdapter.createFromResource(this,R.array.DDfromLength, android.R.layout.simple_spinner_item);
            adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spFrom.setAdapter(adp2);
        }
        else if(s.equals("Weight")) {
            adp2 = ArrayAdapter.createFromResource(this,R.array.DDfromWeight, android.R.layout.simple_spinner_item);
            adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spFrom.setAdapter(adp2);
        }
        else if(s.equals("Temperature")) {
            adp2 = ArrayAdapter.createFromResource(this,R.array.DDfromTemp, android.R.layout.simple_spinner_item);
            adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spFrom.setAdapter(adp2);
        }
        else if(s.equals("Time")) {
            adp2 = ArrayAdapter.createFromResource(this,R.array.DDfromTime, android.R.layout.simple_spinner_item);
            adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spFrom.setAdapter(adp2);
        }
    }
    private void setToDD(String s){
        if(s.equals("Length")) {
            adp3 = ArrayAdapter.createFromResource(this,R.array.DDtoLenth, android.R.layout.simple_spinner_item);
            adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spTo.setAdapter(adp3);
        }
        else if(s.equals("Weight")) {
            adp3 = ArrayAdapter.createFromResource(this,R.array.DDtoWeight, android.R.layout.simple_spinner_item);
            adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spTo.setAdapter(adp3);
        }
        else if(s.equals("Temperature")) {
            adp3 = ArrayAdapter.createFromResource(this,R.array.DDtoTemp, android.R.layout.simple_spinner_item);
            adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spTo.setAdapter(adp3);
        }
        else if(s.equals("Time")) {
            adp3 = ArrayAdapter.createFromResource(this,R.array.DDtoTime, android.R.layout.simple_spinner_item);
            adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spTo.setAdapter(adp3);
        }
    }

    Double changeOutput(int m,int n, int o) {

        Double[][] list0 = new Double[11][11];
        Double[][] list1 = new Double[10][10];
        Double[][] list2 = new Double[11][11];

        list0[0][0]= 1.0;
        list0[0][1]= 0.01;
        list0[0][2]= 100.0;
        list0[0][3]= 1000.0;
        list0[0][4]= 1000000.0;
        list0[0][5]= 1000000000.0;
        list0[0][6]= 0.0006213689;
        list0[0][7]= 1.0936132983;
        list0[0][8]= 3.280839895;
        list0[0][9]= 39.37007874;
        list0[0][10]= 1.057008707E-16;

        list0[1][0]= 1000.0;
        list0[1][1]= 1.0;
        list0[1][2]= 100000.0;
        list0[1][3]= 1000000.0;
        list0[1][4]= 1000000000.0;
        list0[1][5]= 1000000000000.0;
        list0[1][6]= 0.6213688756;
        list0[1][7]= 1093.6132983;
        list0[1][8]= 3280.839895;
        list0[1][9]= 39370.07874;
        list0[1][10]= 1.057008707E-13;

        list0[2][0]= 0.01;
        list0[2][1]= 0.00001;
        list0[2][2]= 1.0;
        list0[2][3]= 10.0;
        list0[2][4]= 10000.0;
        list0[2][5]= 10000000.0;
        list0[2][6]= 0.0000062137;
        list0[2][7]= 0.010936133;
        list0[2][8]= 0.032808399;
        list0[2][9]= 0.3937007874;
        list0[2][10]= 1.057008707E-18;

        list0[3][0]= 0.001;
        list0[3][1]= 0.000001;
        list0[3][2]= 0.1;
        list0[3][3]= 1.0;
        list0[3][4]= 1000.0;
        list0[3][5]= 1000000.0;
        list0[3][6]= 6.213688756E-7;
        list0[3][7]= 0.0010936133;
        list0[3][8]= 0.0032808399;
        list0[3][9]= 0.0393700787;
        list0[3][10]= 1.057008707E-19;

        list0[4][0]= 0.000001;
        list0[4][1]= 9.999999999E-10;
        list0[4][2]= 0.0001;
        list0[4][3]= 0.001;
        list0[4][4]= 1.0;
        list0[4][5]= 1000.0;
        list0[4][6]= 6.213688756E-10;
        list0[4][7]= 0.0000010936;
        list0[4][8]= 0.0000032808;
        list0[4][9]= 0.0000393701;
        list0[4][10]= 1.057008707E-22;

        list0[5][0]= 1.E-9;
        list0[5][1]= 1.E-12;
        list0[5][2]= 1.E-7;
        list0[5][3]= 0.000001;
        list0[5][4]= 0.001;
        list0[5][5]= 1.0;
        list0[5][6]= 6.213688756E-13;
        list0[5][7]= 1.093613298E-9;
        list0[5][8]= 3.280839895E-9;
        list0[5][9]= 3.937007874E-8;
        list0[5][10]= 1.057008707E-25;

        list0[6][0]= 1609.35;
        list0[6][1]= 1.60935;
        list0[6][2]= 160935.0;
        list0[6][3]= 1609350.0;
        list0[6][4]= 1609350000.0;
        list0[6][5]= 1609350000000.0;
        list0[6][6]= 1.0;
        list0[6][7]= 1760.0065617;
        list0[6][8]= 5280.019685;
        list0[6][9]= 63360.23622;
        list0[6][10]= 1.701096963E-13;

        list0[7][0]= 0.9144;
        list0[7][1]= 0.0009144;
        list0[7][2]= 91.44;
        list0[7][3]= 914.4;
        list0[7][4]= 914400.0;
        list0[7][5]= 914400000.0;
        list0[7][6]= 0.0005681797;
        list0[7][7]= 1.0;
        list0[7][8]= 3.0;
        list0[7][9]= 36.0;
        list0[7][10]= 9.665287622E-17;

        list0[8][0]= 0.3048;
        list0[8][1]= 0.0003048;
        list0[8][2]= 30.48;
        list0[8][3]= 304.8;
        list0[8][4]= 304800.0;
        list0[8][5]= 304800000.0;
        list0[8][6]= 0.0001893932;
        list0[8][7]= 0.3333333333;
        list0[8][8]= 1.0;
        list0[8][9]= 12.0;
        list0[8][10]= 3.22176254E-17;

        list0[9][0]= 0.0254;
        list0[9][1]= 0.0000254;
        list0[9][2]= 2.54;
        list0[9][3]= 25.4;
        list0[9][4]= 25400.0;
        list0[9][5]= 25400000.0;
        list0[9][6]= 0.0000157828;
        list0[9][7]= 0.0277777778;
        list0[9][8]= 0.0833333333;
        list0[9][9]= 1.0;
        list0[9][10]= 2.684802117E-18;

        list0[10][0]= 9460660000000000.0;
        list0[10][1]= 9460660000000.0;
        list0[10][2]= 946066000000000000.0;
        list0[10][3]= 9460660000000000000.0;
        list0[10][4]= 9.46066E+21;
        list0[10][5]= 9.460659999E+24;
        list0[10][6]= 5878559666946.0;
        list0[10][7]= 10346303587051618.0;
        list0[10][8]= 31038910761154856.0;
        list0[10][9]= 372466929133858300.0;
        list0[10][10]= 1.0;

        /////////////////////////

        list1[0][0]=1.0;
        list1[0][1]=1000.0;
        list1[0][2]=1000000.0;
        list1[0][3]=0.001;
        list1[0][4]=0.0009842073;
        list1[0][5]=0.0011023122;
        list1[0][6]=2.2046244202;
        list1[0][7]=35.273990723;
        list1[0][8]=5000.0;
        list1[0][9]=6.022136652E+26;

        list1[1][0]=0.001;
        list1[1][1]=1.0;
        list1[1][2]=1000.0;
        list1[1][3]=0.000001;
        list1[1][4]=9.842073304E-7;
        list1[1][5]=0.0000011023;
        list1[1][6]=0.0022046244;
        list1[1][7]=0.0352739907;
        list1[1][8]=5.0;
        list1[1][9]=6.022136652E+23;

        list1[2][0]=0.000001;
        list1[2][1]=0.000001;
        list1[2][2]=1.0;
        list1[2][3]=9.999999999E-10;
        list1[2][4]=9.842073304E-10;
        list1[2][5]=1.10231221E-9;
        list1[2][6]=0.0000022046;
        list1[2][7]=0.000035274;
        list1[2][8]=0.005;
        list1[2][9]=602213665200000000000.0;

        list1[3][0]=1000.0;
        list1[3][1]=1000000.0;
        list1[3][2]=1000000000.0;
        list1[3][3]=1.0;
        list1[3][4]=0.9842073304;
        list1[3][5]=1.1023122101;
        list1[3][6]=2204.6244202;
        list1[3][7]=35273.990723;
        list1[3][8]=5000000.0;
        list1[3][9]=6.022136652E+29;

        list1[4][0]=1016.04608;
        list1[4][1]=1016046.08;
        list1[4][2]=1016046080.0;
        list1[4][3]=1.01604608;
        list1[4][4]=1.0;
        list1[4][5]=1.12;
        list1[4][6]=2240.0;
        list1[4][7]=35840.0;
        list1[4][8]=5080230.4;
        list1[4][9]=6.118768338E+29;

        list1[5][0]=907.184;
        list1[5][1]=907184.0;
        list1[5][2]=907184000.0;
        list1[5][3]=0.907184;
        list1[5][4]=0.8928571429;
        list1[5][5]=1.0;
        list1[5][6]=2000.0;
        list1[5][7]=32000.0;
        list1[5][8]=4535920.0;
        list1[5][9]=5.463186016E+29;

        list1[6][0]=0.453592;
        list1[6][1]=453.592;
        list1[6][2]=453592.0;
        list1[6][3]=0.000453592;
        list1[6][4]=0.0004464286;
        list1[6][5]=0.0005;
        list1[6][6]=1.0;
        list1[6][7]=16.0;
        list1[6][8]=2267.96;
        list1[6][9]=2.731593008E+26;

        list1[7][0]=0.0283495;
        list1[7][1]=28.3495;
        list1[7][2]=28349.5;
        list1[7][3]=0.0000283495;
        list1[7][4]=0.0000279018;
        list1[7][5]=0.00003125;
        list1[7][6]=0.0625;
        list1[7][7]=1.0;
        list1[7][8]=141.7475;
        list1[7][9]=1.70724563E+25;

        list1[8][0]=0.0002;
        list1[8][1]=0.2;
        list1[8][2]=200.0;
        list1[8][3]=2.E-7;
        list1[8][4]=1.96841466E-7;
        list1[8][5]=2.20462442E-7;
        list1[8][6]=0.0004409249;
        list1[8][7]=0.0070547981;
        list1[8][8]=1.0;
        list1[8][9]=1.20442733E+23;

        list1[9][0]=1.660540199E-27;
        list1[9][1]=1.660540199E-24;
        list1[9][2]=1.660540199E-21;
        list1[9][3]=1.660540199E-30;
        list1[9][4]=1.634315837E-30;
        list1[9][5]=1.830433737E-30;
        list1[9][6]=3.660867475E-27;
        list1[9][7]=5.85738796E-26;
        list1[9][8]=8.302700999E-24;
        list1[9][9]=1.0;

        ///////////////

        list2[0][0]=1.0;
        list2[0][1]=1000.0;
        list2[0][2]=1000000.0;
        list2[0][3]=1000000000.0;
        list2[0][4]=1000000000000.0;
        list2[0][5]=0.0166666667;
        list2[0][6]=0.0002777778;
        list2[0][7]=0.0000115741;
        list2[0][8]=0.0000016534;
        list2[0][9]=3.802570537E-7;
        list2[0][10]=3.168808781E-8;

        list2[1][0]=0.001;
        list2[1][1]=1.0;
        list2[1][2]=1000.0;
        list2[1][3]=1000000.0;
        list2[1][4]=1000000000.0;
        list2[1][5]=0.0000166667;
        list2[1][6]=2.777777777E-7;
        list2[1][7]=1.157407407E-8;
        list2[1][8]=1.653439153E-9;
        list2[1][9]=3.802570537E-10;
        list2[1][10]=3.168808781E-11;

        list2[2][0]=0.000001;
        list2[2][1]=0.001;
        list2[2][2]=1.0;
        list2[2][3]=1000.0;
        list2[2][4]=1000000.0;
        list2[2][5]=1.666666666E-8;
        list2[2][6]=2.777777777E-10;
        list2[2][7]=1.157407407E-11;
        list2[2][8]=1.653439153E-12;
        list2[2][9]=3.802570537E-13;
        list2[2][10]=3.168808781E-14;

        list2[3][0]=1.E-9;
        list2[3][1]=0.000001;
        list2[3][2]=0.001;
        list2[3][3]=1.0;
        list2[3][4]=1000.0;
        list2[3][5]=1.666666666E-11;
        list2[3][6]=2.777777777E-13;
        list2[3][7]=1.157407407E-14;
        list2[3][8]=1.653439153E-15;
        list2[3][9]=3.802570537E-16;
        list2[3][10]=3.168808781E-17;

        list2[4][0]=1.E-12;
        list2[4][1]=1.E-9;
        list2[4][2]=0.000001;
        list2[4][3]=0.001;
        list2[4][4]=1.0;
        list2[4][5]=1.666666666E-14;
        list2[4][6]=2.777777777E-16;
        list2[4][7]=1.157407407E-17;
        list2[4][8]=1.653439153E-18;
        list2[4][9]=3.802570537E-19;
        list2[4][10]=3.168808781E-20;


        list2[5][0]=60.0;
        list2[5][1]=60000.0;
        list2[5][2]=60000000.0;
        list2[5][3]=60000000000.0;
        list2[5][4]=60000000000000.0;
        list2[5][5]=1.0;
        list2[5][6]=0.0166666667;
        list2[5][7]=0.0006944444;
        list2[5][8]=0.0000992063;
        list2[5][9]=0.0000228154;
        list2[5][10]=0.0000019013;


        list2[6][0]=3600.0;
        list2[6][1]=3600000.0;
        list2[6][2]=3600000000.0;
        list2[6][3]=3600000000000.0;
        list2[6][4]=3600000000000000.0;
        list2[6][5]=60.0;
        list2[6][6]=1.0;
        list2[6][7]=0.0416666667;
        list2[6][8]=0.005952381;
        list2[6][9]=0.0013689254;
        list2[6][10]=0.0001140771;


        list2[7][0]=86400.0;
        list2[7][1]=86400000.0;
        list2[7][2]=86400000000.0;
        list2[7][3]=86400000000000.0;
        list2[7][4]=86400000000000000.0;
        list2[7][5]=1440.0;
        list2[7][6]=24.0;
        list2[7][7]=1.0;
        list2[7][8]=0.1428571429;
        list2[7][9]=0.0328542094;
        list2[7][10]=0.0027378508;


        list2[8][0]=604800.0;
        list2[8][1]=604800000.0;
        list2[8][2]=604800000000.0;
        list2[8][3]=604800000000000.0;
        list2[8][4]=604800000000000000.0;
        list2[8][5]=10080.0;
        list2[8][6]=168.0;
        list2[8][7]=7.0;
        list2[8][8]=1.0;
        list2[8][9]=0.2299794661;
        list2[8][10]=0.0191649555;


        list2[9][0]=2629800.0;
        list2[9][1]=2629800000.0;
        list2[9][2]=2629800000000.0;
        list2[9][3]=2629800000000000.0;
        list2[9][4]=2629800000000000000.0;
        list2[9][5]=43830.0;
        list2[9][6]=730.5;
        list2[9][7]=30.4375;
        list2[9][8]=4.3482142857;
        list2[9][9]=1.0;
        list2[9][10]=0.0833333333;


        list2[10][0]=31557600.0;
        list2[10][1]=31557600000.0;
        list2[10][2]=31557600000000.0;
        list2[10][3]=31557600000000000.0;
        list2[10][4]=31557600000000000000.0;
        list2[10][5]=525960.0;
        list2[10][6]=8766.0;
        list2[10][7]=365.25;
        list2[10][8]=52.178571429;
        list2[10][9]=12.0;
        list2[10][10]=1.0;


        if(m==0)
            return list0[n][o];
        else if(pos0==1)
            return list1[n][o];
        else if(m==3)
            return list2[n][o];
        else
            return 0.0;
    }
}
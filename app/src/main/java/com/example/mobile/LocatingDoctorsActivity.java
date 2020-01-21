package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.opengl.Visibility;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.api.ApiDao;
import com.fasterxml.jackson.core.type.TypeReference;
//import com.model.Days;
import entities.model.Days;
import entities.model.Doctor;
import entities.model.User;

import java.util.List;

public class LocatingDoctorsActivity extends AppCompatActivity {

    public Button OK,openSearch,close, search;;
    public ImageButton IB;
    public String cityDB,SpecialtyDB,nameDB, areaDB,languagesDB,dayDB,genderDB,timeDB;
    public LinearLayout upLinear1;
    public String selectLanguages,selectName,selectTreatment,selectCity,selectArea,selectGender;
    public String selectSUN,selectMON,selectTUS,selectWEDNES,selectTHURS;
    public String[] languages = new String[]{"English", "hebrew", "Spanish"};
    public String[] names = new String[]{"nomi", "chaya", "Libi"};
    public String[] treatments = new String[]{"Eyes", "Children", "Ortoped"};
    public String[] cites = new String[]{"Jerusalem", "Beitar", "Tel aviv"};
    public String[] Areas = new String[]{"Central Israel", "Jerusalem and the surrounding area", "north", "South"};
    public Spinner SLanguages,STreatment,SCites,SNames,SAreas;
    Context context=this;
    String gender,day;
    public int IdDB;

    String getGenderMale(boolean checked){
      if(checked==true)
          gender="male";
      else
          gender="female";
        return gender;
    }
    String getSunDay(boolean checked){
        if(checked)
            day="Sunday";
        return day;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locating_doctors);
        upLinear1 = findViewById(R.id.upLinear);
        upLinear1.setVisibility(View.INVISIBLE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        SNames = (Spinner) findViewById(R.id.name);
        SNames.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub
                selectName = names[position];//saving the value selected

                    System.out.println(selectName);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
        ArrayAdapter<String> adapterNames= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, names);
        SNames.setAdapter(adapterNames);
        STreatment = (Spinner) findViewById(R.id.treatment);
        STreatment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub
                selectTreatment = treatments[position];//saving the value selected

                System.out.println(selectTreatment);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
        ArrayAdapter<String> adapterTreatments = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, treatments);
        STreatment.setAdapter(adapterTreatments);
        SCites = (Spinner) findViewById(R.id.city);
        SCites.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub
                selectCity = cites[position];//saving the value selected

                System.out.println(selectCity);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
        ArrayAdapter<String> adapterCites = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cites);
        SCites.setAdapter(adapterCites);
        SAreas = (Spinner) findViewById(R.id.Area);
        SAreas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub
                selectArea = Areas[position];//saving the value selected

                System.out.println(selectArea);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        ArrayAdapter<String> adapterAreas= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Areas);
        SAreas.setAdapter(adapterAreas);

        SLanguages = (Spinner) findViewById(R.id.Languages);
        SLanguages.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub
                selectLanguages = languages[position];//saving the value selected

                System.out.println(selectLanguages);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        //setting array adaptors to spinners
        //ArrayAdapter is a BaseAdapter that is backed by an array of arbitrary objects
        ArrayAdapter<String> adapterLanguages= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, languages);
        SLanguages.setAdapter(adapterLanguages);


        openSearch = (Button) findViewById(R.id.openSearch);
        openSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                upLinear1.setVisibility(View.VISIBLE);
                openSearch.setVisibility(View.INVISIBLE);
                close.setVisibility(View.VISIBLE);

            }
        });
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingDoctorsActivity.this, LocatingServicesActivity.class);
                startActivity(intent);
            }
        });

        CheckBox male = (CheckBox) findViewById(R.id.male);
        selectGender = getGenderMale(male.isChecked());
//        CheckBox female = (CheckBox) findViewById(R.id.female);
//        selectGender = getGenderMale(!(male.isChecked()));
        CheckBox SUN = (CheckBox) findViewById(R.id.SUN);
        selectSUN = getSunDay(SUN.isChecked());
        CheckBox MON = (CheckBox) findViewById(R.id.MON);
        selectMON = getSunDay(MON.isChecked());
        CheckBox TUS = (CheckBox) findViewById(R.id.TUS);
        selectTUS = getSunDay(TUS.isChecked());
        CheckBox WEDNES = (CheckBox) findViewById(R.id.WEDNES);
        selectWEDNES = getSunDay(WEDNES.isChecked());
        CheckBox THURS = (CheckBox) findViewById(R.id.THURS);
        selectTHURS = getSunDay(THURS.isChecked());



        search = (Button) findViewById(R.id.search);
                search.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ApiDao.launch("doctor", new TypeReference<List<Doctor>>() {

                        }, new ApiDao.ToDo() {

                            @Override
                            public void doSome(Object in) {
                                List<Doctor> doctors = (List<Doctor>) in;
                                for (final Doctor doctor : doctors) {
                                    nameDB = doctor.getName();
                                    cityDB = doctor.getCity();
                                    areaDB = doctor.getAddress();
                                    SpecialtyDB = doctor.getField_treatment();
                                    languagesDB = doctor.getLanguage();
                                    dayDB = doctor.getReception_days();
                                    genderDB = doctor.getGender();
                                    timeDB =doctor.getActivity_time();
                                    IdDB = doctor.getId();
//                                    ApiDao.launch("days", new TypeReference<List<Days>>() {
//
//                                    }, new ApiDao.ToDo() {
//
//                                        @Override
//                                        public void doSome(Object in) {
//                                            List<Days> days = (List<Days>) in;
//                                            for (Days day : days) {
//                                                if(day.getDoctorId()== doctor.getId())
//                                            }
//                                        }
//                                    }, context);
                                if (nameDB!=null||cityDB!=null||areaDB!=null||SpecialtyDB!=null||languagesDB!=null||dayDB!=null||genderDB!=null||timeDB!=null) {
                                    if (selectName.contains(nameDB) || selectArea.contains(areaDB) ||
                                            selectCity.contains(cityDB) || selectTreatment.contains(SpecialtyDB) ||
                                            selectLanguages.contains(languagesDB)||selectGender.contains(genderDB)) {
                                        System.out.println("find");
                                        System.out.println(SpecialtyDB);
                                        System.out.println(cityDB);
                                        System.out.println(nameDB);


//                                        doctorName2 = doctor.getName();
//                                        TextView doctorName = (TextView) findViewById(R.id.doctorName);
//                                        doctorName.setText(doctorName2);

                                    } else {
                                        System.out.println("not find");

                                    }
                                }
                       else {
                           System.out.println("some is null");
                                }
                                }
                            }
                        }, context);

                    }
                });


        close  = (Button) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                upLinear1.setVisibility(View.INVISIBLE);
                openSearch.setVisibility(View.VISIBLE);
            }
        });

    }
}

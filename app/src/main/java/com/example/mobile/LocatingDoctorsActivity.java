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

    public Button OK,openSearch,close, search,bSearch;;
    public ImageButton IB;
    public String cityDB,SpecialtyDB,nameDB, areaDB,languagesDB,dayDB,genderDB,timeDB,searchDoctors2,city,Specialty;
    public LinearLayout upLinear1;
    public String selectLanguages,selectName,selectTreatment,selectCity,selectArea,selectGender;
    public String selectSUN,selectMON,selectTUS,selectWEDNES,selectTHURS;
    public String[] languages = new String[]{"English", "hebrew", "Spanish"};
    public String[] names = new String[]{"nomi", "chaya", "Libi"};
    public String[] treatments = new String[]{"Eyes", "Children", "Ortoped"};
    public String[] cites = new String[]{"Jerusalem", "Beitar", "Tel aviv"};
    public String[] Areas = new String[]{"Central Israel", "Jerusalem and the surrounding area", "north", "South"};
    public Spinner SLanguages,STreatment,SCites,SNames,SAreas;
    public String [] days = new String[]{};
    public EditText searchDoctors;
    Context context=this;
    String gender,day;
    String [] arraySearchDoctors2 = new String [5];
    String pic = ",";
    public int IdDB;
    String getGenderMale(boolean checked){
      if(checked==true)
          gender="male";
      else
          gender="female";
        return gender;
    }
    String getSunday(boolean checked){
        if(checked)
            day="Sunday";
        else {
            day="";
        }
        return day;
    }
    String getMonday(boolean checked){
        if(checked)
            day="Monday";
        else {
            day="";
        }
        return day;
    }
    String getTuesday(boolean checked){
        if(checked)
            day="Tuesday";
        else {
            day="";
        }
        return day;
    }
    String getWednesday(boolean checked){
        if(checked)
            day="Wednesday";
        else {
            day="";
        }
        return day;
    }
    String getThursday(boolean checked){
        if(checked)
            day="Thursday";
        else {
            day="";
        }
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
        selectSUN = getSunday(SUN.isChecked());
        CheckBox MON = (CheckBox) findViewById(R.id.MON);
        selectMON = getMonday(MON.isChecked());
        CheckBox TUS = (CheckBox) findViewById(R.id.TUS);
        selectTUS = getTuesday(TUS.isChecked());
        CheckBox WEDNES = (CheckBox) findViewById(R.id.WEDNES);
        selectWEDNES = getWednesday(WEDNES.isChecked());
        CheckBox THURS = (CheckBox) findViewById(R.id.THURS);
        selectTHURS = getThursday(THURS.isChecked());



//        for(int i=0; i<6; i++){
//          if()
//        }

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

                                if (nameDB!=null||cityDB!=null||areaDB!=null||SpecialtyDB!=null||languagesDB!=null||dayDB!=null||genderDB!=null||timeDB!=null) {
                                    if (selectName.contains(nameDB) || selectArea.contains(areaDB) ||
                                            selectCity.contains(cityDB) || selectTreatment.contains(SpecialtyDB) ||
                                            selectLanguages.contains(languagesDB)||selectGender.contains(genderDB)) {
                                        System.out.println("find");
                                        System.out.println(SpecialtyDB);
                                        System.out.println(cityDB);
                                        System.out.println(nameDB);

                                        Intent intent = new Intent(LocatingDoctorsActivity.this, DoctorsActivity.class);
                                        intent.putExtra("nameDoctor", doctor.getName());
                                        startActivity(intent);


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
        bSearch = (Button) findViewById(R.id.bSearch);
        bSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                searchDoctors = (EditText)findViewById(R.id.searchDoctors);
                ApiDao.launch("doctor", new TypeReference<List<Doctor>>() {

                }, new ApiDao.ToDo() {

                    @Override
                    public void doSome(Object in) {
                        List<Doctor> doctors = (List<Doctor>) in;
                for (Doctor doctor : doctors) {
                                        cityDB = doctor.getCity();
                                        SpecialtyDB = doctor.getField_treatment();
                                        EditText searchDoctors1 = (EditText) findViewById(R.id.searchDoctors);
                                        searchDoctors2 = searchDoctors1.getEditableText().toString();
                                        arraySearchDoctors2 = searchDoctors2.split(pic);
                                        System.out.println(searchDoctors2);
                                        System.out.println(arraySearchDoctors2);
                                        city = arraySearchDoctors2[0];
//                                        Specialty = arraySearchDoctors2[1];
                                        System.out.println(city);
                                        System.out.println(cityDB);
                                        System.out.println(Specialty);
                                        System.out.println(SpecialtyDB);
                                        if (city.contains(cityDB) || Specialty.contains(SpecialtyDB)) {
                                            Intent intent = new Intent(LocatingDoctorsActivity.this, DoctorsActivity.class);
                                            intent.putExtra("nameDoctor", doctor.getName());
                                            startActivity(intent);


                                        } else {
                                            System.out.println("not find");
                                          }

            }}}, context);

        }
    });
    }
}

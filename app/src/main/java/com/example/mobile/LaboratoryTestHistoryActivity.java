package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class LaboratoryTestHistoryActivity extends AppCompatActivity {

    Button OK;
    Context context=this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratory_test_history);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LaboratoryTestHistoryActivity.this, TestsActivity.class);
                startActivity(intent);
            }
        });}
//
//
//        private void getDocument()
//        {
//            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
//            intent.setType("application/msword,application/pdf");
//            intent.addCategory(Intent.CATEGORY_OPENABLE);
//            // Only the system receives the ACTION_OPEN_DOCUMENT, so no need to test.
//            startActivityForResult(intent, REQUEST_CODE_DOC);
//        }
//
//
//
//        @Override
//        protected void onActivityResult(int req, int result, Intent data)
//        {
//            // TODO Auto-generated method stub
//            super.onActivityResult(req, result, data);
//            if (result == RESULT_OK)
//            {
//                Uri fileuri = data.getData();
//                docFilePath = getFileNameByUri(this, fileuri);
//            }
//        }
//
//// get file path
//
//        private String getFileNameByUri(Context context, Uri uri)
//        {
//            String filepath = "";//default fileName
//            //Uri filePathUri = uri;
//            File file;
//            if (uri.getScheme().toString().compareTo("content") == 0)
//            {
//                Cursor cursor = context.getContentResolver().query(uri, new String[] { android.provider.MediaStore.Images.ImageColumns.DATA,
//                        .Images.Media.ORIENTATION }, null, null, null);
//                int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//
//                cursor.moveToFirst();
//
//                String mImagePath = cursor.getString(column_index);
//                cursor.close();
//                filepath = mImagePath;
//
//            }
//            else
//            if (uri.getScheme().compareTo("file") == 0)
//            {
//                try
//                {
//                    file = new File(new URI(uri.toString()));
//                    if (file.exists())
//                        filepath = file.getAbsolutePath();
//
//                }
//                catch (URISyntaxException e)
//                {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//            else
//            {
//                filepath = uri.getPath();
//            }
//            return filepath;
//        }

    }


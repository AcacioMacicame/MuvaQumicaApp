package com.macicame.acacio.muvaqumicaapp.grade12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.macicame.acacio.muvaqumicaapp.MainActivity;
import com.macicame.acacio.muvaqumicaapp.R;

public class Grade12ReportActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade12_report);

        pdfView= (PDFView)findViewById(R.id.grade12PdfView);
        pdfView.fromAsset("grade10report.pdf").load();
    }

    public void onRepeatClick(View view) {
        Intent intent = new Intent(Grade12ReportActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

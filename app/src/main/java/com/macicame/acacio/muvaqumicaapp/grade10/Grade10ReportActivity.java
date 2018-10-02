package com.macicame.acacio.muvaqumicaapp.grade10;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.macicame.acacio.muvaqumicaapp.MainActivity;
import com.macicame.acacio.muvaqumicaapp.R;

public class Grade10ReportActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10_report);

        pdfView= (PDFView)findViewById(R.id.grade10PdfView);
        pdfView.fromAsset("grade10report.pdf").load();
    }

    public void onRepeatClick(View view) {
        Intent intent = new Intent(Grade10ReportActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

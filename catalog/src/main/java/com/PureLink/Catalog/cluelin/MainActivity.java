package com.PureLink.Catalog.cluelin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.PureLink.Catalog.cluelin.Category.INDEX_SELECTION;
import com.PureLink.Catalog.cluelin.Category.CategoryCable;
import com.PureLink.Catalog.cluelin.Category.CategoryConverter;
import com.PureLink.Catalog.cluelin.Category.CategoryExtender;
import com.PureLink.Catalog.cluelin.Category.CategoryMatrix;
import com.PureLink.Catalog.cluelin.Category.CategoryPresentation;
import com.PureLink.Catalog.cluelin.Category.CategorySolution;
import com.PureLink.Catalog.cluelin.Category.CategorySwitcher;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Should be implements PDF Indexing work.
//        CategoryMatrix.CATEGORY_MATRIX

    }



    public void onClickContentsSelectButton(View view) {

        Intent intent = new Intent(this, IndexActivity.class);

        //메인에서 선택되는 항목에 따라서 intent에 포함하는 인스턴스가 달라짐.
        //send selected subCategory instance
        switch (view.getId()) {
            case R.id.indexButtonMatrix:
                intent.putExtra(INDEX_SELECTION.PDF_NAME, CategoryMatrix.CATEGORY_MATRIX);

                break;
            case R.id.indexButtonPresentation:
                intent.putExtra(INDEX_SELECTION.PDF_NAME, new CategoryPresentation());
                break;
            case R.id.indexButtonExtender:
                intent.putExtra(INDEX_SELECTION.PDF_NAME, new CategoryExtender());
                break;
            case R.id.indexButtonSwitcher:
                intent.putExtra(INDEX_SELECTION.PDF_NAME, new CategorySwitcher());
                break;
            case R.id.indexButtonConverter:
                intent.putExtra(INDEX_SELECTION.PDF_NAME, new CategoryConverter());
                break;
            case R.id.indexButtonCable:
                intent.putExtra(INDEX_SELECTION.PDF_NAME, new CategoryCable());
                break;
            case R.id.indexButtonSolution:
                intent.putExtra(INDEX_SELECTION.PDF_NAME, new CategorySolution());
                break;

        }

        startActivity(intent);


    }


}

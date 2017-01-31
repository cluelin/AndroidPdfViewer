package com.PureLink.Catalog.cluelin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.PureLink.Catalog.cluelin.Category.INDEX_SELECTION;
import com.PureLink.Catalog.cluelin.Category.Category;


import java.util.ArrayList;


public class IndexActivity extends AppCompatActivity implements View.OnClickListener {


    private Category category;
    private TextView majorCategoryNameTextView;
    private LinearLayout linearLayout;

    final int NO_SUBCATEGORY = 0;

    final int SUB_CATEGORY_WIDTH = LinearLayout.LayoutParams.MATCH_PARENT;
    final int SUB_CATEGORY_HEIGHT = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        majorCategoryNameTextView = (TextView) findViewById(R.id.majorCategoryNameTextView);
        linearLayout = (LinearLayout) findViewById(R.id.activity_index);

        //get Category Type from Intent
        Intent intent = getIntent();
        category = intent.getParcelableExtra(INDEX_SELECTION.PDF_NAME);

        Log.d("태그", "Name : " + category.getCategoryName());
        Log.d("태그", "subCategory List : " + category.getSubCategoryNameList().get(0));
        Log.d("태그", "IndexList : " + category.getIndexPageList().get(0));
        Log.d("태그", "startPage : " + category.getStartPage());



        if (category.isNoSubCategory()){

            //서브 카테고리가 없는 경우.
            //인덱스 페이지 구성할 필요없음. 바로 pdf catalog보여주기.
            sendSubCategoryInformation(NO_SUBCATEGORY);
            finish();

        }else{
            //index page 구성
            setIndexPage();
        }


    }


    public void setIndexPage() {


        ArrayList subCategoryList;

        //set MajorCategory index
        majorCategoryNameTextView.setText(category.getCategoryName());
        subCategoryList = category.getSubCategoryNameList();

        //set SubCategory index.
        for (int i = 0; i < category.getSubCategorySize(); i++) {
            ImageButton subCategoryImageButton = new ImageButton(this);

            //set subCategoryImageButton id for
            subCategoryImageButton.setId(i);
            subCategoryImageButton.setOnClickListener(this);

            //set image for subCategory List
            subCategoryImageButton.setBackground(getDrawable(category.getSubCategoryButtonImageArray().get(i)));
            subCategoryImageButton.setScaleType(ImageView.ScaleType.CENTER);
            subCategoryImageButton.setLayoutParams(new LinearLayout.LayoutParams(SUB_CATEGORY_WIDTH, SUB_CATEGORY_HEIGHT));

            ViewGroup.MarginLayoutParams marginLayoutParams =
                    (ViewGroup.MarginLayoutParams) subCategoryImageButton.getLayoutParams();
            marginLayoutParams.setMargins(10, 10, 10, 10);
            subCategoryImageButton.setLayoutParams(marginLayoutParams);


            linearLayout.addView(subCategoryImageButton);

        }



    }


    //when each subCategory clicked.
    public void onClick(View v) {

        Log.d("time", "서브 카테고리 클릭됨");

        sendSubCategoryInformation(v.getId());

    }

    public void sendSubCategoryInformation(int SubCategoryOrder){

        Intent intent = new Intent(this, PDFViewActivity_.class);
        intent.putExtra(INDEX_SELECTION.PDF_NAME, category.getPdfFileName());

        //send target pdf page
        //can be improve.
        //but now it works.
        //maybe later..
        intent.putExtra(INDEX_SELECTION.TARGET_PAGE, category.getIndexPageList().get(SubCategoryOrder));
        intent.putExtra(INDEX_SELECTION.FIRST_PAGE, category.getStartPage());
        intent.putExtra(INDEX_SELECTION.LAST_PAGE, category.getEndPage());

        startActivity(intent);

    }

}

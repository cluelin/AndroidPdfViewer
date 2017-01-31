package com.PureLink.Catalog.cluelin.Category;

import com.PureLink.Catalog.cluelin.R;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryMatrix extends Category {

    public static final CategoryMatrix CATEGORY_MATRIX = new CategoryMatrix();

    private CategoryMatrix(){

        setCategoryName("Matrix");

        setPdfFileName(INDEX_SELECTION.MATRIXT);

        makeSubCategoryNameList();
        makeIndexPageList();
        makeSUbCategoryButtonList();

        setStartPage(5);
        setEndPage(24);
    }

    private void makeIndexPageList(){
        getIndexPageList().add(5);
        getIndexPageList().add(14);
        getIndexPageList().add(16);
        getIndexPageList().add(21);
        getIndexPageList().add(23);
        getIndexPageList().add(24);
    }

    private void makeSubCategoryNameList(){
        getSubCategoryNameList().add("PM");
        getSubCategoryNameList().add("UX");
        getSubCategoryNameList().add("HX");
        getSubCategoryNameList().add("HTX");
        getSubCategoryNameList().add("MXA");
        getSubCategoryNameList().add("MX");


    }

    private void makeSUbCategoryButtonList(){
        getSubCategoryButtonImageArray().add(R.drawable.sub_pm);
        getSubCategoryButtonImageArray().add(R.drawable.sub_ux);
        getSubCategoryButtonImageArray().add(R.drawable.sub_hx);
        getSubCategoryButtonImageArray().add(R.drawable.sub_htx);
        getSubCategoryButtonImageArray().add(R.drawable.sub_mxa);
        getSubCategoryButtonImageArray().add(R.drawable.sub_mx);
    }


}

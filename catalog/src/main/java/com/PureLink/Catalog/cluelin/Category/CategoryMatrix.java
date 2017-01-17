package com.PureLink.Catalog.cluelin.Category;

import com.PureLink.Catalog.cluelin.R;

import java.util.ArrayList;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryMatrix extends Category {

    private ArrayList<String> subCategoryList = new ArrayList();


    public CategoryMatrix(){

        setCategoryName("Matrix");

        setPdfFileName(INDEX_SELECTION.MATRIXT);

        makeSubCategoryList();
        setSubCategoryNameList(subCategoryList);

        makeIndexPageList();

        getSubCategoryButtonImageArray().add(R.drawable.pm);
        getSubCategoryButtonImageArray().add(R.drawable.sub_ux);
        getSubCategoryButtonImageArray().add(R.drawable.sub_hx);
        getSubCategoryButtonImageArray().add(R.drawable.sub_htx);
        getSubCategoryButtonImageArray().add(R.drawable.sub_mxa);
        getSubCategoryButtonImageArray().add(R.drawable.sub_mx);

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

    private void makeSubCategoryList(){
        subCategoryList.add("PM");
        subCategoryList.add("UX");
        subCategoryList.add("HX");
        subCategoryList.add("HTX");
        subCategoryList.add("MXA");
        subCategoryList.add("MX");


    }


}

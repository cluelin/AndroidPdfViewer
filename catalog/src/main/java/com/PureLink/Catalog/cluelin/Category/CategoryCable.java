package com.PureLink.Catalog.cluelin.Category;

import com.PureLink.Catalog.cluelin.R;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryCable extends Category {



    public CategoryCable(){

        setStartPage(81);
        setEndPage(93);

        setCategoryName("Cable");
        setPdfFileName(INDEX_SELECTION.CABLE);

        makeIndexPageList();
        makeSubCategoryButtonList();
        makeSubCategoryNameList();

    }

    private void makeSubCategoryNameList(){
        getSubCategoryNameList().add("CX Series");
        getSubCategoryNameList().add("EZ Series");
        getSubCategoryNameList().add("PI Series");
        getSubCategoryNameList().add("PS Series");
    }

    private void makeIndexPageList(){
        getIndexPageList().add(81);
        getIndexPageList().add(82);
        getIndexPageList().add(84);
        getIndexPageList().add(88);
    }

    private void makeSubCategoryButtonList(){
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_cx);
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_ez);
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_pi);
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_ps);

    }
}

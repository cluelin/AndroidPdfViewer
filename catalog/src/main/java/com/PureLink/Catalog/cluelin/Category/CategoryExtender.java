package com.PureLink.Catalog.cluelin.Category;

import com.PureLink.Catalog.cluelin.R;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryExtender extends Category {


    public CategoryExtender(){

        setCategoryName("Extender");
        setPdfFileName(INDEX_SELECTION.EXTENDER);




        makeSubCategoryNameList();
        makeIndexPageList();
        makeSubCategoryButtonList();

        setStartPage(31);
        setEndPage(59);



    }

    private void makeSubCategoryNameList(){
        getSubCategoryNameList().add("HDMI");
        getSubCategoryNameList().add("DVI");
        getSubCategoryNameList().add("HDBaseT");
        getSubCategoryNameList().add("Fiber Optic");
    }

    private void makeIndexPageList(){
        getIndexPageList().add(31);
        getIndexPageList().add(39);
        getIndexPageList().add(41);
        getIndexPageList().add(48);
    }

    private void makeSubCategoryButtonList(){
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_hdmi);
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_dvi);
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_hdbaset);
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_fiber);

    }
}

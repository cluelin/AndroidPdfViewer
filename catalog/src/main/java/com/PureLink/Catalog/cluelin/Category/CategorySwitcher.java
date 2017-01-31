package com.PureLink.Catalog.cluelin.Category;

import com.PureLink.Catalog.cluelin.R;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategorySwitcher extends Category {



    public CategorySwitcher(){


        makeIndexPageList();
        makeSUbCategoryButtonList();
        makeSubCategoryNameLisk();


        setStartPage(61);
        setEndPage(67);

        setCategoryName("Switcher");
        setPdfFileName(INDEX_SELECTION.SWITCHER);

    }

    private void makeSubCategoryNameLisk(){
        getSubCategoryNameList().add("HDMI");
        getSubCategoryNameList().add("DVI");
    }

    private void makeIndexPageList(){
        getIndexPageList().add(61);
        getIndexPageList().add(67);
    }

    private void makeSUbCategoryButtonList(){
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_hdmi);
        getSubCategoryButtonImageArray().add(R.drawable.sub_index_dvi);
    }

}

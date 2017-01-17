package com.PureLink.Catalog.cluelin.Category;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategorySwitcher extends Category {



    public CategorySwitcher(){

        getSubCategoryNameList().add("HDMI");
        getSubCategoryNameList().add("DVI");

        getIndexPageList().add(61);
        getIndexPageList().add(67);

        setStartPage(61);
        setEndPage(67);

        setCategoryName("Switcher");
        setPdfFileName(INDEX_SELECTION.SWITCHER);

    }

}

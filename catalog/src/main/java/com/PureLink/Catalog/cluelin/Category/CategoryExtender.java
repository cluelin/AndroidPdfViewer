package com.PureLink.Catalog.cluelin.Category;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryExtender extends Category {


    public CategoryExtender(){

        getSubCategoryNameList().add("HDMI");
        getSubCategoryNameList().add("DVI");
        getSubCategoryNameList().add("HDBaseT");
        getSubCategoryNameList().add("Fiber Optic");

        getIndexPageList().add(31);
        getIndexPageList().add(39);
        getIndexPageList().add(41);
        getIndexPageList().add(48);

        setStartPage(31);
        setEndPage(59);

        setCategoryName("Extender");
        setPdfFileName(INDEX_SELECTION.EXTENDER);

    }
}

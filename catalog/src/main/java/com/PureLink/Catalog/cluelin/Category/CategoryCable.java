package com.PureLink.Catalog.cluelin.Category;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryCable extends Category {



    public CategoryCable(){

        getSubCategoryNameList().add("CX Series");
        getSubCategoryNameList().add("EZ Series");
        getSubCategoryNameList().add("PI Series");
        getSubCategoryNameList().add("PS Series");

        getIndexPageList().add(81);
        getIndexPageList().add(82);
        getIndexPageList().add(84);
        getIndexPageList().add(88);

        setStartPage(81);
        setEndPage(93);

        setCategoryName("Cable");
        setPdfFileName(INDEX_SELECTION.CABLE);

    }
}

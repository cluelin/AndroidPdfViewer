package com.PureLink.Catalog.cluelin.Category;



/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryConverter extends Category {



    public CategoryConverter(){

        getSubCategoryNameList().add("no list");
        getIndexPageList().add(71);

        setStartPage(71);
        setEndPage(75);

        setCategoryName("Converter");
        setPdfFileName(INDEX_SELECTION.CONVERTER);

        setNoSubCategory(true);
    }


}

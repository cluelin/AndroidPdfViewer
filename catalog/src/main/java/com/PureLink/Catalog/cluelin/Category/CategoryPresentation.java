package com.PureLink.Catalog.cluelin.Category;


/**
 * Created by cluelin on 2016-12-21.
 */

public class CategoryPresentation extends Category {



    public CategoryPresentation(){



        setCategoryName("Presentation");
        setPdfFileName(INDEX_SELECTION.PRESENTATION);
        getSubCategoryNameList().add("No sub category");

        getIndexPageList().add(27);

        setStartPage(27);
        setEndPage(27);

        setNoSubCategory(true);
    }




}

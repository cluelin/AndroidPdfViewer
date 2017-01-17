package com.PureLink.Catalog.cluelin.Category;

/**
 * Created by cluelin on 2016-12-21.
 */

public class CategorySolution extends Category {



    public CategorySolution(){

        getSubCategoryNameList().add("no subcategory");
        getIndexPageList().add(77);

        setStartPage(77);
        setEndPage(78);
        setCategoryName("Solution");
        setPdfFileName(INDEX_SELECTION.SOLUTION);

        setNoSubCategory(true);

    }

}

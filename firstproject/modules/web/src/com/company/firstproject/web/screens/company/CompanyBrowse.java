package com.company.firstproject.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Company;

@UiController("firstproject_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {
}
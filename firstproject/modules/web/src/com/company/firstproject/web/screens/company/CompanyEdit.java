package com.company.firstproject.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Company;

@UiController("firstproject_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}
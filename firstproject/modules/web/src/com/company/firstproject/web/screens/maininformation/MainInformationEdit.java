package com.company.firstproject.web.screens.maininformation;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.MainInformation;

@UiController("firstproject_MainInformation.edit")
@UiDescriptor("main-information-edit.xml")
@EditedEntityContainer("mainInformationDc")
@LoadDataBeforeShow
public class MainInformationEdit extends StandardEditor<MainInformation> {
}
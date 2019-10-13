package com.company.firstproject.web.screens.maininformation;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.MainInformation;

@UiController("firstproject_MainInformation.browse")
@UiDescriptor("main-information-browse.xml")
@LookupComponent("mainInformationsTable")
@LoadDataBeforeShow
public class MainInformationBrowse extends StandardLookup<MainInformation> {
}
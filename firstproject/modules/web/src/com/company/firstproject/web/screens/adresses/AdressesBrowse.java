package com.company.firstproject.web.screens.adresses;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Adresses;

@UiController("firstproject_Adresses.browse")
@UiDescriptor("adresses-browse.xml")
@LookupComponent("adressesesTable")
@LoadDataBeforeShow
public class AdressesBrowse extends StandardLookup<Adresses> {
}
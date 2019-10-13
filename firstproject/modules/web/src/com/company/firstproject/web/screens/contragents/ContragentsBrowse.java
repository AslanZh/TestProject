package com.company.firstproject.web.screens.contragents;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Contragents;

@UiController("firstproject_Contragents.browse")
@UiDescriptor("contragents-browse.xml")
@LookupComponent("contragentsesTable")
@LoadDataBeforeShow
public class ContragentsBrowse extends StandardLookup<Contragents> {
}
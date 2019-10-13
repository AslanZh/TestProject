package com.company.firstproject.web.screens.adresses;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Adresses;

@UiController("firstproject_Adresses.edit")
@UiDescriptor("adresses-edit.xml")
@EditedEntityContainer("adressesDc")
@LoadDataBeforeShow
public class AdressesEdit extends StandardEditor<Adresses> {
}
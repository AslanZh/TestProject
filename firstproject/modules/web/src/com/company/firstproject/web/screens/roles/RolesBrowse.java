package com.company.firstproject.web.screens.roles;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Roles;

@UiController("firstproject_Roles.browse")
@UiDescriptor("roles-browse.xml")
@LookupComponent("rolesesTable")
@LoadDataBeforeShow
public class RolesBrowse extends StandardLookup<Roles> {
}
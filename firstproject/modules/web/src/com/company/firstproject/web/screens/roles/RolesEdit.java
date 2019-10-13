package com.company.firstproject.web.screens.roles;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Roles;

@UiController("firstproject_Roles.edit")
@UiDescriptor("roles-edit.xml")
@EditedEntityContainer("rolesDc")
@LoadDataBeforeShow
public class RolesEdit extends StandardEditor<Roles> {
}
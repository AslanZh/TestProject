package com.company.firstproject.web.screens.contactinfo;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.ContactInfo;

@UiController("firstproject_ContactInfo.edit")
@UiDescriptor("contact-info-edit.xml")
@EditedEntityContainer("contactInfoDc")
@LoadDataBeforeShow
public class ContactInfoEdit extends StandardEditor<ContactInfo> {
}
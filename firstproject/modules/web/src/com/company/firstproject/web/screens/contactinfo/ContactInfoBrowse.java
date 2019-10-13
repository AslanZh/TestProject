package com.company.firstproject.web.screens.contactinfo;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.ContactInfo;

@UiController("firstproject_ContactInfo.browse")
@UiDescriptor("contact-info-browse.xml")
@LookupComponent("contactInfoesTable")
@LoadDataBeforeShow
public class ContactInfoBrowse extends StandardLookup<ContactInfo> {
}
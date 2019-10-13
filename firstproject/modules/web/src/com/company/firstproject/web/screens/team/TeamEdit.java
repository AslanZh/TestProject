package com.company.firstproject.web.screens.team;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Team;

@UiController("firstproject_Team.edit")
@UiDescriptor("team-edit.xml")
@EditedEntityContainer("teamDc")
@LoadDataBeforeShow
public class TeamEdit extends StandardEditor<Team> {
}
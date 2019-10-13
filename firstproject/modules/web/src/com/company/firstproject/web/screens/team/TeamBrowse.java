package com.company.firstproject.web.screens.team;

import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Team;

@UiController("firstproject_Team.browse")
@UiDescriptor("team-browse.xml")
@LookupComponent("teamsTable")
@LoadDataBeforeShow
public class TeamBrowse extends StandardLookup<Team> {
}
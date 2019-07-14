package org.nomiki.democdclock.web;

import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.apache.commons.lang3.time.DateUtils;
import org.vaadin.kim.countdownclock.CountdownClock;

import javax.inject.Inject;
import java.util.Date;

@UiController("democdclock_NewScreen")
@UiDescriptor("new-screen.xml")
public class NewScreen extends Screen {
    @Inject
    private CountdownClock appCountdownClock;

    @Subscribe
    private void onInit(InitEvent event) {
        appCountdownClock.setDate(DateUtils.addHours(new Date(), -1));
        appCountdownClock.setFormat("Time clock1.setFormat(\"<span style='font: bold 13px Arial; margin: 10px'>\"\n" +
                "\t\t\t\t+ \"Time until new year: %d days, %h hours, %m minutes and %s seconds</span>\");");
    }


}
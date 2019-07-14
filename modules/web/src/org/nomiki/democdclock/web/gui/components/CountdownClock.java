package org.nomiki.democdclock.web.gui.components;

import com.haulmont.cuba.gui.components.Component;

import java.util.Date;

public interface CountdownClock extends Component {
    String NAME = "countdownClock";

    void setDate(Date date);
    Date getDate();

    void setFormat(String format);
    String getFormat();

    void addEndEventListener(org.vaadin.kim.countdownclock.CountdownClock.EndEventListener listener);
    void removeEndEventListener(org.vaadin.kim.countdownclock.CountdownClock.EndEventListener listener);

    void setNeglectHigherUnits(boolean neglect);
    boolean getNeglectHigherUnits();
}

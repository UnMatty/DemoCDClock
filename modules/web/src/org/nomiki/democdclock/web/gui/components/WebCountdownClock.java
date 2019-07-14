package org.nomiki.democdclock.web.gui.components;

import com.haulmont.cuba.web.gui.components.WebAbstractComponent;
import org.vaadin.kim.countdownclock.CountdownClock;

import java.util.Date;

public class WebCountdownClock extends WebAbstractComponent<CountdownClock> implements org.nomiki.democdclock.web.gui.components.CountdownClock {
    public WebCountdownClock() {
        this.component = createComponent();
    }

    private CountdownClock createComponent() {
        return new CountdownClock();
    }

    @Override
    public void setDate(Date date) {
        component.setDate(date);
    }

    @Override
    public Date getDate() {
        return component.getDate();
    }

    @Override
    public void setFormat(String format) {
        component.setFormat(format);
    }

    @Override
    public String getFormat() {
        return component.getFormat();
    }

    @Override
    public void addEndEventListener(org.vaadin.kim.countdownclock.CountdownClock.EndEventListener listener) {
        component.addEndEventListener(listener);
    }

    @Override
    public void removeEndEventListener(org.vaadin.kim.countdownclock.CountdownClock.EndEventListener listener) {
        component.removeEndEventListener(listener);
    }

    @Override
    public void setNeglectHigherUnits(boolean neglect) {
        component.setNeglectHigherUnits(neglect);
    }

    @Override
    public boolean getNeglectHigherUnits() {
        return component.getNeglectHigherUnits();
    }
}

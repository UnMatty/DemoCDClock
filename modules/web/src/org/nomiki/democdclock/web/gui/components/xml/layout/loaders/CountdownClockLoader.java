package org.nomiki.democdclock.web.gui.components.xml.layout.loaders;

import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;
import org.nomiki.democdclock.web.gui.components.CountdownClock;

public class CountdownClockLoader extends AbstractComponentLoader<CountdownClock> {
    @Override
    public void createComponent() {
        resultComponent = factory.create(CountdownClock.class);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {

    }
}

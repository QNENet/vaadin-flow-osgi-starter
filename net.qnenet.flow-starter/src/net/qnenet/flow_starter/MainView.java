package net.qnenet.flow_starter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
// Need to explicitly declare the Lumo until https://github.com/vaadin/flow/issues/4847 is fixed
@Theme(Lumo.class)
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2227996025765451001L;

	public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button);
    }
}

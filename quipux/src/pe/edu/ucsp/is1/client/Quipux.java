package pe.edu.ucsp.is1.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class Quipux implements EntryPoint {
	@Override
	public void onModuleLoad() {
		final String hola = "HOLA ";
		Button btn = new Button("Click Me!");
		final TextBox textBox = new TextBox();
		textBox.addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				if (!textBox.getText().isEmpty()) {
					textBox.getElement().getStyle().setBorderWidth(3, Unit.PX);
					textBox.getElement().getStyle().setBorderColor("red");
				}
			}
		});
		btn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("nameFieldContainer").clear();
				RootPanel.get("nameFieldContainer").add(new HTML(hola + textBox.getText()));
			}
		});
		RootPanel.get("cajaDeTexto").add(textBox);
		RootPanel.get("sendButtonContainer").add(btn);
	}
}

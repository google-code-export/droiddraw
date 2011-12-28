package org.droiddraw.widget;

import java.util.Vector;

import org.droiddraw.property.Property;
import org.droiddraw.property.StringProperty;

public class AbsoluteLayout extends AbstractLayout {
	
	public static final String TAG_NAME = "AbsoluteLayout";
	
	public AbsoluteLayout() {
		super(TAG_NAME);
	}

	@Override
	public void positionWidget(Widget w) {
		apply();
	}

	@Override
	public void repositionAllWidgets() {
		apply();
	}

	public void addOutputProperties(Widget w, Vector<Property> properties) {
		properties.add(new StringProperty("X Position","android:layout_x", w.getX()+"dp", false));
		properties.add(new StringProperty("Y Position","android:layout_y", w.getY()+"dp", false));
	}
	
	public void addEditableProperties(Widget w) {}
	public void removeEditableProperties(Widget w) {}
	
	@Override
  public void apply() {
		super.apply();
	}
}

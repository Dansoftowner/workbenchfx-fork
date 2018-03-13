package com.dlsc.workbenchfx.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Node;
import javafx.scene.image.Image;

/**
 * Created by François Martin on 13.03.18.
 */
public class Module implements ModuleBase {

  StringProperty name = new SimpleStringProperty();
  ObjectProperty<Image> icon = new SimpleObjectProperty<>();

  public Module(String name, Image icon, Node main) {
    this.name.setValue(name);
    this.icon.setValue(icon);
    mainNode.set(main);
  }

  public static Module of(String name, Image icon, Node main) {
    return new Module(name, icon, main);
  }

}

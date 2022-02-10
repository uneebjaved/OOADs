import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GuitarSpec {
 
  private Builder builder; 
  private String model;
  private Type type;
  private Wood backWood;
  private Wood topWood;
  private int numStrings;

  public GuitarSpec(Builder builder, String model, Type type,
                    Wood backWood, Wood topWood, int numStrings) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
    this.numStrings = numStrings;
  }

  public Builder getBuilder() {
    return builder;
  }

  public String getModel() {
    return model;
  }

  public Type getType() {
    return type;
  }

  public Wood getBackWood() {
    return backWood;
  }

  public Wood getTopWood() {
    return topWood;
  }

  public Integer getNumStrings() { return numStrings;}

  public boolean matches(GuitarSpec guitarSpec) {
      if (this.getBuilder() != guitarSpec.getBuilder())
        return false;
      String model = this.getModel().toLowerCase();
      if ((model != null) && (!model.equals("")) &&
              (!model.equals(guitarSpec.getModel().toLowerCase())))
        return false;
      if (this.getType() != guitarSpec.getType())
        return false;
      if (this.getBackWood() != guitarSpec.getBackWood())
        return false;
      if (this.getTopWood() != guitarSpec.getTopWood())
        return false;
    return true;
  }
}

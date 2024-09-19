import java.util.jar.Attributes.Name;

class NamedCow extends Cow {
   private String cowName;

   public NamedCow(String type, String name, String sound) {
      super(type, sound);
      cowName = name;
   }

   public NamedCow(String type, String sound) {
      super(type, sound);
      cowName = "cow";
   }

   public String getName() {
      return cowName;
   }
}

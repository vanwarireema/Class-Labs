class Pig implements Animal {
   private String sound;
   private String type;

   public Pig(String pigType, String pigSound ) {
      sound = pigSound;
      type = pigType;

   }

   public String getSound() {
      return sound;
   }

   public String getType() {
      return type;
   }
}
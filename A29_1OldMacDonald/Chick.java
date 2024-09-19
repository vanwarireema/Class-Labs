class Chick implements Animal {

   private String myType;
   private String mySound;
   private String otherSound;

   public Chick(String type, String sound) {

      myType = type;
      mySound = sound;
   }

   public Chick(String type, String sound, String sound2) {
      myType = type;
      mySound = sound;
      otherSound = sound2;
   }

   public String getSound() {
      int num = (int) (Math.random() * 2);

      if (num == 1) {
         return mySound;
      }

      else {
         return otherSound;
      }

   }

   public String getType() {
      return myType;
   }
}
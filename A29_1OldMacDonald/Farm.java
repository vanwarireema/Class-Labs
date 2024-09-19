import java.util.*;

/**
 * creates an array of different animals and it's sounds
 * by having a get sound and an array of animal objects this will dynamically decide what sound to make
 * which is polymorphism
 * 
 * 
 * @author Reema Vanwari
 * @version 11/5/23
 * 
 *          Period - 1
 *          Assignment - A29.1 Old MacDonald
 * 
 *          Sources - None
 */
public class Farm {
   private Animal[] a = new Animal[3];

   public Farm() {
      a[0] = new NamedCow("cow", "Elsie", "moo moo");
      // a[0] = new NamedCow("cow", "Elsie", "moo");
      a[1] = new Chick("chick", "cheep", "cluck cluck" );      
      // a[1] = new Chick("chick", "cluckity cluck", "cheep");
      a[2] = new Pig("pig", "oink");

      
   }

   public void animalSounds()
   {
     for (int i = 0; i < a.length; i++)
     {
       System.out.println(a[i].getType() + " goes " + a[i].getSound());
     }
     System.out.println("The cow is known as " + ((NamedCow)a[0]).getName());
   }
}

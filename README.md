# Interface Lab

## Learning Goals

- Create and use interfaces

## Instructions

Create a simple game that asks the player what type of bird it would like to
capture and tells them if their bird was able to escape the monster based on how
fast their bird can fly.

You will need the following:

1. A driver class to run your game.
2. A method to ask the user what type of bird they want.
3. A `CanFly` interface to indicate the bird selected can fly (AKA the user 
   cannot select a penguin).
4. A `fly()` method in your `CanFly` interface, that returns an `int` that
   represents the speed at which the bird is flying.
5. A method to ask the user how fast the monster is.
6. An `if` statement that lets the bird escape if their speed is faster than the
   speed of the monster.

In writing this code, you should be able to see that once you've created the
instance of the bird the user asked for, you shouldn't have to worry about its
specific type anymore.

## Walkthrough

Consider the following starter code to help you program the game:

```java
package com.flatiron.bird;

public abstract class Bird {
   private String name;

   Bird() {
      this.name = "unknown";
   }

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public void eat() {
      System.out.println("Yum! I like to eat!");
   }

   public abstract void makeSound();

}
```

```java
package com.flatiron.bird;

public class Parrot extends Bird {

   Parrot() {
      setName("Iago");
   }

   @Override
   public void eat() {
      System.out.println("Yum! I like to eat crackers!");
   }

   @Override
   public void makeSound() {
      System.out.println("Squawk!");
   }
}
```

```java
package com.flatiron.bird;

public class Puffin extends Bird {

   Puffin() {
      setName("Oona");
   }

   @Override
   public void makeSound() {
      System.out.println("Brau!");
   }
}
```

```java
package com.flatiron.bird;

public class Pigeon extends Bird {

    Pigeon() {
        setName("Sterling");
    }

    @Override
    public void makeSound() {
        System.out.print("Coo coo!");
    }
}
```

```java
package com.flatiron.bird;

public interface CanFly {

    // Parrots can fly up to 50 miles per hour
    // Pigeons can fly up to 90 miles per hour
    // Puffins can fly up to 55 miles per hour
}
```

Below is also the driver class that will be used. Some starter code has already
been provided. You will need to fill in the rest.


```java
package com.flatiron.bird;

public class BirdDriver {
   public static void main(String[] args) {
      Bird userBird = getUserBird();
      int monsterSpeed = getMonsterSpeed();

      int birdSpeed = userBird.fly();
      if (birdSpeed > monsterSpeed) {
         System.out.println("Yay! Your bird was fast enough to escape!");
      } else {
         System.out.println("Unfortunately, your bird was not fast enough to escape.");
      }
   }

   /**
    * Prompt the user for the type of bird they wish to play the game with
    * @return Bird - the bird the user selected
    */
   public static Bird getUserBird() {
        // Your code here
   }

   /**
    * Prompt the user for speed of the monster
    * @return int - the speed in miles per hour that the user entered
    */
   public static int getMonsterSpeed() {
        // Your code here
   }
}
```

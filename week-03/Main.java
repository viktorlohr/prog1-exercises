public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

  // Ex 1
  public static void checkNumber(int num) {
    if (num == 42) {
      System.out.println(num + " is the meaning of life.");
    } else if (num == 7) {
      System.out.println(num + " is a lucky number.");
    } else if (num == 0) {
      System.out.println(num + " is zero.");
    } else if (num == 13) {
      System.out.println(num + " is an unlucky number.");
    }
    else {
      System.out.println(num + " is boring.");
    }
  }

  //  Ex 2
  public static void checkNumberSwitch(int num) {
    switch (num) {
      case 42: System.out.println(num + " is the meaning of life."); break;
      case 7: System.out.println(num + " is a lucky number."); break;
      case 0: System.out.println(num + " is zero."); break;
      case 13: System.out.println(num + " is bad."); break;
      default: System.out.println(num + " is boring.");
    }
  }

  // Ex 3
  public static void calculateXpFor(int maxLevel) {
    int totalXp = 0;

    for (int currentLevel = 0; currentLevel < maxLevel; currentLevel++) {
      int currentXp = currentLevel * 100;

      totalXp += currentXp;

      System.out.println("Level: " + currentLevel + ". XP: " + currentXp + ". Total XP: " + totalXp);
    }
  }

  public static void calculateXpWhile(int maxLevel) {
    int totalXp = 0;
    
    int currentLevel = 0;
    while (currentLevel < maxLevel) {
      int currentXp = currentLevel * 100;
      totalXp += currentXp;

      System.out.println("Level: " + currentLevel + ". XP: " + currentXp + ". Total XP: " + totalXp);
      
      currentLevel++;
    }
  }
  
}

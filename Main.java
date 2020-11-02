class Main {
  public static void main(String[] args) {
    String[] food = {"Pizza", "Taco", "Hamburger", "Hotdog","Fruit","Milkshake","Chicken"};
  
    for (int i = 0; i<6; i++){
      System.out.println(food[i]);
    }

    food[6] = "cheese";

    System.out.print("\n Here is our updated list: \n");

    for (int i = 0; i<food.length; i++){
     System.out.println(food[i]);
    }
  }
}
  
  
  
  
  
  
    
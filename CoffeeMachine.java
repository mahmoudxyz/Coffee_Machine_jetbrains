package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterQ = 400;
        int milkQ = 540;
        int beansQ = 120;
        int cupsQ = 9;
        int moneyQ = 550;

        boolean check = true;
        while (check) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String threeOption = scanner.nextLine();
            switch (threeOption) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String backOption = scanner.nextLine();
                    int selectedDrink;
                    if (backOption.equals("back")) {
                        break;
                    } else {
                        selectedDrink = Character.getNumericValue(backOption.charAt(0));
                        System.out.println(selectedDrink);

                    }

                    switch (selectedDrink) {
                        case 1:
                            if (waterQ >=250 && beansQ >=16 && cupsQ >=1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterQ -=250;
                                beansQ -=16;
                                cupsQ -=1;
                                moneyQ +=4;
                                break;
                            }  if (waterQ <250) {
                                System.out.println("Sorry, not enough water!");
                            }  if (beansQ <16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }  if (cupsQ <1) {
                                System.out.println("Sorry, not enough coffee disposable cups!");
                            }
                            break;
                        case 2:
                            if (waterQ >=350 && milkQ >=75 && beansQ >=20 && cupsQ >=1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterQ -=350;
                                milkQ -=75;
                                beansQ -=20;
                                cupsQ -=1;
                                moneyQ +=7;
                                break;
                            }  if (waterQ <350) {
                                System.out.println("Sorry, not enough water!");
                            }  if (beansQ <20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }  if (cupsQ <1) {
                                System.out.println("Sorry, not enough coffee disposable cups!");
                            }  if (milkQ <75) {
                                System.out.println("Sorry, not enough coffee disposable milk!");
                            }
                            break;
                        case 3:
                            if (waterQ >=200 && milkQ >=100 && beansQ >=12 && cupsQ >=1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterQ -=200;
                                milkQ -=100;
                                beansQ -=12;
                                cupsQ -=1;
                                moneyQ +=6;
                                break;
                            }  if (waterQ <200) {
                                System.out.println("Sorry, not enough water!");
                            }  if (beansQ <12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }  if (cupsQ <1) {
                                System.out.println("Sorry, not enough coffee disposable cups!");
                            }  if (milkQ <100) {
                                System.out.println("Sorry, not enough coffee disposable milk!");
                            }
                            break;

                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    int waterAdd = scanner.nextInt();
                    waterQ += waterAdd;
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milkAdd = scanner.nextInt();
                    milkQ += milkAdd;
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int beansAdd = scanner.nextInt();
                    beansQ += beansAdd;
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    int cupsAdd = scanner.nextInt();
                    cupsQ += cupsAdd;
                    break;
                case "take":
                    System.out.println("I gave you $" + moneyQ);
                    moneyQ = 0;
                    break;
                case "remaining":
                    display(waterQ,milkQ,beansQ,cupsQ,moneyQ);
                    break;
                case "exit":
                    check = false;
                    break;



            }

        }




    }
    static void display(int water, int milk, int beans, int cups,int money){
        System.out.println( "The coffee machine has:");
        System.out.println(water +  " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups +  " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();


    }
}


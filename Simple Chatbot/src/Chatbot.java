import java.util.*;

public class Chatbot {
    static String Waiter(String order){
        String[] items = {"spoon", "burger", "drink", "water"};
        String[] newOrder = order.split(" ");
        String item = "";

        if(newOrder.length == 1 && Arrays.asList(items).contains(order.toLowerCase())){
            item = newOrder[0].toLowerCase();
        }else if(newOrder.length == 1 && !Arrays.asList(items).contains(order.toLowerCase())){
            return "Item is not available. Try again, please";
        }else{
            for(int i=0; i < items.length; i++){
                for(int j=0; j < newOrder.length; j++){
                    if(newOrder[j].toLowerCase().equals(items[i])){
                        return "Here's your " + items[i] + ", Sir.";
                    }
                }
            }
        }
        return "Here's your " + item + ", Sir.";
    }
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String placedOrder = "";

        System.out.println("You can only a single item at a time.");
        System.out.println(" ");

        while (true){
            System.out.println("What would you like to order? Write 'stop' to exit.");
            placedOrder = myObj.nextLine();

            if(placedOrder.toLowerCase().equals("stop")){
                System.out.println("Thank you for coming! See you next time!");
                break;
            }else {
                System.out.println(Waiter(placedOrder));
            }
        }

    }
}
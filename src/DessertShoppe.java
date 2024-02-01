import java.util.HashMap;
import menuItems.*;
import paymentMethods.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DessertShoppe {

    private String shopName; // Name of the Dessert Shoppe
    private HashMap<Integer, Item> inventory = new HashMap<>(13); // Inventory of all the items

    public DessertShoppe(String shopName, String inventoryLocation){
        this.shopName = shopName;
        loadInventory(inventoryLocation);
    }

    public String placeOrder(User user, String orderFile){
        return "";
    }

    /*******************
     *
     * Private Methods
     *
     *******************/

     private void loadInventory(String inventoryLocation){
        try {
            Scanner in = new Scanner(new File(inventoryLocation));
            String line;
            String[] itemInfo;
            line = in.nextLine();
            int itemCount = Integer.parseInt(line);

            for (int i = 0; i < itemCount; i++) {
                line = in.nextLine();
                itemInfo = line.split(",");
                for (int j = 0; j < itemInfo.length; j++) {
                    // Remove empty spaces at the beginning of strings
                    if (itemInfo[j].charAt(0) == ' ')
                        itemInfo[j] = itemInfo[j].substring(1);
                }
                loadItemData(itemInfo);
            }
     } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    }
}

private void loadItemData(String[] itemInfo) {
    int itemId = Integer.parseInt(itemInfo[0]);
    if (itemInfo[1].equals("Candy")){
        inventory.put(itemId, null);
    } else if (itemInfo[1].equals("Ice Cream")) {
        inventory.put(itemId, null);
    } else {
        inventory.put(itemId, null);
    }
}
}

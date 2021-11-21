package Solutions;
import java.util.List;
public class ElectronisShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int maxPrice=-1;
        for(int keyboard: keyboards){
            for(int drive:drives){
                if(keyboard+drive>maxPrice && keyboard+drive<=b){
                    maxPrice=keyboard+drive;
                }
            }
        }

        return maxPrice;

        // complexity is O(n^2)

    }
}

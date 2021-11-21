package Solutions;
import java.util.List;
public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here

        int sum=0;

        for(int bl:bill){
            sum+=bl;
        }

        sum-=bill.get(k);

        if(b==sum/2){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-sum/2);
        }

        //complexity is O(n)

    }
}

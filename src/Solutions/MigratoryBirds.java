package Solutions;
import java.util.List;
public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {

        int[] typesArr=new int[5];

        int result;
        int max;

        for(int i=0;i<arr.size();i++){
            typesArr[arr.get(i)-1]++;
        }

        max=typesArr[0];
        result=0;

        for(int i=1;i<typesArr.length;i++){
            if(typesArr[i]>max){
                max=typesArr[i];
                result=i;
            }
            else if(typesArr[i]==max){
                if(result>i){
                    result=i;
                }
            }
        }

        return result+1;

        //complexity is O(n)
    }

}

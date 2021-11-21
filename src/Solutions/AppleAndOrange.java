package Solutions;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applesCount=0;
        int orangesCount=0;

        for(int i=0;i<apples.size();i++){
            apples.set(i,a+apples.get(i));
        }


        for(int i=0;i<oranges.size();i++){
            oranges.set(i,b+oranges.get(i));
        }

        for(int i=0;i<apples.size();i++){
            if(apples.get(i)>=s && apples.get(i)<=t){
                applesCount++;
            }
        }

        System.out.println(applesCount);

        for(int i=0;i<oranges.size();i++){
            if(oranges.get(i)>=s && oranges.get(i)<=t){
                orangesCount++;
            }
        }


        System.out.println(orangesCount);

        //complexity is O(n)




    }
}

package Solutions;
import java.util.List;

public class CatsAndMouse {
    static String catAndMouse(int x, int y, int z) {
        int distanceAandC=Math.abs(z-x);
        int distanceBandC=Math.abs(z-y);
        if(distanceAandC<distanceBandC){
            return "Cat A";
        }else if(distanceAandC>distanceBandC){
            return "Cat B";
        }else{
            return "Mouse C";
        }

        //complexity is constant so O(1)


    }

}

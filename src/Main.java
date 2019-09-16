import com.enigma.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Your Coordinate X,Y,DIRECTION(NORTH ,EAST ,SOUTH ,WEST) : ");
        String coordinate = br.readLine();
        String [] posts = coordinate.split(",");
        System.out.println("Your Coordinate is : " + posts[0] + "," + posts[1] + "," + posts[2]);
        //Robot robot = new Robot(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]), Directions.valueOf(posts[2]));

    }

}

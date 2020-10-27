import java.util.Random;

/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-10-2020
 *
 * Description of program
 ********************************************/

public class Lotto {

    public static void main(String[] args) {

        int numre[] = new int[5];
        Random rand = new Random();

        for (int i = 0; i < numre.length ; i++) {
            int newnumber = rand.nextInt((90 - 1) + 1) + 1;

            for (int n = 0; n < numre.length ; n++) {

                if(newnumber == numre[n]) {

                    while(newnumber == numre[n]) {

                        newnumber = rand.nextInt((90 - 1) + 1) + 1;
                        n = 0;
                        
                    }

                }

            }

            numre[i] = newnumber;
            System.out.println(numre[i]);

        }

    }

}

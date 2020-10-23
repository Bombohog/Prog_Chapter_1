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

        int numre[] = new int[10];

        for (int i = 0; i <=9 ; i++) {
            int newnumber = (int) (Math.random() * 10) + 1;

            for (int n = 0; n <=9 ; n++){
                if( newnumber == numre[n]){
                    while(newnumber == numre[n]) {
                        newnumber = (int) (Math.random() * 10) + 1;
                        n = 0;
                    }}
            }

            numre[i] = newnumber;
            System.out.println(numre[i]);
        }

    }

}

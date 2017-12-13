/* Execute Unix Commands on Java.
*  u'll see results on ur Terminal */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args)throws RuntimeException, IOException{

        String line;

        // input exec command
        Scanner sc = new Scanner(System.in);
        String command = sc.next();

        // execute Unix command
        Runtime runtime = Runtime.getRuntime();
        Process p = runtime.exec(command);

        // read result strings of exec command
        StringBuffer out = new StringBuffer();
        InputStream is = p.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while((line = br.readLine()) != null){
            out.append(line+"\n");
        }

        // output
        System.out.println("Command " + command +" results:\n " + out);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();
        while (true){
            String inputBuffer = reader.readLine();
            if(inputBuffer.equals("")){
                break;
            }
                input.append(inputBuffer);
        }
        if(input.toString().equals("")){
            System.out.println("Empty string");
        }else {
            CheckBrackets checkBrackets = new CheckBrackets(input.toString());
            System.out.println(checkBrackets.checkBrackets());
        }
    }
}

public class CheckBrackets {
    private String input;
    boolean check = true;
    public CheckBrackets(String input) {
        this.input = input;
    }
    public boolean checkBrackets(){
        StackBracket stackBracket = new StackBracket(input.length());
        for(int i = 0; i < input.length(); i++){
            char chInput = input.charAt(i);
            switch (chInput){
                case '(':
                case '[':
                case '{':
                    stackBracket.push(input.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                   if(!stackBracket.isEmpty()){
                       popAndCheck(chInput, i, stackBracket);
                   }else {
                       check = false;
                       System.out.println("Error, opening bracket does not exist: " + chInput + " at " + i);
                   }
                   break;
                default:
                    break;
            }
        }
        if (!stackBracket.isEmpty()){
            check = false;
            System.out.println("Error, string finished not closed bracket");
            while (!stackBracket.isEmpty()){
                System.out.print(stackBracket.pop());
                if(!stackBracket.isEmpty()) System.out.print(", ");
            }
            System.out.println();
        }
        return check;
    }
    private void popAndCheck(char chInput, int indexCh, StackBracket stackBracket){
        char chStack = stackBracket.pop();
        if(     (chInput == ')' && chStack != '(') ||
                (chInput == ']' && chStack != '[') ||
                (chInput == '}' && chStack != '{')){
            check = false;
            System.out.println("Error, closing bracket does not match: " + chInput + " at " + indexCh);
        }
    }
}

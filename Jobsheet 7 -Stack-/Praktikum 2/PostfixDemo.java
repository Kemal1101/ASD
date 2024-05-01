public class PostfixDemo {

    public static boolean isOperand(char c){
        return ((c >= 'A' && c <= 'Z') ||
         (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || 
         c == ' ' || c == '.');
    }

    public static boolean isOperator (char c){
        return (c == '^' || c == '%' || c == '/' || c == '*' || 
        c ==  '-' || c == '+');
    }

    public static int getDerajat (char c){
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public static String konversi (String infix){
        Stack operators = new Stack(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length() ; i++){
            c = infix.charAt(i);

            if (isOperand(c)){
                postfix = postfix + c;
            }else if (c == '('){
                operators.push(c);
            }else if (c == ')'){
                while (operators.peek() != '('){
                    postfix = postfix + operators.pop();
                }

                operators.pop();
            }else if (isOperator(c)){
                while (getDerajat(operators.peek()) >= getDerajat(c)){
                    postfix = postfix + operators.pop();
                }

                operators.push(c);
            }

        }
        while (!operators.isEmpty()) {
            postfix += operators.pop();
        }
        return postfix;
    }

    public static int hasil(String postfix){
        int [] stackAngka = new int[postfix.length()];
        int top = - 1;
        
        for (int i = 0; i < postfix.length() ; i++){
            char c = postfix.charAt(i);

            if (Character.isDigit(c)){
                top++;
                stackAngka[top] = c - '0';
            }else {
                int operand2 = stackAngka [top--];
                int operand1 = stackAngka[top--];

                switch (c) {
                    case '+':
                        stackAngka[++top] = operand1 + operand2;
                        break;
                    case '-':
                        stackAngka[++top] = operand1 - operand2;
                        break;
                    case '*':
                        stackAngka[++top] = operand1 * operand2;
                        break;
                    case '/':
                        stackAngka[++top] = operand1 / operand2;
                        break;
                }
            }
        }
        return stackAngka[top];
    }

    public static void main(String[] args) {
        String infix = "5*4+3";
        System.out.println("Infix: " + infix);
        String postfix = konversi(infix);
        System.out.println("Postfix: " + postfix);
        int hasilnya = hasil(postfix);
        System.out.println(hasilnya);
    }
}

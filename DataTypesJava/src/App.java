
/**
 *  o programa apenas apresenta valores de acordo com a espeficificação de seus tipos declarados. 
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println("********************");
        System.out.println("*  Data Types Java *");
        System.out.println("********************");
   
        int num01 = 3;
        float num02 = 3.1f;
        double num03 = 3.4; 
        String name = "Eder";
        char letter =  'E';
         
        System.out.printf("-> o valor inteiro é: %d\n", num01);
        System.out.printf("-> o valor float é: %f\n", num02);
        System.out.printf("-> o valor double é: %f\n", num03);
        System.out.printf("-> o valor de String é: %s\n", name);
        System.out.printf("-> o valor de char é: %c\n", letter);
    }
}
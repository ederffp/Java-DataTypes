<h1>Codigo exemplo 01 Java</h1>

```java
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
```

<h2> Descrição: </h2>

- Em java a 1ª coisa a ser feita é criar a classe principal do programa, no caso acima denominamos ela como <u><b>public class App</b></u>
- Não se assuste, parece ser grande, mas a 2º coisa que observamos é que logo declaramos o metodo principal do nosso programa, o metodo <u><b>Main</b></u>
- Depois veja que utilizamos <u><b>System.out.println()</b></u> isso nada mais é que estamos usando o recursos da classe <b>System</b> que tem como metodo <b>println()</b> que tem finalidade de imprimir na tela alguma coisa.
- Logo abaixo nos deparamos conm nada mais nada menos que a declaração e inicialização de alguns tipos de variaveis <b>int</b>,<b>float</b>,<b>double</b>,<b>String</b>,<b>Char</b>.
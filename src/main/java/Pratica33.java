import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        Matriz a = new Matriz(3, 2);
        Matriz b = new Matriz(2, 3);        
        
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        
        double[][] m2 = a.getMatriz();
        m2[0][0] = 5.0;
        m2[0][1] = 5.0;
        m2[1][0] = 5.0;
        m2[1][1] = 5.0;
        m2[2][0] = 5.0;
        m2[2][1] = 5.0;
        
        double[][] m3 = b.getMatriz();
        m3[0][0] = 5.0;
        m3[0][1] = 5.0;
        m3[0][2] = 5.0;
        m3[1][0] = 5.0;
        m3[1][1] = 5.0;
        m3[1][2] = 5.0;
                      
        Matriz transp = orig.getTransposta();
        System.out.println("Matriz Original: " + orig);
        System.out.println("Matriz transposta: " + transp);
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.println( orig.soma(a) );        
        System.out.println( orig.prod(b) );
        
    }
}

package ejercicios_clase;


public class Matematicas {

    public static void SegundoGrado (int a, int b, int c, MyDouble resultado1, MyDouble resultado2){

       double raiz;
       int aux = ((b*b) - 4*a*c);



       if(aux > 0) {
           raiz=  Math.sqrt(aux);
               resultado1.setD1((-b + raiz) / 2 * a);
               resultado2.setD1((-b - raiz) / 2 * a);

       } else {
           resultado1 = null;
           resultado2 = null;
       }

    }
    public static double Factorial (int num){
        double fact = 1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;

    }


    public static void Seno(double x, int precision, MyDouble resultado ){

        double aux = 0;
        int y = 1;
        int signo = 1;

        for(int i=1;i<=precision;i++) {
            double aa = Factorial(y);
            double bb = Math.pow(x,y);
            aux = aux + (signo*(Math.pow(x,y) / Factorial(y)));

            signo = -signo;
            y = y+2;

        }
    resultado.setD1(aux);
    }
}
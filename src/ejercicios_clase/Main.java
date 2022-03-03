package ejercicios_clase;

public class Main {

    private static MyDouble d1;

    public static void main(String[] args) {
	// write your code here


        MyDouble d1 = new MyDouble(0.0);
        MyDouble d2 = new MyDouble(0.0);
        MyDouble d3 = new MyDouble(0.0);


        Matematicas.SegundoGrado(1,4,3, d1, d2);
        System.out.println(d1.toString() +  " y " + d2.toString());

        //System.out.println(d1.toString());
        Matematicas.Seno(5.0 ,50, d3);
        System.out.println(d3.getD1());


    }
}

import java.util.Scanner;

public class main2 {

    static int n=0;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = ingresarValor("Cantidad de numeros", s);
        n++;
        Object num[] = new Object[n];
        for(int i=1; i<num.length; i++){
            if(i%3==0 && i%5==0){
                System.out.println("VINCLE");
                num[i] = "VINCLE";
            }else if(i%3==0){
                System.out.println("VIN");
                num[i] = "VIN";
            }else if(i%5==0){
                System.out.println("CLE");
                num[i]="CLE";
            }else{
                System.out.println(i);
                num[i]=i;
            }
        }

        imprimirVector(num);
    }

    private static void imprimirVector(Object[] num) {
        System.out.println("\n ==== imprimir en array ==== \n");
        for(int j =1;j<num.length;j++){
            System.out.print(num[j]+";\t");
        }
    }

    private static int ingresarValor(String texto, Scanner s) {
        System.out.println(texto);
        int y = s.nextInt();
        return y;
    }
}

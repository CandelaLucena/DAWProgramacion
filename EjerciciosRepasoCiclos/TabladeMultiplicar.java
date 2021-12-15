//?

public class TabladeMultiplicar {
    public static void main(String[] args) {
        int numero = 1;
        for (int j = 0; j < 10; j++) {
            for (int i = 1; i <= 10; i++) {
                if((numero*i<10)&&(numero*i!=100)){ 
                    System.out.print("  "+numero*i+" ");
                }else if(numero*i==100){
                    System.out.print(""+numero*i+" ");
                }else{
                    System.out.print(" "+numero*i+" ");
                }
             
            }
            System.out.println();
            numero++;
        }
    }
}

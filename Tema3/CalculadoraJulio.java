public class CalculadoraJulio {
    public static void main(String[] args) {
        String linea;
        
        if(esOperacion(linea)){
                
        }else{
            System.out.println("Operación inválida");
        }
        
    }

    public static boolean esOperacion(String linea) {
        String [] elementos = Utilidades.dividirEnPalabras(linea);

        if(elementos.length == 3){
            if (isDouble(elementos[0]) &&
                isOperator(elementos[1]) &&
                isDouble(elementos[2])){

            }
        }else{
            return false;
        }
    }

    public static boolean esFin(String linea) {
        String minusculas = linea.toLowerCase();
        if(minusculas.equals("fin")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isOperator(String operator){
        switch(operator){
            case "+":
            case "-":
            case "x":
            case "X":
            case "/":
            case "*":
        }
    }
}

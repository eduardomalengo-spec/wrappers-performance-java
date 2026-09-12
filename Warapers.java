public class Warapers {
    public static void main(String[] args) {
        
        String[] frutas = {"[1 - BANANA]", "[2 - UVA]", "[3 - MAÇÃ]"};
        Double[] valores_decimais = {1.2, 45.6, 45.7};
        Integer[] valores_naturais = {1,2,3,4,5};
        
        // criando lista
        
        
        for(String Frutas : frutas) {
            System.out.println(Frutas + ": ");
        }
        for(Double Valores : valores_decimais) {
            System.out.println(Valores + ": ");
        }
        for(Integer Vals : valores_naturais) {
            System.out.println(Vals + ": ");
        }
        //acessando valor
        String v_m = frutas[1];
        System.out.println(v_m + ": ");
        
        Double vls = valores_decimais[1];
        System.out.println(vls + ": ");
        
        
        //manipulando valor
        frutas[1] = "[1 - EDU]";
        System.out.println(frutas[1]);
        
        valores_decimais[1] = 3.8;
        System.out.println(valores_decimais[1] + ": ");
        
        
    }
}
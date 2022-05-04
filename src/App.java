public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int ii = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(ii);
            ii++;
        }while(ii < 5);

        i = 0;
        for (i=0; i<5; i++){
            System.out.println(i);
            //se metto if == 4 con break si ferma a 4
            //con continue quando arriva a 4 salta a 5
        }
        int[] numeri = {10, 20, 30, 40, 50};
        for (int numero: numeri){
            System.out.println(numero);
        }

    }
}

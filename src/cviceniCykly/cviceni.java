package cviceniCykly;

public class cviceni {
    public static void main(String[] args) {
        //cviceni1
        int n = 3;
        int cislo = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n;j++){
                System.out.print(cislo+"\t");
                cislo++;
            }
            System.out.println();
        }

        //cviceni2
        int [] pole = {0,2,3,0,6,0,0,4};
        int celkoveNul = 0;
        for (int cisla:pole){
            if (cisla==0){
                celkoveNul++;
            }
        }
        System.out.println("v poli jsou celkove "+celkoveNul+" nuly");

        //cviceni3
        int nahodneCislo = 0;
        do{
            nahodneCislo = (int) (Math.random()*6)+1;
            System.out.println(nahodneCislo);
        }while (nahodneCislo != 6);

        //cviceni4
        int faktorialoveCislo = 5;
        if (cislo < 0){
            System.out.println("zaporne cislo nemuze mit faktorial");
        } else if (cislo > 50) {
            System.out.println("cislo je prilis velke");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= faktorialoveCislo; i++){
                faktorial = faktorial*i;
            }
            System.out.println("faktorial cisla "+faktorialoveCislo+" je "+faktorial);
        }

        //cviceni5
        int pocet = 3;
        if (pocet < 0){
            System.out.println("cislo musi byt kladne");
        }else {
            for (int i = 1; i <= pocet; i++){
                int mocniny = i*i;
                System.out.println(i+"x"+i+" = "+mocniny);
            }
        }
        //coment
    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String [] jautajumi = {
        // 1. jautājums
        "Kas ir priekšnosacījuma cikls Java valodā?\n",
        // 2. jautajums
        "Ko izvadīs šis kods?\n\nint i = 0;\nwhile (i < 3){\nSystem.out.println(i);\ni++;\n}\n",
        // 3. jautājums
        "Kāds ir galvenais nosacījums while cikla darbībai?\n",
        // 4. jautājums
        "Ko dara šis cikls?\n\nint i = 5;\nwhile (i > 0) {\nSystem.out.println(i);\ni--;\n}\n",
        // 5. jautājums
        "Kurā brīdī tiek pārbaudīts while cikla nosacījums?\n",
        // 6. jautājums
        "Ko darīs šis kods?\n\nint i = 0;\nwhile (i < 5) {\nSystem.out.println(\"Java\");\n}\n",
        // 7. jautājums
        "Kāds būs rezultāts?\n\nint i = 10;\nwhile (i < 5) {\nSystem.out.println(i);\ni++;\n",
        // 8. jautājums
        "Kā pareizi uzrakstīt while ciklu, kas izvada skaitļus no 1 līdz 3( pieņemot, ka i = 1)?\n",
        // 9. jautājums
        "Kura no šīm izvēlēm var izraisīt bezgalīgu ciklu?",
        // 10. jautājums
        "Kas notiks ja while cikla nosacījums vienmēr būs patiess?"
        };
        
        int[] pareizasAtbildes = {3, 2, 2, 1, 3, 2, 3, 3, 3, 3};

        String atbilzuIespejas[][] = {
        // 1. jautājums
        {"A) for", "B) do-while", "C) while", "D) switch"},
        // 2. jautājums
        {"A)123","B)012","C) 0123","D)false"},
        // 3. jautājums
        {"A) Cikls vienmēr izpildās vismaz vienu reizi", "B) Cikls izpildās tikai tad, ja nosacījums ir patiess", "C) Cikls beidzas automātiski pēc trim reizēm", "D) Nosacījums tiek pārbaudīts cikla beigās"},
        // 4. jautājums
        {"A) Izvada skaitļus no 5 līdz 1", "B) Izvada skaitļus no 1 līdz 5", "C) Cikls nekad neizpildās", "D) Izvada skaitļus no 0 līdz 5"},
        // 5. jautājums
        {"A) Pēc cikla izpildes", "B) Koda sākumā", "C) Pirms katras iterācijas", "D) Tikai vienereiz "},
        // 6. jautājums
        {"A) Izdrukās Java 5 reizes", "B) Izdrukās Java bezgalīgas reizes", "C) Izvadīs Java 1 reizi", "D) Cikls izpildīsies vienu reizi"},
        // 7. jautājums
        {"A) 10", "B) 10 līdz 5", "C) Nekas", "D) Projekts neies"},
        // 8. jautājums
        {
            "A) while (i <= 3) {\ni++;\nSystem.out.println(i);\n}",
            "B) while (i < 3) {\nSystem.out.println(i);\ni++;\n}",
            "C) while (i < 4) {\nSystem.out.println(i);\ni++;\n}",
            "D) while (i > 0) {\nSystem.out.println(i);\ni--;\n}"
          },
        // 9. jautājums
        {
            "\nA) Palielinot skaitītāju cikla beigās",
            "B) Mainot nosacījumu cikla laikā",
            "C) Nenodrošinot nosacījuma izmaiņu ciklā",
            "D) Lietojot for ciklu"
        },
        // 10. jautājums
        {
            "\nA) Cikls tiks izpildīts tikai vienreiz",
            "B) Tiks izvadīta kļūda kompilēšanas laikā",
            "C) Programma izpildīs ciklu bezgalīgi",
            "D) Cikls netiks izpildīts vispār"
        }};

        // Pareizās atbildes
       

        int[] lietotajaAtbildes = new int[10];

        Integer seciba[] = new Integer[jautajumi.length];
        for(int i = 0; i < jautajumi.length; i++) {
            seciba[i] = i;
        }
        //Sajauc jautajumus
        Collections.shuffle(Arrays.asList(seciba));


        //Sajauc atbilžu iespējas
        String[] sajauktiJautajumi = new String[jautajumi.length];
        String[][] sajauktasAtbildes = new String[jautajumi.length][];
        for(int i = 0; i<seciba.length; i++){
            sajauktiJautajumi[i] = jautajumi[seciba[i]];
            sajauktasAtbildes[i] = atbilzuIespejas[seciba[i]];
        }
        int punkti = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(sajauktiJautajumi[i]);
            for(int j = 0; j<4; j++){
                System.out.println(sajauktasAtbildes[i][j]);
            }
                do{
                    System.out.print("Atbilde (1-4): ");
                    lietotajaAtbildes[i] = sc.nextInt();
                }while(lietotajaAtbildes[i] < 1 || lietotajaAtbildes[i] > 4);

                if(lietotajaAtbildes[i] == pareizasAtbildes[seciba[i]]){
                    punkti++;
                    System.out.println("Pareizi! +1 punkts");
                } else {
                    System.out.println("Garaam");
                }
            System.out.println("-----------------------------------");
        }
        System.out.println("Jūsu rezultāts : "+punkti+" punkti no 10");
    }
}
import java.util.Arrays;
import java.util.Collections;


import javax.swing.JOptionPane;

public class Tests {
    public static void main(String[] args) {
        
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
        {"1) for", "2) do-while", "3) while", "4) switch"},
        // 2. jautājums
        {"1)123","2)012","3) 0123","4)false"},
        // 3. jautājums
        {"1) Cikls vienmēr izpildās vismaz vienu reizi", "2) Cikls izpildās tikai tad, ja nosacījums ir patiess", "3) Cikls beidzas automātiski pēc trim reizēm", "4) Nosacījums tiek pārbaudīts cikla beigās"},
        // 4. jautājums
        {"1) Izvada skaitļus no 5 līdz 1", "2) Izvada skaitļus no 1 līdz 5", "3) Cikls nekad neizpildās", "4) Izvada skaitļus no 0 līdz 5"},
        // 5. jautājums
        {"1) Pēc cikla izpildes", "2) Koda sākumā", "3) Pirms katras iterācijas", "4) Tikai vienereiz "},
        // 6. jautājums
        {"1) Izdrukās Java 5 reizes", "2) Izdrukās Java bezgalīgas reizes", "3) Izvadīs Java 1 reizi", "4) Cikls izpildīsies vienu reizi"},
        // 7. jautājums
        {"1) 10", "2) 10 līdz 5", "3) Nekas", "4) Projekts neies"},
        // 8. jautājums
        {
            "1) while (i <= 3) {\ni++;\nSystem.out.println(i);\n}",
            "2) while (i < 3) {\nSystem.out.println(i);\ni++;\n}",
            "3) while (i < 4) {\nSystem.out.println(i);\ni++;\n}",
            "4) while (i > 0) {\nSystem.out.println(i);\ni--;\n}"
          },
        // 9. jautājums
        {
            "\n1) Palielinot skaitītāju cikla beigās",
            "2) Mainot nosacījumu cikla laikā",
            "3) Nenodrošinot nosacījuma izmaiņu ciklā",
            "4) Lietojot for ciklu"
        },
        // 10. jautājums
        {
            "\nA) Cikls tiks izpildīts tikai vienreiz",
            "2) Tiks izvadīta kļūda kompilēšanas laikā",
            "3) Programma izpildīs ciklu bezgalīgi",
            "4) Cikls netiks izpildīts vispār"
        }};

        // Pareizās atbildes
       JOptionPane.showMessageDialog(null, "Sveiki, šis ir 10 jautājumu tests, uz jautājumiem jāatbild ar cipariem no 1 līdz 4,lai veicas ;D", null, JOptionPane.INFORMATION_MESSAGE);

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
        //Izveido String mainīgo, lai salabātu nepareizās atbildes
        String []nepareizi = new String[jautajumi.length];
        

        for(int i = 0; i < 10; i++){
            //strings ko parada JOptionPane
            String stringParadit = "";
            //pievieno jautajumu
            stringParadit += sajauktiJautajumi[i]+ "\n";

            for(int j = 0; j<4; j++){
                //basically saliek visas iespejamas atbilde uz jautajumu, lai paraditu JOptionPane
                stringParadit += sajauktasAtbildes[i][j] + "\n"; 
            }
            stringParadit += "\n\nLūdzu atbildiet ar cipariem no 1 līdz 4";
            //Parada  jautajumu un atbildi JOptionPane
            boolean der = false;
            int prostMainigais = 0;
            do {
                try {
                    String ievade = JOptionPane.showInputDialog(null, stringParadit, "Jautājums " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
                    //ja ievade nav tukša un nav null
                    if (ievade != null && !ievade.trim().isEmpty()) {
                        prostMainigais = Integer.parseInt(ievade.trim());
                        //parbauda vai skaitlis ir diapazona no 1 lidz 4
                        if (prostMainigais >= 1 && prostMainigais <= 4) {
                            lietotajaAtbildes[i] = prostMainigais;
                            der = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Lūdzu ievadiet skaitli no 1 līdz 4", "Kļūda", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ievade nevar būt tukša", "Kļūda", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Lūdzu ievadiet skaitli no 1 līdz 4", "Kļūda", JOptionPane.ERROR_MESSAGE);
                }
            } while (!der);

            //Parbauda vai lietotaja atbilde ir pareiza
            if(lietotajaAtbildes[i] == pareizasAtbildes[seciba[i]]){
                punkti++;
            } else {
                if (nepareizi[i] == null) nepareizi[i] = "";
                    nepareizi[i] += "\n" + (i + 1) + ". jautājums:\n" + sajauktiJautajumi[i] + 
                                            "\nJūs atbildējāt : " + lietotajaAtbildes[i] + "\n" + sajauktasAtbildes[i][lietotajaAtbildes[i] - 1] + "\n" +
                                    "Pareizā atbilde bija : " + sajauktasAtbildes[i][pareizasAtbildes[seciba[i]] - 1] + "\n";

                }
            System.out.println("-----------------------------------");
        }
        JOptionPane.showMessageDialog(null, "Jūsu rezultāts : "+punkti+" punkti no 10");
        for(int i = 0; i< nepareizi.length; i++){
            if (nepareizi[i] != null && !nepareizi[i].trim().isEmpty())
                JOptionPane.showMessageDialog(null, nepareizi[i], "Nepareizā atbilde", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Paldies par spēlēšanu!", "Spēle beigusies", JOptionPane.INFORMATION_MESSAGE);
    }
}
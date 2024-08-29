package org.automation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        System.out.print("Iam Adelle!");
        System.out.print("Iam Adelle!");
        System.out.print("Iam Adelle!");

        int a = 10; // variable abu, belum dipakai. Kalau putih udah dipakai.
        int b = 5;
        float c = 3;
        String name = "Adelyas";
        char q = 'Y';
        boolean flag = false; // True

        // Arithmetic Operation
        int result = a/b;
        int result2 = (int) (a+c);
        float result3 = a+c;
        System.out.println("Bagi "+result);
        System.out.println("Tambah "+result2);
        System.out.println("Float "+result3);
// Absensi
        System.out.println("ABSENSI");
        int timeStart = 9;
        int timeFinish = 18;
        int waktuMasuk = 10;
        int waktuPulang = 17;

        if(waktuMasuk <= timeStart & waktuPulang >= timeFinish){
            System.out.println("Keren");
            System.out.println("Kok mauuu");
        }
        else {
            System.out.println("Kerenn");
        }




        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }


        // Loop and Nested Loop
        for(int i =1;i<10;i=i+2)
        {
           if (i==7)
           {
               break;
           }
           System.out.println("Outer Loop "+i);
           for(int j=0;j<=5;j++)
           {
               System.out.println(j+1);
           }
        }
    }
}
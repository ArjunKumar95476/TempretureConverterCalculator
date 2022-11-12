import java.util.Scanner;
public class TempretureConverter {
    public static void TempConvert()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n\n============>> TEMPRETURE CONVERTER PROGRAM <<============\n\n");
        double celcius;
        double fahrenhite;
        double kelvin;
        double rankine;
        int button;
        byte repeat_value;
        do
        {
        System.out.println("4 UNIT FOR CALCULATE TEMPRETURE \n\n CELCIUS \n FAHRENHITE \n KELVIN \n RANKINE\n");
        System.out.println("\nPRESS BUTTON FOR CORRESPONDING OPERATION \n\n FAHRENHITE ===> 1\n CELCIUS ======> 2 \n KELVIN =======> 3 \n RANKINE ======> 4\n");
        System.out.println("PRESS BUTTON : ");
        button=scanner.nextInt();
        switch(button)
        {
            case 1:
            System.out.print("TEMPRETURE IN FAHRENHITE(F):");
            fahrenhite=scanner.nextDouble();
            System.out.println();
            kelvin=(float)5/9*(fahrenhite-32)+273.15;
            celcius=(float)5/9*(fahrenhite-32);
            rankine=fahrenhite+459.67;
            System.out.println("WHEN FAHRENHITE(F) = "+fahrenhite+" F THEN \nCELCIUS(C) = "+celcius+" C \nKELVIN(K) = "+kelvin+" K \nRANKINE(R) = "+rankine+" R");
            System.out.println("\n============================================================\n\n");
            break;
            case 2:
            System.out.print("TEMPRETURE IN CELCIUS(C):");
            celcius=scanner.nextDouble();
            System.out.println();
            fahrenhite=(float)9/5*celcius+32;
            kelvin=celcius+273.15;
            rankine=(float)9/5*celcius+32+459.67;
            System.out.println("WHEN CELCIUS(C) = "+celcius+" C THEN \nFAHRENHITE(F) = "+fahrenhite+" F \nKELVIN(K) = "+kelvin+" K \nRANKINE(R) = "+rankine+" R");
            System.out.println("\n============================================================\n\n");
            break;
            case 3:
            System.out.print("TEMPRETURE IN KELVIN(K):");
            kelvin=scanner.nextDouble();
            System.out.println();
            fahrenhite=(kelvin-273.15)*(float)9/5+32;
            celcius=kelvin-273.15;
            rankine=(kelvin-273.15)*(float)9/5+32+459.67;
            System.out.println("WHEN KELVIN(K) = "+kelvin+" K THEN \nFAHRENHITE(F) = "+fahrenhite+" F \nCELCIUS(K) = "+celcius+" C \nRANKINE(R) = "+rankine+" R");
            System.out.println("\n============================================================\n\n");
            break;
            case 4:
            System.out.print("TEMPRETURE IN RANKINE(R):");
            rankine=scanner.nextDouble();
            System.out.println();
            fahrenhite=rankine-459.67;
            celcius=(float)5/9*(rankine-459.67-32);
            kelvin=(rankine-459.67-32)*5/9+273.15;
            System.out.println("WHEN RANKINE(R) = "+rankine+" R THEN \nFAHRENHITE(F) = "+fahrenhite+" F \nCELCIUS(K) = "+celcius+" C \nKELVIN(K) = "+kelvin+" K");
            System.out.println("\n============================================================\n\n");
            break;
            default:
            System.out.println("INVALID BUTTON CHOICE!!");

        }
        System.out.println("DO YOU WANT TO CONTINUE THIS PROGRAM THEN PRESS 1 ELSE 0 !!!");
        repeat_value=scanner.nextByte();
        System.out.println("\n=================================================");
    }while(repeat_value!=0);
     System.out.println("PROGRAM END !!! THANKS!!!");
    }
    public static void main(String[] args) {
        TempConvert();
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        // Program title
        
        System.out.println("Enter your 8 GPA credits from 9th grade");
        double dub1 = scan.nextDouble();
        double dub2 = scan.nextDouble();
        double dub3 = scan.nextDouble();
        double dub4 = scan.nextDouble();
        double dub5 = scan.nextDouble();
        double dub6 = scan.nextDouble();
        double dub7 = scan.nextDouble();
        double dub8 = scan.nextDouble();
        
        double freshmanTotal = dub1+dub2+dub3+dub4+dub5+dub6+dub7+dub8;
        double freshmanAverage = (freshmanTotal)/8;
        System.out.println("Your current GPA as a freshman is " + freshmanAverage);
        
        System.out.println("Do you want to enter your sophomore credits? Type Yes or No");
        String input1 = scan.next();
        if(input1.equals("Yes"))
        {
        System.out.println("Enter your 8 GPA credits from 10th grade");
        double second1 = scan.nextDouble();
        double second2 = scan.nextDouble();
        double second3 = scan.nextDouble();
        double second4 = scan.nextDouble();
        double second5 = scan.nextDouble();
        double second6 = scan.nextDouble();
        double second7 = scan.nextDouble();
        double second8 = scan.nextDouble();
        double sophomoreTotal = second1+second2+second3+second4+second5+second6+second7+second8;
        double upToSophomoreAverage = (sophomoreTotal+freshmanTotal)/16;
        
        System.out.println("Your current GPA as a Sophomore is: " + upToSophomoreAverage);
            
        System.out.println("Do you want to enter your junior credits? Type Yes or No");
        String input2 = scan.next();
        
        if(input2.equals("Yes"))
        {
        System.out.println("Enter your 8 GPA credits from 11th grade");
        double third1 = scan.nextDouble();
        double third2 = scan.nextDouble();
        double third3 = scan.nextDouble();
        double third4 = scan.nextDouble();
        double third5 = scan.nextDouble();
        double third6 = scan.nextDouble();
        double third7 = scan.nextDouble();
        double third8 = scan.nextDouble();
        
        double juniorTotal = third1+third2+third3+third4+third5+third6+third7+third8;
        double upToJuniorAverage = (freshmanTotal+sophomoreTotal+juniorTotal)/24;
        
        System.out.println("Your junior GPA is: " + upToJuniorAverage);
        
        System.out.println("Do you want to enter your senior credits? Type Yes or No");
        String input3 = scan.next();
        
        if(input3.equals("Yes"))
        {
        System.out.println("Enter your 8 GPA credits from 12th grade");
        double fourth1 = scan.nextDouble();
        double fourth2 = scan.nextDouble();
        double fourth3 = scan.nextDouble();
        double fourth4 = scan.nextDouble();
        double fourth5 = scan.nextDouble();
        double fourth6 = scan.nextDouble();
        double fourth7 = scan.nextDouble();
        double fourth8 = scan.nextDouble();
        
        double seniorTotal = fourth1+fourth2+fourth3+fourth4+fourth5+fourth6+fourth7+fourth8;
        double upToSeniorAverage = (freshmanTotal+sophomoreTotal+juniorTotal+seniorTotal)/32;
        
        System.out.println("Your current GPA as a senior is: " + upToSeniorAverage);
        }
        
        
        
    }
        }
    }
}
    


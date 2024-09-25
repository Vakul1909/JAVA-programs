import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class progtable {
    import java.util.Scanner;

public class progtable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i * n);
        }
    }
}
    
}

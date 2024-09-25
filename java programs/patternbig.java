public class patternbig {
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i=i+1){
            for(int j=1; j<=i; j=j+1){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j=j+1){
                System.out.print("*");
            }
            for(int j=1; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            } 
                
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            } 
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<n-i; j++){
                System.out.print("*");
            }
            
           
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<n-i; j++){
                System.out.print("*");
            }


            System.out.println();

        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n+7; i++){
            System.out.print("* ");
        }
        System.out.println();

    }
    
}

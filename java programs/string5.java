public class string5 {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("Tomy");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'R');
        System.out.println(sb);
        sb.insert( 0,'A');
        System.out.println(sb);
        sb.insert(3,'m');
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);
        StringBuilder sb2= new StringBuilder("t");
        sb2.append("o");
        sb2.append("m");
        sb2.append("y");
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
    
}

public class Constants {
    final static double VAT = 0.23; // ποσοστό ΦΠΑ
    
    public static void main(String[] args) {
        final double REDUCTION;
        REDUCTION = 0.15; // 15% έκπτωση
        
        double price = 60.0; // 60€ καθαρή αξία
        double ppv = price + price * VAT;
        double pay = ppv - ppv * REDUCTION;
        System.out.println("Καθαρή αξία: "+price);
        System.out.println("Aξία + ΦΠΑ: "+ppv);
        System.out.println("Πληρωτέο μετά την έκπτωση: "+pay);
    }
    
}
public class EqualsNull {
    public static void main(String[] args) {
        // Δημιουργούμε το πρώτο μωρό
        Baby george1 = new Baby("George", true);
        // Δημιουργούμε το δεύτερο μωρό
        Baby george2 = new Baby("George", true);

        Baby george3 = null;

        // Συγκρίνουμε τα δυο αντικείμενα
        System.out.println(george1.equals(george2));
        // Συγκρίνουμε τα δυο αντικείμενα
        System.out.println(george1.equals(george3));
        // Συγκρίνουμε τα δυο αντικείμενα
        System.out.println(java.util.Objects.equals(george3, george1));
        System.out.println(java.util.Objects.equals(george1, george3));
        System.out.println(george1.equals(george3));
        // Αυτό όμως αποτυγχάνει με NullPointerException
        System.out.println(george3.equals(george1));

        // Τι θα εμφανίσει;
  }

}

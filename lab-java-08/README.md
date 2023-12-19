### Εργαστήριο #8 - Διαχείριση εξαιρέσεων
___
Σκοπός του όγδοου εργαστηρίου είναι να εξοικειωθείτε με βασικά στοιχεία της γλώσσας προγραμματισμού Java: Διαχείριση εξαιρέσεων.  
Οι ασκήσεις αυτής της εβδομάδας είναι self-paced και υλοποιούνται μέσω του codecheck.  
Δεν υπάρχει αυτοαξιολογούμενη άσκηση προς υποβολή.

___
#### Ασκήσεις εξάσκησης ####


1. ![EASY](https://github.com/riggas-ionio/java/blob/master/img/c5f015.png) `EASY`
    Συμπληρώστε την υλοποίηση της `add(String a, String b)` έτσι ώστε αν κάποια από τις παραμέτρους δεν αναπαριστά αριθμητικά ψηφία να χρησιμοποιεί την τιμή `0` στη θέση της κατά τον υπολογισμό του αθροίσματος. Αν μια παράμετρος δεν αναπαριστά αριθμητικά ψηφία, τότε κατά την εκτέλεση του `Integer.parseInt` προκύπτει `NumberFormatException`.   
    _Hint_: θα πρέπει να ελέγξετε δύο φορές ξεχωριστά για κάθε παράμετρο.  
    _Hint_: με βάση όσα είπαμε στη θεωρία αυτή η τμηματική προστασία του κώδικα με πολλαπλά `try..catch` και αυθέρετη επιλογή τιμών σε περίπτωση σφάλματος δεν είναι η ενδεδειγμένη πρακτική, θεωρήστε την άσκηση απλά εισαγωγή στη χρήση exceptions.  
    https://codecheck.io/files/wiley/codecheck-bj-4-io-104

2. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Συμπληρώστε τον κώδικα της κλάσης `BankAccount` έτσι ώστε να μην επιτρέπει να δημιουργηθούν αντικείμενα της κλάσης με αρνητική αρχική κατάθεση ή αρνητικό επιτόκιο.  
    Hint: Από τη στιγμή που καλείται ένας constructor ο μόνος τρόπος να _μη_ δημιουργηθεί το αντικείμενο είναι η έγερση μιας εξαίρεσης. Προτεινόμενος τύπος εξαίρεσς εδώ ο `IllegalArgumentException`.     
    https://codecheck.io/files/wiley/codecheck-bjlo-1-io-103

2. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Συμπληρώστε τον κώδικα της κλάσης `Vehicle` έτσι ώστε να μην επιτρέπει να δημιουργηθούν αντικείμενα της κλάσης αν ο τύπος του οχήματος είναι `truck` και το πλήθος των τροχών μικρότερο του 4 ή αν ο τύπος του οχήματος είναι `motorcycle` και ο αριθμός των τροχών διάφορος του 2.    
    https://codecheck.io/files/wiley/codecheck-bj-4-io-109

3. ![HARD](https://github.com/riggas-ionio/java/blob/master/img/f03c15.png) `HARD`
    Δημιουργήστε μια κλάση με όνομα `IllegalNumberOfWheels` η οποία αναπαριστά μια εξαίρεση. Η εξάιρεση αυτή πετιέται από την κλάση `Vehicle` όταν επιχειρείται να δημιουργηθεί ένα μη έγκυρο όχημα. Η κλάση σας πρέπει να έχει δύο κατασκευαστές, ένα no argument constructor και ένα ακόμη που λαμβάνει παράμετρο ένα `String` που περιέχει ένα μήνυμα σχετικά με την αιτία της εξαίρεσης.   
    _Hint_: για να είναι η κλάση `IllegalNumberOfWheels` εξαίρεση τι πρέπει να ισχύει για αυτή;  
    https://codecheck.io/files/wiley/codecheck-bj-4-io-110

#### Ασκήσεις εξάσκησης (στην εβδομάδα 6) ####

1. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Υλοποιήστε στην κλάση `Word`, η οποία αναπαριστά μια λέξη, το `interface Doublable`. Το interface αυτό περιέχει μία μόνο μέθοδο που διπλασιάζει το μέλος δεδομένων της κλάσης που το υλοποιεί. Αν πχ στην περίπτωση της κλάσης `Word` το μέλος δεδομένων `private String text` περιέχει την τιμή `Hello` μετά την εκτέλεση της `makeDouble()` θα πρέπει να περιέχει την τιμή `HelloHello`.  
    https://codecheck.io/files/wiley/codecheck-bj-4-inter-103

1. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Συμπληρώστε την υλοποίηση της κλάσης `CarMuseum` και υλοποιήστε το `interface Measurable`. Ο κατασκευαστής της κλάσης θα πρέπει να επεξεργάζεται τη `String` παράμετρο και κάθε **μοναδικό** τύπο οχήματος που συναντά (σπάζοντας το `String` στα κόμματα) να το εισάγει στο σχετικό `ArrayList<String>`. Η μέθοδος που υλοποιεί τη διεπαφή `Measurable` θα πρέπει να επιστρέφει το πλήθος των οχημάτων στη δομή.  
    _Hint_: [String.split javadoc](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String) & και χρησιμοποιήστε το `","` ως regex.  
    https://codecheck.io/files/wiley/codecheck-bj-4-inter-107

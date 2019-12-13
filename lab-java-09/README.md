### Εργαστήριο #9 - Χειρισμός εξαιρέσεων
___
Σκοπός του έννατου εργαστηρίου είναι να εξοικειωθείτε με τη χρήση Java IO streams.

___
#### Άσκηση Α' μέρος####

Να γραφεί μία κλάση με όνομα `FileParser` η οποία να παρέχει τις ακόλουθες public static μεθόδους:

α. `wordCount(String filename)` η οποία επιστρέφει το πλήθος λέξεων του αρχείου εισόδου `filename`. Θεωρήστε διαχωριστικά των λέξεων τα σημεία στίξης κόμμα και τελεία, τα κενά και τις αλλαγές γραμμής.

β. `lineCount(String filename)` η οποία επιστρέφει το πλήθος γραμμών του αρχείου εισόδου `filename`.

γ. `letterCount(String filename)` η οποία επιστρέφει το πλήθος (λατινικών) γραμμάτων του αρχείου εισόδου `filename`.

Να γραφεί και μέθοδος `main` εντός της κλάσης η οποία να καλεί τις τρεις μεθόδους ανάλογα με το πρώτο όρισμα που θα δοθεί και να παρέχει ως filename το δεύτερο όρισμα. Με την ολοκλήρωση κλήσης κάθε μεθόδου να εμφανίζεται στη γραμμή εντολών το αποτέλεσμα.

_Παράδειγματα:_

* `java FileParser –w filename`

    καλεί την wordCount(filename) και επιστρέφει Words: 25

* `java FileParser –ln filename`

    καλεί την lineCount(filename) και επιστρέφει Words: 5
* `java FileParser –lt filename`

    καλεί την letterCount(filename) και επιστρέφει Words: 119

_Βοήθεια:_
http://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html#StringTokenizer(java.lang.String,%20java.lang.String)
http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#charAt(int)

___
#### Άσκηση Β' μέρος####

Σκοπός και του δεύτερου μέρους του δέκατου εργαστηρίου είναι να εξοικειωθείτε με τη χρήση των I/O streams για το Serialization κλάσεων στη Java.

Τροποποιήστε τον κώδικα της κλάσης `Order` του εργαστηρίου 8 έτσι ώστε με την ολοκλήρωση της αλληλεπίδρασης με το χρήστη να αξιοποιεί τη βιβλιοθήκη [Gson](https://github.com/google/gson) ώστε να κάνει serialise τις παραγγελίες που έχει συλλέξει και να τις αποστέλει στο server που εκτελείται με το `server.py` που δίνεται. Για την αποστολή μέσω του δικτύου αξιοποιήστε τη `static` μέθοδο `send` της κλάσης `SocketClient` που επίσης δίνεται, φροντίζοντας να κάνετε κατάλληλο χειρισμό των Exceptions.
(N.B.: Για τη μετατροπή του `Collection` των `Order`s σε JSON `String`, χρησιμοποιήστε τη μέθοδο της βιβλιοθήκης `String GSon.toJson(Object)`, δείτε [εδώ](https://javadoc.io/static/com.google.code.gson/gson/2.8.6/com.google.gson/com/google/gson/Gson.html#toJson(java.lang.Object)))

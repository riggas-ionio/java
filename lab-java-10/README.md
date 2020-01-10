### Εργαστήριο #10 - Unit testing
___
Σκοπός του δέκατου εργαστηρίου είναι να εξοικειωθείτε με την Test-Driven Design (TDD) μεθοδολογία προγραμματιμού.

Σε αυτό το εργαστήριο θα χρησιμοποιήσουμε το JUnit, ένα ανοιχτού κώδικα πλαίσιο ελέγχου κώδικα για τη γλώσσα προγραμματισμού Java.
Το JUnit προωθεί την ιδέα _first testing, then coding_ με βάση την οποία πρώτα ορίζονται τα δεδομένα δοκιμών, τα οποία ορίζουν για μια μονάδα κώδικα ποιο θα πρέπει να είναι το παραγόμενο αποτέλεσμα, και μετά γράφεται ο κώδικας ο οποίος βελτιώνεται μέχρι να περνά τις από πριν ορισμένες δοκιμές. Περισσότερα: [1](https://supportweb.cs.bham.ac.uk/docs/tutorials/docsystem/build/tutorials/junit/junit.html), [2](https://www.tutorialspoint.com/junit/junit_overview.htm), [3](http://enos.itcollege.ee/~jpoial/allalaadimised/junit/JUnit-Programming-Cookbook.pdf)
___
#### Άσκηση ####

Κατεβάστε το JUnit από [εδώ](https://junit.org/junit4/) _(και τα δύο jar αρχεία junit & hamcrest)_ ή απ' ευθείας από [εδώ](https://search.maven.org/remotecontent?filepath=junit/junit/4.13/junit-4.13.jar) & [εδώ](https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar).Το jar αυτό θα πρέπει να υπάρχει στο classpath σας για να εκτελέσετε jUnit tests.

###### 10.1 Hello jUnit ######
Μελετήστε τα `Test01.java` και `Test01Runner.java`, το πρώτο περιέχει τις μεθόδους δοκιμών που θα εκτελέσουμε, το δεύτερο είναι ένας Runner ο οποίος ξεκινά την εκτέλεση των δοκιμών.
Κάνετε `compile` τις δυό κλάσεις και εκετλέστε την `Test01Runner`.

Hint:
* Compile: `$javac -classpath .:junit-4.13.jar *.java`
* Εκτέλεση: `java -classpath .:junit-4.13.jar:hamcrest-core-1.3.jar Test01Runner`

Επεξεργαστείτε το `Test01.java` ώστε να αποτυγχάνει (πχ θέστε result=3) και δοκιμάστε πάλι.

###### 10.2 jUnit & Order + PaymentMethod ######
Σχεδιάστε κατάλληλα σενάρια ελέγχου ώστε να επιβεβαιώσετε την ορθή λειτουργία των Order και PaymentMethod

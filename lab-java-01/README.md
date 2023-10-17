### Εργαστήριο #1 - Εισαγωγή στη Java, τη JVM και το JDK
___
Σκοπός του πρώτου εργαστηρίου είναι να εξοικειωθείτε με τη Java VM, το Java Development Kit στο περιβάλλον επεξεργασίας πηγαίου κώδικα IDE Atom ή στο GoormIDE.

___
#### Προετοιμασία (_πριν το εργαστήριο_) ####

* **[Desktop: Linux/Mac/Windows]** Βεβαιωθείτε ότι στην **επιφάνεια εργασίας** που εργάζεστε είναι εγκατεστημένα και ρυθμισμένα τα ακόλουθα:
    * **Java Virtual Machine & Development Kit**
      * εκτελέστε σε ένα τερματικό την εντολή `java -version`, αν λάβετε απάντηση με ένα αριθμό έκδοσης, τότε η **JVM** είναι εγκατεστημένη
      * εκτελέστε σε ένα τερματικό την εντολή `javac -version`, αν λάβετε απάντηση με ένα αριθμό έκδοσης, τότε το **JDK** (compiler και άλλα εργαλεία) είναι εγκατεστημένο
      * **αν δεν είναι** εγκατεστημένο κάτι από τα δύο (ή είναι σε παλαιότερη έκδοση) κάντε λήψη και εγκατάσταση από: https://adoptopenjdk.net/

    * **Pulsar IDE + packages** (λήψη από: https://pulsar-edit.dev)
      * βεβαιωθείτε ότι είναι εγκατεστημένο το Atom IDE
      * ελέγξτε (από το μενού `Packages > Settings View > Install Packages/Themes`) ότι έχουν εγκατασταθεί τα :
        - script
        - tool-bar
        - tool-bar-atom
        - terminus
        - basic-java-compile
        - autocomplete-java
        - linter-java και dependencies

* **[Cloud]** _Εναλλακτικά_ για το cloud based IDE GoormIDE βεβαιωθείτε ότι έχετε δημιουργήσει ένα java based container, ακολουθώντας τις οδηγίες στις διαφάνειες της πρώτης διάλεξης.
    * Ελέξτε όπως πιο πάνω την ύπαρξης **σωστής έκδοσης** **JVM** και **JDK**.

___
#### Μελέτη (_πριν έρθετε στο εργαστήριο_): ####
* Μελετήστε και εκτελέστε τα παραδείγματα του:  
  https://www.freecodecamp.org/news/command-line-for-beginners/  
  - Σε περιβάλλον linux ή mac εκτελούνται στο terminal
  - Στο cloud IDE goorm εκτελούνται στο παρεχόμενο terminal εντός του browser
  - Σε περιβάλλον win εκτελούνται σε περιβάλλον WLS (Windows Linux Subsystem)
* 😱 Help needed? https://github.com/riggas-ionio/java/discussions

___
#### Ασκήσεις ####
* Στο περιβάλλον codeckeck λύστε το Parsons puzzle `Hello World`:
    https://codecheck.io/files/2210040845ehutdcsp7wbjhky9u663v9xdx  
    * Όταν πετύχετε να κάνετε `compile` την κλάση:
        ![Download from codecheck](codecheck.png)
        1. κάντε **Download** το αποτέλεσμα
        2. μετονομάστε το **στο αριθμητικό μέρος του ΑΜ σας** (πχ `2000123.zip`) και
        3. ανεβάστε το στη μη αξιολογούμενη εργασία της εβδομάδας **στο opencourses**
* Σε όποιο περιβάλλον δουλεύετε (desktop ή GoormIDE):
    * Κατεβάστε αυτό το repo για να έχετε τον κώδικά του (και να λαμβάνεται τον κώδικα των επόμενων εβδομάδων)
        * Προτείνεται να το κατεβάσετε εκτελώντας (_εντός του φακέλου που θα δουλεύετε!!_)  
        `git clone https://github.com/courses-ionio/java.git`  
        Αν η εντολή git δεν είναι εγκατεστημένη στο σύστημά σας:  
        https://www.atlassian.com/git/tutorials/install-git
        * Εναλλακτικά, κατεβάστε όλο το branch ως zip αρχείο (_..αλλά θα πρέπει κάθε εβδομάδα να κάνετε το ίδιο.. :-(_  ) από  
        https://github.com/courses-ionio/java/archive/refs/heads/master.zip
    * Μετακινηθείτε **από το τερματικό** σας στο φάκελο της πρώτης εβδομάδας `lab-java-1`
    * **Aπό το τερματικό** κάνετε `compile` και στη συνέχεια εκτελέστε την κλάση HelloWorld που βρίσκεται στο φάκελο `lab-java-1`.
    * **Στον editor** όποιου IDE χρησιμοποιείτε, μελετήστε τα σφάλματα του compiler για τις κλάσεις `HelloWorld_`(1,2,3 αντίστοιχα), διορθώστε τα (_στον editor_) και στη συνέχεια κάντε `compile` τις κλάσεις και εκτελέστε τες.

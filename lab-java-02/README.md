### Εργαστήριο #2 - Μεταβλητές, πρωτογενείς τύποι δεδομένων, μετατροπές, τελεστές, σχόλια, έλεγχος ροής
___
Σκοπός του δεύτερου εργαστηρίου είναι να εξοικειωθείτε με βασικά στοιχεία της γλώσσας προγραμματισμού Java: Μεταβλητές, πρωτογενείς τύποι δεδομένων, μετατροπές, τελεστές, σχόλια & έλεγχος ροής.  
Οι ασκήσεις αυτής της εβδομάδας είναι self-paced και υλοποιούνται μέσω του codecheck.  
Όπως και την περασμένη εβδομάδα, **υποβάλετε στο opencourses** τον αρχείο που κάνετε `Download` για την **τελευταία (μόνο) άσκηση (=αυτοαξιολόγησης)**.

___
#### Ασκήσεις εξάσκησης ####

1. ![EASY](https://github.com/riggas-ionio/java/blob/master/img/c5f015.png) `EASY`
Υπολογίστε το εμβαδόν παραλληλόγραμμου και εκτυπώστε το.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-101

2. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
   Ομοίως με πριν, με αξιοποίηση της κλάσης `java.util.Scanner` για είσοδο από το χρήστη. Στο codecheck η είσοδος δίνεται αυτόματα από το σύστημα, εσείς όμως πρέπει να προγραμματίσετε χρησιμοποιώντας την `Scanner`, δείτε διαφάνειες μαθήματος 25-27.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-102

2. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Υπολογίστε την κανονικοποιημένη τιμή μια γωνίας της οποίας την οποία διαβέζετε από την είσοδο του πληκτρολογίου. Η κανονικοποιημένη τιμή μιας γωνίας είναι μεταξύ `0..359`, άρα αρνητικές τιμές πρέπει να μετατραπούν στη συμπληρωματική γωνία στο διάστημα `0..359`, ενώ γωνίες `>=360` πρέπει να κανονικοποιηθούν στο πιο πάνω διάστημα.   
    **Tip** στο source που δίνεται, αλλάξτε στη γραμμή `15` το `print` σε `println`.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-108

3. ![HARD](https://github.com/riggas-ionio/java/blob/master/img/f03c15.png) `HARD`
   Υπολογίστε και εκτυπώστε την απόσταση μεταξύ δύο σημείων με συντεταγμένες `(x1, y1)` και  `(x2, y2)`. Ο τύπος της απόστασης είναι  
   $$\sqrt{(x_1-x_2)^2+(y_1-y_2)^2}$$  
   _Hint:_  Για τον υπολογισμό των πράξεων ύψωσης σε δύναμη και τετραγωνικής ρίζας, θα πρέπει να αξιοποιήσετε την βιβλιοθήκη κλάση `java.lang.Math`. Πριν τον κώδικα της κλάσης σας κάντε `import` τη βιβλιοθήκη, όπως ακριβώς γίνεται `import` και η `java.util.Scanner`. Για τον υμπολογισμό μιας δύναμης, πχ 3<sup>5</sup>, καλείτε `Math.pow(3,5)`, ενώ για τον υπολογισμό μιας τετραγωνικής ρίζας, πχ ρίζα του 3, καλείτε `Math.sqrt(3)`.  
   https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-103

3. ![HARD](https://github.com/riggas-ionio/java/blob/master/img/f03c15.png) `HARD`
    Υπολογίστε τη μελλοντική αξία μιας επένδυσης με δεδομένα την αρχική κατάθεση, το επιτόκιο και τη διάρκεια της επένδυσης.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-106

1. ![EASY](https://github.com/riggas-ionio/java/blob/master/img/c5f015.png) `EASY`
    Υπολογίστε το μικρότερο τριών ακεραίων.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-branch-104

1. ![EASY](https://github.com/riggas-ionio/java/blob/master/img/c5f015.png) `EASY`
    Υπολογίστε το χαρακτηρισμό φοίτησης στην κλίμακα `A..F` αναλόγως της αριθμητικής βαθμολογίας.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-branch-105

2. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Υπολογίστε το νέο υπόλοιπο ενός λογαριασμού όπως διαμορφώνεται μετά την εφαρμογή του ανάλογου επιτοκίου ή πέναλτυ.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-branch-108

1. ![EASY](https://github.com/riggas-ionio/java/blob/master/img/c5f015.png) `EASY`
    Υπολογίστε (**χωρίς χρήση** της `Math.pow()`, με επαναληπτικούς πολλαπλασιασμούς) την ύψωση ενός `double` σε μια `int` δύναμη.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-loop-106

2. ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Μετρήστε το πλήθος εμφανίζεων του ψηφίου `7` σε ένα πολυψήφιο ακέραιο.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-loop-105

#### Άσκηση αυτοαξιολόγησης ####
_**Επίλυση > codecheck > Download > Υποβολή στον opencourses**_

*  ![MEDI](https://github.com/riggas-ionio/java/blob/master/img/ffa500.png) `MEDI`
    Συμπληρώστε την κλάση `ConvertTemp` η οποία διαβάζει μία θερμοκρασία σε κλίμακα Fahenheit, τη μετατρέπει σε Celsius και Kelvin και εκτυπώνει και τις δύο.  
    _Hint:_  Θυμηθείτε, οι εκφράσεις έχουν `τύπο`, πχ μια **διαίρεση ακεραίων**, είναι **ακέραια διαίρεση**.  
    https://codecheck.io/files/wiley/codecheck-bjlo-1-fundat-110

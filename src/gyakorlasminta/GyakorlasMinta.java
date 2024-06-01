
package gyakorlasminta;

import java.util.Random;

public class GyakorlasMinta {

    private static int[] sorozat = new int[5];
    public static void main(String[] args) {
        
       //nem kell komment, de már töröltem így beraktam ezt
       feltolt();
       kiirTomb();
       feladatok();
        
    }

    private static void feladatok() {
        //az összes elemet végig kell nézni, amig nincs meg az eredmény (for ciklusosak)
        konzolraIr("Összegzés: " + osszegzes());
        konzolraIr("Van páratlan szám: " + eldontes1());
        konzolraIr("Az összes szám páratlan: " + eldontes2());
        konzolraIr("Páros számok száma: " + szamlalas());
        konzolraIr("Legnagyobb elem: " + maximum());
        konzolraIr("Legkisebb elem: " + minimum());
        konzolraIr("Kiválasztás: " + kivalasztas());
        konzolraIr("Lineáris keresés(5): " + linearisKereses(5));
    }

    private static int osszegzes(){
        int osszeg = 0;
        for (int elem : sorozat) {
            osszeg += elem;
        }
        //System.out.println("összeg: " + osszeg);
        return osszeg;
    }
    
    public static boolean eldontes1() { //van legalább 1 páratlan
        int i = 0;
        while (i < sorozat.length && !(sorozat[i] % 2 == 1)) {
            i++;
        }
        return i < sorozat.length;
    }
    
    public static boolean eldontes2() { // minden szám páratlan
    for (int elem : sorozat) {
        if (elem % 2 == 0) { // ha a szám páros
            return false; // akkor nincs minden szám páratlan
        }
    }
    return true; // ha nem találtunk páros számot, akkor minden szám páratlan
}
    
    private static int szamlalas() {
        int szamol = 0;
        for (int elem : sorozat) {
            if (elem % 2 == 0) {
                szamol++;
            }
        }
        return szamol;
    }
    
    private static int maximum() {
        int max = sorozat[0];
        for (int elem : sorozat) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }
    
    private static int minimum() {
        int min = sorozat[0];
        for (int elem : sorozat) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }
    
   private static int kivalasztas() { //első páros számot kiírja
        for (int elem : sorozat) {
            if (elem % 2 == 0) {
                return elem;
            }
        }
        return -1;
    }
    
   private static int linearisKereses(int keresettElem) {
    for (int i = 0; i < sorozat.length; i++) {
        if (sorozat[i] == keresettElem) {
            return i; // visszaadjuk az elem indexét
        }
    }
    return -1; // ha az elem nem található a tömbben
}
   
    
    
    private static void konzolraIr(String kimenet) {
        System.out.println(kimenet);
    }

    private static void feltolt() {
        Random rand = new Random();
        for (int i = 0; i < sorozat.length; i++) {
            sorozat[i] = rand.nextInt(11); //0 és 10 közötti szám
    }
    
}

    private static void kiirTomb() {
        System.out.print("A tömb elemei: ");
        for (int elem : sorozat) {
            System.out.print(elem + ", ");
        }
        System.out.println();
    }

}
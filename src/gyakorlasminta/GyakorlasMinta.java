
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
        konzolraIr("Van páratlan szám: " + eldontes());
        konzolraIr("Páros számok száma: " + szamlalas());
        konzolraIr("Legnagyobb elem: " + maximum());
        konzolraIr("Legkisebb elem: " + minimum());
        konzolraIr("Kiválasztás: " + kivalasztas());
    }

    private static int osszegzes(){
        int osszeg = 0;
        for (int elem : sorozat) {
            osszeg += elem;
        }
        //System.out.println("összeg: " + osszeg);
        return osszeg;
    }
    
    public static boolean eldontes() {
        return false;
    }
    
    private static int szamlalas() {
        return 0;
    }
    
    private static int maximum() {
        return 0;
    }
    
    private static int minimum() {
        return 0;
    }
    
   private static int kivalasztas() {
        return 0;
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
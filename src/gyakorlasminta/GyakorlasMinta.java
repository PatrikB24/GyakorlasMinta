
package gyakorlasminta;

public class GyakorlasMinta {

    private static int[] sorozat;/* = {3, 1, 7, 2};*/
    public static void main(String[] args) {
        
       //nem kell komment, de már töröltem így beraktam ezt
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
        return 0;
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
    
}

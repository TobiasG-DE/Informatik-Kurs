import java.lang.Math;
class RadDesTheodorus{
    /*
    Pseudo-Code
    funktion rechne(double hypo, int zahl)
        FALLS zahl == ende
            RÜCKGABE hypo
        SONST
            RÜCKGABE rechne(Wurzel aus hypo zum Quadrat plus eins, zahl plus eins)
    ENDE0
     */
    static double calc(double hyp, int zahl){
        if(zahl == end) return hyp;
        return calc(((Math.sqrt(hyp * hyp)) + 1), zahl+1);
    }
    
    /*
    Pseudo-Code
    funktion calc2
        RÜCKGABE WURZEL AUS ( WURZEL AUS GRAD * WURZEL AUS GRAD ) + 1
    ende
     */
    static double calc2(int grad){
        return Math.sqrt((Math.sqrt(grad) * Math.sqrt(grad)) + 1);
    }
}

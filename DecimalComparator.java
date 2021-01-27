public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

int aa=(int) a;
int bb=(int) b;
if(aa==bb) {
    double aaa = a - aa;
    double bbb = b - bb;
    aaa=aaa*1000;
    bbb=bbb*1000;
    int x=(int) aaa;
    int y=(int) bbb;
    System.out.println(x);
    System.out.println(y);
    if (x == y) {
        return true;
    }
    else 
        return false;
}
return false;

}

    
}
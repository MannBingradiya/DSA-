public class Holidays{
    private String name;
    private int day;
    private String month;

    public Holidays(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    void diaplay(){
        System.out.println(name + " " + day + " " + month);
    }

    public static void main(String[] args) {
        Holidays h1 = new Holidays("Makarsankranti",15,"jan");
        Holidays h2 = new Holidays("Republic day",26,"jan");
        Holidays h3 = new Holidays("Mahashivratri",18,"feb");
        Holidays h4 = new Holidays("Holi",06,"march");
        h1.diaplay();
        System.out.println(h1.avgDate(new Holidays[]{h1,h2,h3,h4}));
        h2.inSameMonth(h3.month);


    }
    boolean inSameMonth(String month){
        if (this.month.equals(month)){
            return true;
        }
        return false;
    }

    double avgDate(Holidays[] h1) {
        double sum = 0;
        for (int i = 0; i < h1.length; i++) {
            sum += h1[i].day;
        }
        return sum / h1.length;
    }

}

class Aggr
{
    int method(int n)
    {
        return n+n*n;
    }
}
public class Aggregation {
    Aggr agr;
    double functiont(int r)
    {
        agr=new Aggr();
        int y=agr.method(r);
        return y*2.5;
    }
    public static void main(String[] args) {
        Aggregation obj=new Aggregation();
        double result=obj.functiont(6);
        System.out.println(result);
    }
}

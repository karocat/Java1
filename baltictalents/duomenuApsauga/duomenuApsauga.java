package lt.baltictalents.duomenuApsauga;

public class duomenuApsauga {
    public static void main(String[] args){
        Data dt = new Data();
        System.out.print(dt.getData());
    }
}

class Data{
    private String data = "asdf";

    public Data(String data) {
        this.data = data;
    }

    public Data(){}

    // inkapsuliacija
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


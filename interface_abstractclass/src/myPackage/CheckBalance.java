package myPackage;

public class CheckBalance {
    String name;
    Double bal;
    public CheckBalance(String name, Double bal){
        this.bal=bal;
        this.name=name;
    }
    public void show(){
        if(bal<0)
        {
            System.out.println("insufficient amount>>");

        }
        System.out.print(name+"$"+bal);
    }
}

package fileio;

public class  Account implements Cloneable{

    String no;
    String type;

    public Account(String no, String type) {
        this.no = no;
        this.type = type;
    }


    @Override
    protected Account clone() throws
            CloneNotSupportedException
    {
        return (Account) super.clone();
    }

}

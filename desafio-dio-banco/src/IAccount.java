public interface IAccount {
    public abstract void draw(double value);
    public abstract void cash(double value);
    public abstract void transfer(Account accountDestiny, double value);
}

import java.rmi.*;
public interface Search extends Remote
{
    public String query(int[] search) throws RemoteException;
}

import java.rmi.*;
import java.rmi.server.*;
public class SearchQuery extends UnicastRemoteObject
                         implements Search
{
    // Default constructor to throw RemoteException
    // from its parent constructor
    SearchQuery() throws RemoteException
    {
        super();
    }
 
    // Implementation of the query interface
    public String query(int[] search)
                       throws RemoteException
    {
        int result = search[0] + search[1];
        return String.valueOf(result);
    }
}

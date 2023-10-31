package WalletServiceTest.DomainTest;

import WalletService.Infrastructure.InfoCollection;
import java.util.ArrayList;

public class Player
{
    private String Login;
    private String Password;
    private int Balance;
    private ArrayList<String> Log;
    private InfoCollection infoCollection;

    public Player()
    {
        infoCollection = new InfoCollection();
    }

    public void SetLogin(String login)
    {
        Login = login;
    }

    public void SetPassword(String password)
    {
        Password = password;
    }

    public void SetBalance()
    {
        Balance = infoCollection.GetBalance(Login);
    }

    public void SetLog()
    {
        Log = infoCollection.GetLogOfTransactions(Login);
    }

    public void setInfoCollection(InfoCollection infoCollection)
    {
        this.infoCollection = infoCollection;
    }

    public boolean CheckingLogin()
    {
        return infoCollection.CheckingPresence(Login);
    }

    public boolean CheckingPassword()
    {
        return infoCollection.GetPassword(Login).contains(Password);
    }

    public boolean CreatingNewPlayer()
    {
        if (infoCollection.CheckingPresence(Login))
            return false;
        else
        {
            infoCollection.AddPlayer(this.Login, this.Password, 0);
            return true;
        }
    }

    public int getBalance()
    {
        return Balance;
    }

    public ArrayList<String> getLog()
    {
        return Log;
    }
}

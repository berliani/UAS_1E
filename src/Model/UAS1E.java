package Model;

import java.util.ArrayList;

public class UAS1E {
    public String UserID;
    public String UserName;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<Messages> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<Messages> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public ArrayList<Messages> MY_MESSAGES;

    public void ShowPosts(UAS1E social) {

    }
    public class Messages{

    }
}

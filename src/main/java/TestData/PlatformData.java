package TestData;

import TestData.Data.LoginData;
import TestData.Data.WorkspaceData;

public class PlatformData {

    private LoginData loginData;
    private WorkspaceData workspaceData;


    public PlatformData(){

        loginData = new LoginData();
        workspaceData = new WorkspaceData();

    }

    public LoginData getLoginData(){
         return loginData;
    }

    public WorkspaceData getWorkspaceData(){

        return workspaceData;
    }

}

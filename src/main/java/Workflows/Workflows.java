package Workflows;

import Workflows.e6DataWorkflows.NavigateToCatalogList;
import Workflows.e6DataWorkflows.NavigateToClusterList;
import Workflows.e6DataWorkflows.NavigateToWorkspaceList;

public class Workflows {

    public static NavigateToWorkspaceList WorkspaceWF(){

        return new NavigateToWorkspaceList();

    }

    public static NavigateToCatalogList CatalogWF(){

        return new NavigateToCatalogList();

    }

     public static NavigateToClusterList ClusterWF(){

        return new NavigateToClusterList();

    }

}
